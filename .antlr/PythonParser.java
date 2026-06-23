// Generated from /Users/hugocorreia/Desktop/faculdade/Teoria dos Automatos e Compiladores/compiladorPython/PythonParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELIF=2, ELSE=3, AND=4, OR=5, NOT=6, TRUE=7, FALSE=8, DEF=9, CLASS=10, 
		TRY=11, EXCEPT=12, FINALLY=13, IN=14, WHILE=15, FOR=16, PRINT=17, INPUT=18, 
		RETURN=19, BREAK=20, CONTINUE=21, IMPORT=22, FROM=23, AS=24, WITH=25, 
		PASS=26, ASSIGN=27, PLUS_ASSIGN=28, MINUS_ASSIGN=29, MULT_ASSIGN=30, DIV_ASSIGN=31, 
		FLOOR_DIV_ASSIGN=32, MOD_ASSIGN=33, PLUS=34, MINUS=35, MULT=36, DIV=37, 
		MOD=38, POW=39, FLOOR_DIV=40, EQ=41, NEQ=42, LTE=43, GTE=44, LT=45, GT=46, 
		COLON=47, COMMA=48, LPAREN=49, RPAREN=50, LBRACK=51, RBRACK=52, LBRACE=53, 
		RBRACE=54, ID=55, FLOAT=56, INT=57, STRING=58, ARROW=59, EMPTY_LINE=60, 
		NEWLINE=61, INDENT=62, SPACES=63, COMMENT=64;
	public static final int
		RULE_code = 0, RULE_stat = 1, RULE_block = 2, RULE_op_assignment = 3, 
		RULE_op_mult = 4, RULE_op_add = 5, RULE_op_comp = 6, RULE_assignment = 7, 
		RULE_print_stmt = 8, RULE_input_stmt = 9, RULE_return_stmt = 10, RULE_break_stmt = 11, 
		RULE_continue_stmt = 12, RULE_pass_stmt = 13, RULE_import_stmt = 14, RULE_func = 15, 
		RULE_class_def = 16, RULE_try_except = 17, RULE_condicional = 18, RULE_loop_while = 19, 
		RULE_loop_for = 20, RULE_func_call = 21, RULE_expr = 22, RULE_query = 23, 
		RULE_param = 24, RULE_lista = 25, RULE_tupla = 26, RULE_dicionario = 27, 
		RULE_conjunto = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "stat", "block", "op_assignment", "op_mult", "op_add", "op_comp", 
			"assignment", "print_stmt", "input_stmt", "return_stmt", "break_stmt", 
			"continue_stmt", "pass_stmt", "import_stmt", "func", "class_def", "try_except", 
			"condicional", "loop_while", "loop_for", "func_call", "expr", "query", 
			"param", "lista", "tupla", "dicionario", "conjunto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elif'", "'else'", "'and'", "'or'", "'not'", "'True'", 
			"'False'", "'def'", "'class'", "'try'", "'except'", "'finally'", "'in'", 
			"'while'", "'for'", "'print'", "'input'", "'return'", "'break'", "'continue'", 
			"'import'", "'from'", "'as'", "'with'", "'pass'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'//='", "'%='", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", 
			"'//'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "':'", "','", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", null, null, null, null, "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELIF", "ELSE", "AND", "OR", "NOT", "TRUE", "FALSE", "DEF", 
			"CLASS", "TRY", "EXCEPT", "FINALLY", "IN", "WHILE", "FOR", "PRINT", "INPUT", 
			"RETURN", "BREAK", "CONTINUE", "IMPORT", "FROM", "AS", "WITH", "PASS", 
			"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", 
			"FLOOR_DIV_ASSIGN", "MOD_ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
			"POW", "FLOOR_DIV", "EQ", "NEQ", "LTE", "GTE", "LT", "GT", "COLON", "COMMA", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "ID", "FLOAT", 
			"INT", "STRING", "ARROW", "EMPTY_LINE", "NEWLINE", "INDENT", "SPACES", 
			"COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2858096913603596162L) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(58);
					match(NEWLINE);
					}
					break;
				case IF:
				case TRUE:
				case FALSE:
				case TRY:
				case WHILE:
				case FOR:
				case PRINT:
				case RETURN:
				case BREAK:
				case CONTINUE:
				case IMPORT:
				case FROM:
				case PASS:
				case LPAREN:
				case LBRACK:
				case LBRACE:
				case ID:
				case FLOAT:
				case INT:
				case STRING:
					{
					setState(59);
					stat();
					}
					break;
				case DEF:
					{
					setState(60);
					func();
					}
					break;
				case CLASS:
					{
					setState(61);
					class_def();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public Try_exceptContext try_except() {
			return getRuleContext(Try_exceptContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Loop_whileContext loop_while() {
			return getRuleContext(Loop_whileContext.class,0);
		}
		public Loop_forContext loop_for() {
			return getRuleContext(Loop_forContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				print_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				input_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				return_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				break_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				continue_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				import_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				pass_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				try_except();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(78);
				expr(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(79);
				condicional();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(80);
				loop_while();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(81);
				loop_for();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(PythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(PythonParser.INDENT, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(NEWLINE);
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(97); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(89);
					match(INDENT);
					setState(90);
					stat();
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(91);
							match(NEWLINE);
							}
							} 
						}
						setState(96);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_assignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(PythonParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(PythonParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(PythonParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(PythonParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(PythonParser.MOD_ASSIGN, 0); }
		public TerminalNode FLOOR_DIV_ASSIGN() { return getToken(PythonParser.FLOOR_DIV_ASSIGN, 0); }
		public Op_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_assignment; }
	}

	public final Op_assignmentContext op_assignment() throws RecognitionException {
		Op_assignmentContext _localctx = new Op_assignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_op_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17045651456L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_multContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(PythonParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PythonParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PythonParser.MOD, 0); }
		public TerminalNode FLOOR_DIV() { return getToken(PythonParser.FLOOR_DIV, 0); }
		public Op_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mult; }
	}

	public final Op_multContext op_mult() throws RecognitionException {
		Op_multContext _localctx = new Op_multContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_op_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1580547964928L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_addContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public Op_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_add; }
	}

	public final Op_addContext op_add() throws RecognitionException {
		Op_addContext _localctx = new Op_addContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_op_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_compContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public Op_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_comp; }
	}

	public final Op_compContext op_comp() throws RecognitionException {
		Op_compContext _localctx = new Op_compContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_op_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138538465099776L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public Op_assignmentContext op_assignment() {
			return getRuleContext(Op_assignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(110);
			op_assignment();
			setState(111);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PythonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(PRINT);
			setState(114);
			match(LPAREN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 552253904306307520L) != 0)) {
				{
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(115);
					expr(0);
					}
					break;
				case 2:
					{
					setState(116);
					query(0);
					}
					break;
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(120);
						expr(0);
						}
						break;
					case 2:
						{
						setState(121);
						query(0);
						}
						break;
					}
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TerminalNode INPUT() { return getToken(PythonParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(134);
			match(ASSIGN);
			setState(135);
			match(INPUT);
			setState(136);
			match(LPAREN);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(137);
				match(STRING);
				}
			}

			setState(140);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(RETURN);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(143);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pass_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public Pass_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_stmt; }
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(PASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_import_stmt);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(IMPORT);
				setState(153);
				match(ID);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(154);
					match(AS);
					setState(155);
					match(ID);
					}
				}

				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(FROM);
				setState(159);
				match(ID);
				setState(160);
				match(IMPORT);
				setState(161);
				match(ID);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(162);
					match(AS);
					setState(163);
					match(ID);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(PythonParser.ARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(DEF);
			setState(169);
			match(ID);
			setState(170);
			match(LPAREN);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(171);
				param();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(172);
					match(COMMA);
					setState(173);
					param();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(181);
			match(RPAREN);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(182);
				match(ARROW);
				setState(183);
				expr(0);
				}
			}

			setState(186);
			match(COLON);
			setState(187);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(CLASS);
			setState(190);
			match(ID);
			setState(191);
			match(COLON);
			setState(192);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Try_exceptContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> EXCEPT() { return getTokens(PythonParser.EXCEPT); }
		public TerminalNode EXCEPT(int i) {
			return getToken(PythonParser.EXCEPT, i);
		}
		public TerminalNode FINALLY() { return getToken(PythonParser.FINALLY, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public Try_exceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_except; }
	}

	public final Try_exceptContext try_except() throws RecognitionException {
		Try_exceptContext _localctx = new Try_exceptContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_try_except);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(TRY);
			setState(195);
			match(COLON);
			setState(196);
			block();
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					match(EXCEPT);
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(198);
						match(ID);
						}
					}

					setState(201);
					match(COLON);
					setState(202);
					block();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(208);
				match(FINALLY);
				setState(209);
				match(COLON);
				setState(210);
				block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condicional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IF);
			setState(214);
			query(0);
			setState(215);
			match(COLON);
			setState(216);
			block();
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(ELIF);
					setState(218);
					query(0);
					setState(219);
					match(COLON);
					setState(220);
					block();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(227);
				match(ELSE);
				setState(228);
				match(COLON);
				setState(229);
				block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Loop_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_while; }
	}

	public final Loop_whileContext loop_while() throws RecognitionException {
		Loop_whileContext _localctx = new Loop_whileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loop_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(WHILE);
			setState(233);
			query(0);
			setState(234);
			match(COLON);
			setState(235);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Loop_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for; }
	}

	public final Loop_forContext loop_for() throws RecognitionException {
		Loop_forContext _localctx = new Loop_forContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loop_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(FOR);
			setState(238);
			match(ID);
			setState(239);
			match(IN);
			setState(240);
			expr(0);
			setState(241);
			match(COLON);
			setState(242);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ID);
			setState(245);
			match(LPAREN);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 552253904306307456L) != 0)) {
				{
				setState(246);
				expr(0);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(247);
					match(COMMA);
					setState(248);
					expr(0);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(256);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public DicionarioContext dicionario() {
			return getRuleContext(DicionarioContext.class,0);
		}
		public TuplaContext tupla() {
			return getRuleContext(TuplaContext.class,0);
		}
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PythonParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public TerminalNode POW() { return getToken(PythonParser.POW, 0); }
		public Op_multContext op_mult() {
			return getRuleContext(Op_multContext.class,0);
		}
		public Op_addContext op_add() {
			return getRuleContext(Op_addContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(259);
				match(LPAREN);
				setState(260);
				expr(0);
				setState(261);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(263);
				func_call();
				}
				break;
			case 3:
				{
				setState(264);
				lista();
				}
				break;
			case 4:
				{
				setState(265);
				dicionario();
				}
				break;
			case 5:
				{
				setState(266);
				tupla();
				}
				break;
			case 6:
				{
				setState(267);
				conjunto();
				}
				break;
			case 7:
				{
				setState(268);
				match(ID);
				}
				break;
			case 8:
				{
				setState(269);
				match(INT);
				}
				break;
			case 9:
				{
				setState(270);
				match(FLOAT);
				}
				break;
			case 10:
				{
				setState(271);
				match(STRING);
				}
				break;
			case 11:
				{
				setState(272);
				match(TRUE);
				}
				break;
			case 12:
				{
				setState(273);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(277);
						match(POW);
						setState(278);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(280);
						op_mult();
						setState(281);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(284);
						op_add();
						setState(285);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Op_compContext op_comp() {
			return getRuleContext(Op_compContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		return query(0);
	}

	private QueryContext query(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryContext _localctx = new QueryContext(_ctx, _parentState);
		QueryContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_query, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(293);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(294);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(295);
				expr(0);
				setState(296);
				op_comp();
				setState(297);
				expr(0);
				}
				break;
			case 4:
				{
				setState(299);
				match(NOT);
				setState(300);
				query(4);
				}
				break;
			case 5:
				{
				setState(301);
				match(LPAREN);
				setState(302);
				query(0);
				setState(303);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new QueryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(307);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(308);
						match(AND);
						setState(309);
						query(4);
						}
						break;
					case 2:
						{
						_localctx = new QueryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_query);
						setState(310);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						match(OR);
						setState(312);
						query(3);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(ID);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(319);
				match(COLON);
				setState(320);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(LBRACK);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 552253904306307456L) != 0)) {
				{
				setState(324);
				expr(0);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(325);
					match(COMMA);
					setState(326);
					expr(0);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(334);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TuplaContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PythonParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(PythonParser.RPAREN, 0); }
		public TuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupla; }
	}

	public final TuplaContext tupla() throws RecognitionException {
		TuplaContext _localctx = new TuplaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LPAREN);
			setState(337);
			expr(0);
			setState(338);
			match(COMMA);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 552253904306307456L) != 0)) {
				{
				setState(339);
				expr(0);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(340);
					match(COMMA);
					setState(341);
					expr(0);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(349);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DicionarioContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DicionarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dicionario; }
	}

	public final DicionarioContext dicionario() throws RecognitionException {
		DicionarioContext _localctx = new DicionarioContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dicionario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LBRACE);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 552253904306307456L) != 0)) {
				{
				setState(352);
				expr(0);
				setState(353);
				match(COLON);
				setState(354);
				expr(0);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(355);
					match(COMMA);
					setState(356);
					expr(0);
					setState(357);
					match(COLON);
					setState(358);
					expr(0);
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(367);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConjuntoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto; }
	}

	public final ConjuntoContext conjunto() throws RecognitionException {
		ConjuntoContext _localctx = new ConjuntoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conjunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LBRACE);
			setState(370);
			expr(0);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				expr(0);
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 23:
			return query_sempred((QueryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean query_sempred(QueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u017d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000?\b\u0000\n\u0000\f\u0000B\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001S\b\u0001\u0001\u0002\u0004\u0002V\b\u0002\u000b"+
		"\u0002\f\u0002W\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002]\b\u0002"+
		"\n\u0002\f\u0002`\t\u0002\u0004\u0002b\b\u0002\u000b\u0002\f\u0002c\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bv\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b{\b\b\u0005\b}\b\b\n\b\f\b\u0080\t\b\u0003\b\u0082\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008b\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0003\n\u0091\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u009d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00a5\b\u000e\u0003\u000e\u00a7\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00af\b\u000f\n\u000f\f\u000f\u00b2\t\u000f\u0003\u000f\u00b4"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b9\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00c8\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00cc\b\u0011\n\u0011\f\u0011\u00cf\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00d4\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00df\b\u0012\n\u0012\f\u0012\u00e2\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00e7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u00fa\b\u0015\n\u0015\f\u0015\u00fd"+
		"\t\u0015\u0003\u0015\u00ff\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0113\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0120\b\u0016"+
		"\n\u0016\f\u0016\u0123\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0132\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u013a\b\u0017\n\u0017\f\u0017\u013d\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0142\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0148\b\u0019\n\u0019\f\u0019\u014b\t\u0019\u0003"+
		"\u0019\u014d\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0157\b\u001a\n"+
		"\u001a\f\u001a\u015a\t\u001a\u0003\u001a\u015c\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0169\b\u001b\n"+
		"\u001b\f\u001b\u016c\t\u001b\u0003\u001b\u016e\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0176"+
		"\b\u001c\n\u001c\f\u001c\u0179\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0000\u0002,.\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0004\u0001\u0000\u001b"+
		"!\u0002\u0000$&((\u0001\u0000\"#\u0001\u0000).\u01a1\u0000@\u0001\u0000"+
		"\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000"+
		"\u0006e\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\ni\u0001\u0000"+
		"\u0000\u0000\fk\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000"+
		"\u0010q\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014"+
		"\u008e\u0001\u0000\u0000\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018"+
		"\u0094\u0001\u0000\u0000\u0000\u001a\u0096\u0001\u0000\u0000\u0000\u001c"+
		"\u00a6\u0001\u0000\u0000\u0000\u001e\u00a8\u0001\u0000\u0000\u0000 \u00bd"+
		"\u0001\u0000\u0000\u0000\"\u00c2\u0001\u0000\u0000\u0000$\u00d5\u0001"+
		"\u0000\u0000\u0000&\u00e8\u0001\u0000\u0000\u0000(\u00ed\u0001\u0000\u0000"+
		"\u0000*\u00f4\u0001\u0000\u0000\u0000,\u0112\u0001\u0000\u0000\u0000."+
		"\u0131\u0001\u0000\u0000\u00000\u013e\u0001\u0000\u0000\u00002\u0143\u0001"+
		"\u0000\u0000\u00004\u0150\u0001\u0000\u0000\u00006\u015f\u0001\u0000\u0000"+
		"\u00008\u0171\u0001\u0000\u0000\u0000:?\u0005=\u0000\u0000;?\u0003\u0002"+
		"\u0001\u0000<?\u0003\u001e\u000f\u0000=?\u0003 \u0010\u0000>:\u0001\u0000"+
		"\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0000\u0000\u0001D\u0001\u0001\u0000\u0000\u0000ES\u0003"+
		"\u000e\u0007\u0000FS\u0003\u0010\b\u0000GS\u0003\u0012\t\u0000HS\u0003"+
		"\u0014\n\u0000IS\u0003\u0016\u000b\u0000JS\u0003\u0018\f\u0000KS\u0003"+
		"\u001c\u000e\u0000LS\u0003\u001a\r\u0000MS\u0003\"\u0011\u0000NS\u0003"+
		",\u0016\u0000OS\u0003$\u0012\u0000PS\u0003&\u0013\u0000QS\u0003(\u0014"+
		"\u0000RE\u0001\u0000\u0000\u0000RF\u0001\u0000\u0000\u0000RG\u0001\u0000"+
		"\u0000\u0000RH\u0001\u0000\u0000\u0000RI\u0001\u0000\u0000\u0000RJ\u0001"+
		"\u0000\u0000\u0000RK\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000"+
		"RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u0003\u0001"+
		"\u0000\u0000\u0000TV\u0005=\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"Xa\u0001\u0000\u0000\u0000YZ\u0005>\u0000\u0000Z^\u0003\u0002\u0001\u0000"+
		"[]\u0005=\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000aY\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0005"+
		"\u0001\u0000\u0000\u0000ef\u0007\u0000\u0000\u0000f\u0007\u0001\u0000"+
		"\u0000\u0000gh\u0007\u0001\u0000\u0000h\t\u0001\u0000\u0000\u0000ij\u0007"+
		"\u0002\u0000\u0000j\u000b\u0001\u0000\u0000\u0000kl\u0007\u0003\u0000"+
		"\u0000l\r\u0001\u0000\u0000\u0000mn\u00057\u0000\u0000no\u0003\u0006\u0003"+
		"\u0000op\u0003,\u0016\u0000p\u000f\u0001\u0000\u0000\u0000qr\u0005\u0011"+
		"\u0000\u0000r\u0081\u00051\u0000\u0000sv\u0003,\u0016\u0000tv\u0003.\u0017"+
		"\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v~\u0001\u0000"+
		"\u0000\u0000wz\u00050\u0000\u0000x{\u0003,\u0016\u0000y{\u0003.\u0017"+
		"\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{}\u0001\u0000"+
		"\u0000\u0000|w\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081u\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u00052\u0000\u0000\u0084\u0011\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u00057\u0000\u0000\u0086\u0087\u0005\u001b\u0000\u0000"+
		"\u0087\u0088\u0005\u0012\u0000\u0000\u0088\u008a\u00051\u0000\u0000\u0089"+
		"\u008b\u0005:\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u00052\u0000\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u0090\u0005"+
		"\u0013\u0000\u0000\u008f\u0091\u0003,\u0016\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0015\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u0014\u0000\u0000\u0093\u0017\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\u0015\u0000\u0000\u0095\u0019\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\u001a\u0000\u0000\u0097\u001b\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\u0016\u0000\u0000\u0099\u009c\u00057\u0000"+
		"\u0000\u009a\u009b\u0005\u0018\u0000\u0000\u009b\u009d\u00057\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a7\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0017\u0000\u0000"+
		"\u009f\u00a0\u00057\u0000\u0000\u00a0\u00a1\u0005\u0016\u0000\u0000\u00a1"+
		"\u00a4\u00057\u0000\u0000\u00a2\u00a3\u0005\u0018\u0000\u0000\u00a3\u00a5"+
		"\u00057\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u0098\u0001"+
		"\u0000\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a7\u001d\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00aa\u00057"+
		"\u0000\u0000\u00aa\u00b3\u00051\u0000\u0000\u00ab\u00b0\u00030\u0018\u0000"+
		"\u00ac\u00ad\u00050\u0000\u0000\u00ad\u00af\u00030\u0018\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u00052\u0000\u0000\u00b6\u00b7\u0005"+
		";\u0000\u0000\u00b7\u00b9\u0003,\u0016\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005/\u0000\u0000\u00bb\u00bc\u0003\u0004\u0002\u0000"+
		"\u00bc\u001f\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000\u00be"+
		"\u00bf\u00057\u0000\u0000\u00bf\u00c0\u0005/\u0000\u0000\u00c0\u00c1\u0003"+
		"\u0004\u0002\u0000\u00c1!\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u000b"+
		"\u0000\u0000\u00c3\u00c4\u0005/\u0000\u0000\u00c4\u00cd\u0003\u0004\u0002"+
		"\u0000\u00c5\u00c7\u0005\f\u0000\u0000\u00c6\u00c8\u00057\u0000\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005/\u0000\u0000\u00ca"+
		"\u00cc\u0003\u0004\u0002\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d3\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\r\u0000\u0000\u00d1\u00d2"+
		"\u0005/\u0000\u0000\u00d2\u00d4\u0003\u0004\u0002\u0000\u00d3\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4#\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0005\u0001\u0000\u0000\u00d6\u00d7\u0003.\u0017"+
		"\u0000\u00d7\u00d8\u0005/\u0000\u0000\u00d8\u00e0\u0003\u0004\u0002\u0000"+
		"\u00d9\u00da\u0005\u0002\u0000\u0000\u00da\u00db\u0003.\u0017\u0000\u00db"+
		"\u00dc\u0005/\u0000\u0000\u00dc\u00dd\u0003\u0004\u0002\u0000\u00dd\u00df"+
		"\u0001\u0000\u0000\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00df\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e6\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5"+
		"\u0005/\u0000\u0000\u00e5\u00e7\u0003\u0004\u0002\u0000\u00e6\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7%\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u000f\u0000\u0000\u00e9\u00ea\u0003.\u0017"+
		"\u0000\u00ea\u00eb\u0005/\u0000\u0000\u00eb\u00ec\u0003\u0004\u0002\u0000"+
		"\u00ec\'\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0010\u0000\u0000\u00ee"+
		"\u00ef\u00057\u0000\u0000\u00ef\u00f0\u0005\u000e\u0000\u0000\u00f0\u00f1"+
		"\u0003,\u0016\u0000\u00f1\u00f2\u0005/\u0000\u0000\u00f2\u00f3\u0003\u0004"+
		"\u0002\u0000\u00f3)\u0001\u0000\u0000\u0000\u00f4\u00f5\u00057\u0000\u0000"+
		"\u00f5\u00fe\u00051\u0000\u0000\u00f6\u00fb\u0003,\u0016\u0000\u00f7\u00f8"+
		"\u00050\u0000\u0000\u00f8\u00fa\u0003,\u0016\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00f6\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u00052\u0000\u0000\u0101+\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0006\u0016\uffff\uffff\u0000\u0103\u0104\u00051\u0000\u0000"+
		"\u0104\u0105\u0003,\u0016\u0000\u0105\u0106\u00052\u0000\u0000\u0106\u0113"+
		"\u0001\u0000\u0000\u0000\u0107\u0113\u0003*\u0015\u0000\u0108\u0113\u0003"+
		"2\u0019\u0000\u0109\u0113\u00036\u001b\u0000\u010a\u0113\u00034\u001a"+
		"\u0000\u010b\u0113\u00038\u001c\u0000\u010c\u0113\u00057\u0000\u0000\u010d"+
		"\u0113\u00059\u0000\u0000\u010e\u0113\u00058\u0000\u0000\u010f\u0113\u0005"+
		":\u0000\u0000\u0110\u0113\u0005\u0007\u0000\u0000\u0111\u0113\u0005\b"+
		"\u0000\u0000\u0112\u0102\u0001\u0000\u0000\u0000\u0112\u0107\u0001\u0000"+
		"\u0000\u0000\u0112\u0108\u0001\u0000\u0000\u0000\u0112\u0109\u0001\u0000"+
		"\u0000\u0000\u0112\u010a\u0001\u0000\u0000\u0000\u0112\u010b\u0001\u0000"+
		"\u0000\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u010d\u0001\u0000"+
		"\u0000\u0000\u0112\u010e\u0001\u0000\u0000\u0000\u0112\u010f\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0121\u0001\u0000\u0000\u0000\u0114\u0115\n\u0003\u0000"+
		"\u0000\u0115\u0116\u0005\'\u0000\u0000\u0116\u0120\u0003,\u0016\u0004"+
		"\u0117\u0118\n\u0002\u0000\u0000\u0118\u0119\u0003\b\u0004\u0000\u0119"+
		"\u011a\u0003,\u0016\u0003\u011a\u0120\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\n\u0001\u0000\u0000\u011c\u011d\u0003\n\u0005\u0000\u011d\u011e\u0003"+
		",\u0016\u0002\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0114\u0001\u0000"+
		"\u0000\u0000\u011f\u0117\u0001\u0000\u0000\u0000\u011f\u011b\u0001\u0000"+
		"\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122-\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u0006\u0017\uffff"+
		"\uffff\u0000\u0125\u0132\u0005\u0007\u0000\u0000\u0126\u0132\u0005\b\u0000"+
		"\u0000\u0127\u0128\u0003,\u0016\u0000\u0128\u0129\u0003\f\u0006\u0000"+
		"\u0129\u012a\u0003,\u0016\u0000\u012a\u0132\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0005\u0006\u0000\u0000\u012c\u0132\u0003.\u0017\u0004\u012d\u012e"+
		"\u00051\u0000\u0000\u012e\u012f\u0003.\u0017\u0000\u012f\u0130\u00052"+
		"\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0124\u0001\u0000"+
		"\u0000\u0000\u0131\u0126\u0001\u0000\u0000\u0000\u0131\u0127\u0001\u0000"+
		"\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000"+
		"\u0000\u0000\u0132\u013b\u0001\u0000\u0000\u0000\u0133\u0134\n\u0003\u0000"+
		"\u0000\u0134\u0135\u0005\u0004\u0000\u0000\u0135\u013a\u0003.\u0017\u0004"+
		"\u0136\u0137\n\u0002\u0000\u0000\u0137\u0138\u0005\u0005\u0000\u0000\u0138"+
		"\u013a\u0003.\u0017\u0003\u0139\u0133\u0001\u0000\u0000\u0000\u0139\u0136"+
		"\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c/\u0001"+
		"\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0141\u0005"+
		"7\u0000\u0000\u013f\u0140\u0005/\u0000\u0000\u0140\u0142\u0003,\u0016"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u01421\u0001\u0000\u0000\u0000\u0143\u014c\u00053\u0000\u0000\u0144"+
		"\u0149\u0003,\u0016\u0000\u0145\u0146\u00050\u0000\u0000\u0146\u0148\u0003"+
		",\u0016\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014c\u0144\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u00054\u0000"+
		"\u0000\u014f3\u0001\u0000\u0000\u0000\u0150\u0151\u00051\u0000\u0000\u0151"+
		"\u0152\u0003,\u0016\u0000\u0152\u015b\u00050\u0000\u0000\u0153\u0158\u0003"+
		",\u0016\u0000\u0154\u0155\u00050\u0000\u0000\u0155\u0157\u0003,\u0016"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u0153\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u00052\u0000\u0000"+
		"\u015e5\u0001\u0000\u0000\u0000\u015f\u016d\u00055\u0000\u0000\u0160\u0161"+
		"\u0003,\u0016\u0000\u0161\u0162\u0005/\u0000\u0000\u0162\u016a\u0003,"+
		"\u0016\u0000\u0163\u0164\u00050\u0000\u0000\u0164\u0165\u0003,\u0016\u0000"+
		"\u0165\u0166\u0005/\u0000\u0000\u0166\u0167\u0003,\u0016\u0000\u0167\u0169"+
		"\u0001\u0000\u0000\u0000\u0168\u0163\u0001\u0000\u0000\u0000\u0169\u016c"+
		"\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a"+
		"\u0001\u0000\u0000\u0000\u016d\u0160\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u00056\u0000\u0000\u01707\u0001\u0000\u0000\u0000\u0171\u0172\u00055"+
		"\u0000\u0000\u0172\u0177\u0003,\u0016\u0000\u0173\u0174\u00050\u0000\u0000"+
		"\u0174\u0176\u0003,\u0016\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176"+
		"\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0001\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u017a\u017b\u00056\u0000\u0000\u017b9\u0001"+
		"\u0000\u0000\u0000\'>@RW^cuz~\u0081\u008a\u0090\u009c\u00a4\u00a6\u00b0"+
		"\u00b3\u00b8\u00c7\u00cd\u00d3\u00e0\u00e6\u00fb\u00fe\u0112\u011f\u0121"+
		"\u0131\u0139\u013b\u0141\u0149\u014c\u0158\u015b\u016a\u016d\u0177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}