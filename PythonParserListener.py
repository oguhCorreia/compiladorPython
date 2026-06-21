# Generated from PythonParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .PythonParser import PythonParser
else:
    from PythonParser import PythonParser

# This class defines a complete listener for a parse tree produced by PythonParser.
class PythonParserListener(ParseTreeListener):

    # Enter a parse tree produced by PythonParser#code.
    def enterCode(self, ctx:PythonParser.CodeContext):
        pass

    # Exit a parse tree produced by PythonParser#code.
    def exitCode(self, ctx:PythonParser.CodeContext):
        pass


    # Enter a parse tree produced by PythonParser#stat.
    def enterStat(self, ctx:PythonParser.StatContext):
        pass

    # Exit a parse tree produced by PythonParser#stat.
    def exitStat(self, ctx:PythonParser.StatContext):
        pass


    # Enter a parse tree produced by PythonParser#block.
    def enterBlock(self, ctx:PythonParser.BlockContext):
        pass

    # Exit a parse tree produced by PythonParser#block.
    def exitBlock(self, ctx:PythonParser.BlockContext):
        pass


    # Enter a parse tree produced by PythonParser#op_assignment.
    def enterOp_assignment(self, ctx:PythonParser.Op_assignmentContext):
        pass

    # Exit a parse tree produced by PythonParser#op_assignment.
    def exitOp_assignment(self, ctx:PythonParser.Op_assignmentContext):
        pass


    # Enter a parse tree produced by PythonParser#op_mult.
    def enterOp_mult(self, ctx:PythonParser.Op_multContext):
        pass

    # Exit a parse tree produced by PythonParser#op_mult.
    def exitOp_mult(self, ctx:PythonParser.Op_multContext):
        pass


    # Enter a parse tree produced by PythonParser#op_add.
    def enterOp_add(self, ctx:PythonParser.Op_addContext):
        pass

    # Exit a parse tree produced by PythonParser#op_add.
    def exitOp_add(self, ctx:PythonParser.Op_addContext):
        pass


    # Enter a parse tree produced by PythonParser#op_comp.
    def enterOp_comp(self, ctx:PythonParser.Op_compContext):
        pass

    # Exit a parse tree produced by PythonParser#op_comp.
    def exitOp_comp(self, ctx:PythonParser.Op_compContext):
        pass


    # Enter a parse tree produced by PythonParser#assignment.
    def enterAssignment(self, ctx:PythonParser.AssignmentContext):
        pass

    # Exit a parse tree produced by PythonParser#assignment.
    def exitAssignment(self, ctx:PythonParser.AssignmentContext):
        pass


    # Enter a parse tree produced by PythonParser#print_stmt.
    def enterPrint_stmt(self, ctx:PythonParser.Print_stmtContext):
        pass

    # Exit a parse tree produced by PythonParser#print_stmt.
    def exitPrint_stmt(self, ctx:PythonParser.Print_stmtContext):
        pass


    # Enter a parse tree produced by PythonParser#input_stmt.
    def enterInput_stmt(self, ctx:PythonParser.Input_stmtContext):
        pass

    # Exit a parse tree produced by PythonParser#input_stmt.
    def exitInput_stmt(self, ctx:PythonParser.Input_stmtContext):
        pass


    # Enter a parse tree produced by PythonParser#return_stmt.
    def enterReturn_stmt(self, ctx:PythonParser.Return_stmtContext):
        pass

    # Exit a parse tree produced by PythonParser#return_stmt.
    def exitReturn_stmt(self, ctx:PythonParser.Return_stmtContext):
        pass


    # Enter a parse tree produced by PythonParser#break_stmt.
    def enterBreak_stmt(self, ctx:PythonParser.Break_stmtContext):
        pass

    # Exit a parse tree produced by PythonParser#break_stmt.
    def exitBreak_stmt(self, ctx:PythonParser.Break_stmtContext):
        pass


    # Enter a parse tree produced by PythonParser#continue_stmt.
    def enterContinue_stmt(self, ctx:PythonParser.Continue_stmtContext):
        pass

    # Exit a parse tree produced by PythonParser#continue_stmt.
    def exitContinue_stmt(self, ctx:PythonParser.Continue_stmtContext):
        pass


    # Enter a parse tree produced by PythonParser#pass_stmt.
    def enterPass_stmt(self, ctx:PythonParser.Pass_stmtContext):
        pass

    # Exit a parse tree produced by PythonParser#pass_stmt.
    def exitPass_stmt(self, ctx:PythonParser.Pass_stmtContext):
        pass


    # Enter a parse tree produced by PythonParser#import_stmt.
    def enterImport_stmt(self, ctx:PythonParser.Import_stmtContext):
        pass

    # Exit a parse tree produced by PythonParser#import_stmt.
    def exitImport_stmt(self, ctx:PythonParser.Import_stmtContext):
        pass


    # Enter a parse tree produced by PythonParser#func.
    def enterFunc(self, ctx:PythonParser.FuncContext):
        pass

    # Exit a parse tree produced by PythonParser#func.
    def exitFunc(self, ctx:PythonParser.FuncContext):
        pass


    # Enter a parse tree produced by PythonParser#class_def.
    def enterClass_def(self, ctx:PythonParser.Class_defContext):
        pass

    # Exit a parse tree produced by PythonParser#class_def.
    def exitClass_def(self, ctx:PythonParser.Class_defContext):
        pass


    # Enter a parse tree produced by PythonParser#try_except.
    def enterTry_except(self, ctx:PythonParser.Try_exceptContext):
        pass

    # Exit a parse tree produced by PythonParser#try_except.
    def exitTry_except(self, ctx:PythonParser.Try_exceptContext):
        pass


    # Enter a parse tree produced by PythonParser#condicional.
    def enterCondicional(self, ctx:PythonParser.CondicionalContext):
        pass

    # Exit a parse tree produced by PythonParser#condicional.
    def exitCondicional(self, ctx:PythonParser.CondicionalContext):
        pass


    # Enter a parse tree produced by PythonParser#loop_while.
    def enterLoop_while(self, ctx:PythonParser.Loop_whileContext):
        pass

    # Exit a parse tree produced by PythonParser#loop_while.
    def exitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        pass


    # Enter a parse tree produced by PythonParser#loop_for.
    def enterLoop_for(self, ctx:PythonParser.Loop_forContext):
        pass

    # Exit a parse tree produced by PythonParser#loop_for.
    def exitLoop_for(self, ctx:PythonParser.Loop_forContext):
        pass


    # Enter a parse tree produced by PythonParser#func_call.
    def enterFunc_call(self, ctx:PythonParser.Func_callContext):
        pass

    # Exit a parse tree produced by PythonParser#func_call.
    def exitFunc_call(self, ctx:PythonParser.Func_callContext):
        pass


    # Enter a parse tree produced by PythonParser#expr.
    def enterExpr(self, ctx:PythonParser.ExprContext):
        pass

    # Exit a parse tree produced by PythonParser#expr.
    def exitExpr(self, ctx:PythonParser.ExprContext):
        pass


    # Enter a parse tree produced by PythonParser#lista.
    def enterLista(self, ctx:PythonParser.ListaContext):
        pass

    # Exit a parse tree produced by PythonParser#lista.
    def exitLista(self, ctx:PythonParser.ListaContext):
        pass


    # Enter a parse tree produced by PythonParser#tupla.
    def enterTupla(self, ctx:PythonParser.TuplaContext):
        pass

    # Exit a parse tree produced by PythonParser#tupla.
    def exitTupla(self, ctx:PythonParser.TuplaContext):
        pass


    # Enter a parse tree produced by PythonParser#dicionario.
    def enterDicionario(self, ctx:PythonParser.DicionarioContext):
        pass

    # Exit a parse tree produced by PythonParser#dicionario.
    def exitDicionario(self, ctx:PythonParser.DicionarioContext):
        pass


    # Enter a parse tree produced by PythonParser#conjunto.
    def enterConjunto(self, ctx:PythonParser.ConjuntoContext):
        pass

    # Exit a parse tree produced by PythonParser#conjunto.
    def exitConjunto(self, ctx:PythonParser.ConjuntoContext):
        pass



del PythonParser