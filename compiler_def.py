if "." in __name__:
    from .PythonParser import PythonParser
    from .PythonParserVisitor import PythonParserVisitor
else:
    from PythonParser import PythonParser
    from PythonParserVisitor import PythonParserVisitor

class ReturnException(Exception):
    def __init__(self, value):
        self.value = value

class Compiler(PythonParserVisitor):
    _Parser = PythonParser

    def __init__(self):
        super(Compiler, self).__init__()
        self.vars = {}
        self.funcs = {}

    def visit(self, ctx):
        if not hasattr(ctx, 'getRuleIndex'):
            return None

        rule_name = self._Parser.ruleNames[ctx.getRuleIndex()]
        method_name = 'visit' + rule_name[0].upper() + rule_name[1:]

        method = getattr(self, method_name, self.visitChildren)
        return method(ctx)

    def visitCode(self, ctx:PythonParser.CodeContext):
        print("\n=== INÍCIO DA EXECUÇÃO DO COMPILADOR ===")
        if ctx.children:
            for child in ctx.children:
                if child.getText() != '<EOF>':
                    self.visit(child)
        print("=== FIM DA EXECUÇÃO ===\n")
        return None

    def visitStat(self, ctx:PythonParser.StatContext):
        if ctx.children:
            return self.visit(ctx.getChild(0))
        return None

    def visitAssignment(self, ctx:PythonParser.AssignmentContext):
        name = ctx.ID().getText()
        op = ctx.op_assignment().getText()
        right = self.visit(ctx.expr())

        if op == '=': self.vars[name] = right
        elif op == '+=': self.vars[name] = self.vars.get(name, 0) + right
        elif op == '-=': self.vars[name] = self.vars.get(name, 0) - right
        elif op == '*=': self.vars[name] = self.vars.get(name, 0) * right
        elif op == '/=': self.vars[name] = self.vars.get(name, 0) / right
        elif op == '%=': self.vars[name] = self.vars.get(name, 0) % right
        elif op == '//=': self.vars[name] = self.vars.get(name, 0) // right

        print(f"Atribuição: {name} {op} {right}")
        return self.vars[name]

    def visitPrint_stmt(self, ctx: PythonParser.Print_stmtContext):
        results = []
        for child in ctx.children:
            rule = getattr(child, 'getRuleIndex', None)
            if rule is None:
                continue
            rule_name = self._Parser.ruleNames[child.getRuleIndex()]
            if rule_name in ('expr', 'query'):
                results.append(str(self.visit(child)))
        resultado = ' '.join(results)
        print(f"> [PRINT]: {resultado}")
        return None

    def visitInput_stmt(self, ctx:PythonParser.Input_stmtContext):
        var_name = ctx.ID().getText()
        prompt = ctx.STRING().getText().strip('"\'') if ctx.STRING() else ""
        print(f"[LOG - INPUT] A aguardar entrada do utilizador para a variável '{var_name}'...")
        inp = input(prompt)
        try:
            value = float(inp) if '.' in inp else int(inp)
        except ValueError:
            value = inp
        self.vars[var_name] = value
        print(f"[LOG - INPUT] Recebido: {value} (Tipo: {type(value).__name__})")
        return value

    def visitFunc(self, ctx: PythonParser.FuncContext):
        name = ctx.ID().getText()
        params = [p.ID().getText() for p in ctx.param()]
        block = ctx.block()
        self.funcs[name] = (params, block)
        return None

    def visitBlock(self, ctx:PythonParser.BlockContext):
        for stat in ctx.stat():
            self.visit(stat)
        return None

    def visitFunc_call(self, ctx:PythonParser.Func_callContext):
        name = ctx.ID().getText()

        if name in ['len', 'type', 'range']:
            args = [self.visit(arg) for arg in ctx.expr()]
            if name == 'len':
                return len(args[0])
            elif name == 'type':
                return str(type(args[0]))
            elif name == 'range':
                if len(args) == 1: return list(range(args[0]))
                if len(args) == 2: return list(range(args[0], args[1]))
                if len(args) == 3: return list(range(args[0], args[1], args[2]))

        if name not in self.funcs:
            raise NameError(f"Função '{name}' não definida.")

        params, block = self.funcs[name]
        args = [self.visit(arg) for arg in ctx.expr()]

        if len(args) != len(params):
            raise TypeError(f"Função '{name}' esperava {len(params)} argumentos, recebeu {len(args)}.")

        # Guarda apenas os params que já existem no scope atual
        saved_params = {p: self.vars[p] for p in params if p in self.vars}

        for param, arg in zip(params, args):
            self.vars[param] = arg
            print(f"Atribuição (Parâmetro): {param} = {arg}")

        try:
            self.visit(block)
            return_value = None
        except ReturnException as e:
            return_value = e.value
        finally:
            # Remove os params da função do scope
            for p in params:
                self.vars.pop(p, None)
            # Restaura os que existiam antes com o valor original
            self.vars.update(saved_params)

        return return_value

    def visitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        while self.visit(ctx.query()):
            self.visit(ctx.block())
        return None

    def visitLoop_for(self, ctx:PythonParser.Loop_forContext):
        var_name = ctx.ID().getText()
        iterable = self.visit(ctx.expr())

        for item in iterable:
            self.vars[var_name] = item
            # Mostra a atribuição implícita que acontece dentro do ciclo For
            print(f"Atribuição (For): {var_name} = {item}")
            self.visit(ctx.block())
        return None

    def visitExpr(self, ctx:PythonParser.ExprContext):
        if ctx.TRUE(): return True
        if ctx.FALSE(): return False
        
        if ctx.ID():
            id_name = ctx.ID().getText()
            if id_name not in self.vars:
                raise NameError(f"Variável '{id_name}' não definida.")
            return self.vars[id_name]
        
        if ctx.INT(): return int(ctx.INT().getText())
        if ctx.FLOAT(): return float(ctx.FLOAT().getText())
        if ctx.STRING(): return ctx.STRING().getText().strip('"\'')

        if ctx.LPAREN() and len(ctx.expr()) == 1: return self.visit(ctx.expr(0))

        if ctx.func_call(): 
            res = self.visit(ctx.func_call())

            if isinstance(res, type):
                return str(res)
            return res

        if ctx.lista(): return self.visit(ctx.lista())
        if ctx.tupla(): return self.visit(ctx.tupla())
        if ctx.dicionario(): return self.visit(ctx.dicionario())
        
        if ctx.conjunto(): return list(self.visit(ctx.conjunto()))

        if ctx.POW(): return self.visit(ctx.expr(0)) ** self.visit(ctx.expr(1))

        if ctx.op_mult():
            op = ctx.op_mult().getText()
            left = self.visit(ctx.expr(0))
            right = self.visit(ctx.expr(1))
            if op == '*': return left * right
            if op == '/': return left / right
            if op == '%': return left % right
            if op == '//': return left // right

        if ctx.op_add():
            op = ctx.op_add().getText()
            left = self.visit(ctx.expr(0))
            right = self.visit(ctx.expr(1))
            if op == '+': return left + right
            if op == '-': return left - right

        return self.visitChildren(ctx)

    def visitLista(self, ctx:PythonParser.ListaContext):
        return [self.visit(expr) for expr in ctx.expr()]

    def visitTupla(self, ctx:PythonParser.TuplaContext):
        return tuple(self.visit(expr) for expr in ctx.expr())

    def visitDicionario(self, ctx:PythonParser.DicionarioContext):
        d = {}
        exprs = ctx.expr()
        for i in range(0, len(exprs), 2):
            k = self.visit(exprs[i])
            v = self.visit(exprs[i + 1])
            d[k] = v
        return d

    def visitConjunto(self, ctx:PythonParser.ConjuntoContext):
        elementos = [self.visit(e) for e in ctx.expr()]
        return set(elementos)

    def visitQuery(self, ctx: PythonParser.QueryContext):
        if ctx.TRUE(): return True
        if ctx.FALSE(): return False

        if ctx.op_comp():
            op = ctx.op_comp().getText()
            left = self.visit(ctx.expr(0))
            right = self.visit(ctx.expr(1))
            if op == '==': return left == right
            if op == '!=': return left != right
            if op == '<':  return left < right
            if op == '>':  return left > right
            if op == '<=': return left <= right
            if op == '>=': return left >= right

        if ctx.NOT(): return not self.visit(ctx.query(0))
        if ctx.AND(): return self.visit(ctx.query(0)) and self.visit(ctx.query(1))
        if ctx.OR():  return self.visit(ctx.query(0)) or self.visit(ctx.query(1))

        if ctx.LPAREN(): return self.visit(ctx.query(0))

        raise RuntimeError(f"Condição não reconhecida: '{ctx.getText()}'")

    def visitCondicional(self, ctx:PythonParser.CondicionalContext):
        queries = ctx.query()
        blocks = ctx.block()

        for i in range(len(queries)):
            if self.visit(queries[i]):
                self.visit(blocks[i])
                return None

        if len(blocks) > len(queries):
            self.visit(blocks[-1])

        return None

    def visitReturn_stmt(self, ctx: PythonParser.Return_stmtContext):
        value = self.visit(ctx.expr()) if ctx.expr() else None
        raise ReturnException(value)

    def visitTry_except(self, ctx: PythonParser.Try_exceptContext):
        blocks = ctx.block()
        try:
            self.visit(blocks[0])
        except Exception as e:
            has_finally = ctx.FINALLY() is not None
            except_blocks = blocks[1:-1] if has_finally else blocks[1:]
            
            if except_blocks:
                for b in except_blocks:
                    self.visit(b)
            else:
                raise
        finally:
            if ctx.FINALLY() is not None:
                self.visit(blocks[-1])
                
del (PythonParser, PythonParserVisitor)