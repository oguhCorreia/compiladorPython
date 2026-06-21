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

        print(f"Atribuição: {name} {op} {right}")
        return self.vars[name]

    def visitPrint_stmt(self, ctx:PythonParser.Print_stmtContext):
        args = [str(self.visit(e)) for e in ctx.expr()]
        resultado = ' '.join(args)
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

    def visitFunc(self, ctx:PythonParser.FuncContext):
        name = ctx.ID(0).getText()
        
        params = [p.getText() for p in ctx.ID()[1:]]
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

        old_vars = self.vars.copy()

        for param, arg in zip(params, args):
            self.vars[param] = arg
  
            print(f"Atribuição (Parâmetro): {param} = {arg}")

        try:
            self.visit(block)
            return_value = None
        except ReturnException as e:
            return_value = e.value

        for param in params:
            if param in old_vars:
                self.vars[param] = old_vars[param]
            else:
                self.vars.pop(param, None)

        return return_value
        try:
            for stat in func_data['body']:
                self.visit(stat)
        except ReturnException as e:
            result = e.value
            print(f"  -> [RETURN] A função retornou o valor: {result}")
        finally:
            self.vars = old_vars
        
        return result

    def visitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        while self.visit(ctx.expr()):
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
        if ctx.NOT(): return not self.visit(ctx.expr(0))
        if ctx.AND(): return self.visit(ctx.expr(0)) and self.visit(ctx.expr(1))
        if ctx.OR():  return self.visit(ctx.expr(0)) or self.visit(ctx.expr(1))
        
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

    def visitQuery(self, ctx:PythonParser.QueryContext):
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

        return False

    def visitCondicional(self, ctx:PythonParser.CondicionalContext):
        expressions = ctx.expr()
        blocks = ctx.block()

        for i in range(len(expressions)):
            if self.visit(expressions[i]):
                self.visit(blocks[i])
                return None

        if len(blocks) > len(expressions):
            self.visit(blocks[-1])

        return None

    def visitReturn_stmt(self, ctx: PythonParser.Return_stmtContext):
        value = self.visit(ctx.expr()) if ctx.expr() else None
        raise ReturnException(value)

del (PythonParser, PythonParserVisitor)