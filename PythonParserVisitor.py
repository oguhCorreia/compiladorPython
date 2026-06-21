# Generated from PythonParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .PythonParser import PythonParser
else:
    from PythonParser import PythonParser

# This class defines a complete generic visitor for a parse tree produced by PythonParser.

class PythonParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PythonParser#code.
    def visitCode(self, ctx:PythonParser.CodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#stat.
    def visitStat(self, ctx:PythonParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#block.
    def visitBlock(self, ctx:PythonParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#op_assignment.
    def visitOp_assignment(self, ctx:PythonParser.Op_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#op_mult.
    def visitOp_mult(self, ctx:PythonParser.Op_multContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#op_add.
    def visitOp_add(self, ctx:PythonParser.Op_addContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#op_comp.
    def visitOp_comp(self, ctx:PythonParser.Op_compContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#assignment.
    def visitAssignment(self, ctx:PythonParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#print_stmt.
    def visitPrint_stmt(self, ctx:PythonParser.Print_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#input_stmt.
    def visitInput_stmt(self, ctx:PythonParser.Input_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#return_stmt.
    def visitReturn_stmt(self, ctx:PythonParser.Return_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#break_stmt.
    def visitBreak_stmt(self, ctx:PythonParser.Break_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#continue_stmt.
    def visitContinue_stmt(self, ctx:PythonParser.Continue_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#pass_stmt.
    def visitPass_stmt(self, ctx:PythonParser.Pass_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#import_stmt.
    def visitImport_stmt(self, ctx:PythonParser.Import_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func.
    def visitFunc(self, ctx:PythonParser.FuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#class_def.
    def visitClass_def(self, ctx:PythonParser.Class_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#try_except.
    def visitTry_except(self, ctx:PythonParser.Try_exceptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#condicional.
    def visitCondicional(self, ctx:PythonParser.CondicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_while.
    def visitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_for.
    def visitLoop_for(self, ctx:PythonParser.Loop_forContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func_call.
    def visitFunc_call(self, ctx:PythonParser.Func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#expr.
    def visitExpr(self, ctx:PythonParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#lista.
    def visitLista(self, ctx:PythonParser.ListaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#tupla.
    def visitTupla(self, ctx:PythonParser.TuplaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#dicionario.
    def visitDicionario(self, ctx:PythonParser.DicionarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#conjunto.
    def visitConjunto(self, ctx:PythonParser.ConjuntoContext):
        return self.visitChildren(ctx)



del PythonParser