// Generated from cool_syntax.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class cool_syntaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, ELSE=2, FI=3, IF=4, IN=5, INHERITS=6, ISVOID=7, LET=8, LOOP=9, 
		POOL=10, THEN=11, WHILE=12, CASE=13, ESAC=14, NEW=15, OF=16, NOT=17, TRUE=18, 
		FALSE=19, INTEGERS=20, SELF=21, SELF_TYPE=22, TYPE_IDENTIFIER=23, OBJECT_IDENTIFIER=24, 
		LBRACE=25, RBRACE=26, SEMI=27, COLON=28, AT=29, COMMA=30, ASSIGN=31, LPAREN=32, 
		RPAREN=33, PLUS=34, MINUS=35, MULT=36, DIV=37, EQUALS=38, LT=39, LE=40, 
		TILDE=41, DOT=42, RESULTS=43, STRING=44, SINGLECOMMENT=45, WS=46;
	public static final int
		RULE_program = 0, RULE_class = 1, RULE_feature = 2, RULE_formal = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class", "feature", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'self'", "'SELF_TYPE'", 
			null, null, "'{'", "'}'", "';'", "':'", "'@'", "','", "'<-'", "'('", 
			"')'", "'+'", "'-'", "'*'", "'/'", "'='", "'<'", "'<='", "'~'", "'.'", 
			"'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", 
			"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", 
			"TRUE", "FALSE", "INTEGERS", "SELF", "SELF_TYPE", "TYPE_IDENTIFIER", 
			"OBJECT_IDENTIFIER", "LBRACE", "RBRACE", "SEMI", "COLON", "AT", "COMMA", 
			"ASSIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", "MULT", "DIV", "EQUALS", 
			"LT", "LE", "TILDE", "DOT", "RESULTS", "STRING", "SINGLECOMMENT", "WS"
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
	public String getGrammarFileName() { return "cool_syntax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cool_syntaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ProgramContext {
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public StartContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new StartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				class_();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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
	public static class ClassContext extends ParserRuleContext {
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	 
		public ClassContext() { }
		public void copyFrom(ClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassdefContext extends ClassContext {
		public TerminalNode CLASS() { return getToken(cool_syntaxParser.CLASS, 0); }
		public List<TerminalNode> TYPE_IDENTIFIER() { return getTokens(cool_syntaxParser.TYPE_IDENTIFIER); }
		public TerminalNode TYPE_IDENTIFIER(int i) {
			return getToken(cool_syntaxParser.TYPE_IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(cool_syntaxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cool_syntaxParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(cool_syntaxParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(cool_syntaxParser.SEMI, i);
		}
		public TerminalNode INHERITS() { return getToken(cool_syntaxParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassdefContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class);
		int _la;
		try {
			_localctx = new ClassdefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(CLASS);
			setState(16);
			match(TYPE_IDENTIFIER);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(17);
				match(INHERITS);
				setState(18);
				match(TYPE_IDENTIFIER);
				}
			}

			setState(21);
			match(LBRACE);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECT_IDENTIFIER) {
				{
				{
				setState(22);
				feature();
				setState(23);
				match(SEMI);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(RBRACE);
			setState(31);
			match(SEMI);
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
	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends FeatureContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(cool_syntaxParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(cool_syntaxParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(cool_syntaxParser.COLON, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(cool_syntaxParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(cool_syntaxParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(cool_syntaxParser.RBRACE, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cool_syntaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cool_syntaxParser.COMMA, i);
		}
		public FunctionContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends FeatureContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(cool_syntaxParser.COLON, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(cool_syntaxParser.TYPE_IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(cool_syntaxParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(OBJECT_IDENTIFIER);
				setState(34);
				match(LPAREN);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJECT_IDENTIFIER) {
					{
					setState(35);
					formal();
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(36);
						match(COMMA);
						setState(37);
						formal();
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(45);
				match(RPAREN);
				setState(46);
				match(COLON);
				setState(47);
				match(TYPE_IDENTIFIER);
				setState(48);
				match(LBRACE);
				setState(49);
				expr(0);
				setState(50);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(OBJECT_IDENTIFIER);
				setState(53);
				match(COLON);
				setState(54);
				match(TYPE_IDENTIFIER);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(55);
					match(ASSIGN);
					setState(56);
					expr(0);
					}
				}

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
	public static class FormalContext extends ParserRuleContext {
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	 
		public FormalContext() { }
		public void copyFrom(FormalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends FormalContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(cool_syntaxParser.COLON, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(cool_syntaxParser.TYPE_IDENTIFIER, 0); }
		public ParameterContext(FormalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			_localctx = new ParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(OBJECT_IDENTIFIER);
			setState(62);
			match(COLON);
			setState(63);
			match(TYPE_IDENTIFIER);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectcallContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(cool_syntaxParser.DOT, 0); }
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(cool_syntaxParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(cool_syntaxParser.RPAREN, 0); }
		public TerminalNode AT() { return getToken(cool_syntaxParser.AT, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(cool_syntaxParser.TYPE_IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(cool_syntaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cool_syntaxParser.COMMA, i);
		}
		public ObjectcallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterObjectcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitObjectcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitObjectcall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(cool_syntaxParser.MINUS, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(cool_syntaxParser.MULT, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(cool_syntaxParser.LE, 0); }
		public LqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterLq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitLq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitLq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ExprContext {
		public TerminalNode INTEGERS() { return getToken(cool_syntaxParser.INTEGERS, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(cool_syntaxParser.LT, 0); }
		public LtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(cool_syntaxParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(cool_syntaxParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(cool_syntaxParser.POOL, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(cool_syntaxParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(cool_syntaxParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ExprContext {
		public TerminalNode LBRACE() { return getToken(cool_syntaxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cool_syntaxParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(cool_syntaxParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(cool_syntaxParser.SEMI, i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ExprContext {
		public TerminalNode LET() { return getToken(cool_syntaxParser.LET, 0); }
		public List<TerminalNode> OBJECT_IDENTIFIER() { return getTokens(cool_syntaxParser.OBJECT_IDENTIFIER); }
		public TerminalNode OBJECT_IDENTIFIER(int i) {
			return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(cool_syntaxParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(cool_syntaxParser.COLON, i);
		}
		public List<TerminalNode> TYPE_IDENTIFIER() { return getTokens(cool_syntaxParser.TYPE_IDENTIFIER); }
		public TerminalNode TYPE_IDENTIFIER(int i) {
			return getToken(cool_syntaxParser.TYPE_IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(cool_syntaxParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(cool_syntaxParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(cool_syntaxParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cool_syntaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cool_syntaxParser.COMMA, i);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewobjectContext extends ExprContext {
		public TerminalNode NEW() { return getToken(cool_syntaxParser.NEW, 0); }
		public TerminalNode TYPE_IDENTIFIER() { return getToken(cool_syntaxParser.TYPE_IDENTIFIER, 0); }
		public NewobjectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterNewobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitNewobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitNewobject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ExprContext {
		public TerminalNode STRING() { return getToken(cool_syntaxParser.STRING, 0); }
		public TextContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ExprContext {
		public TerminalNode IF() { return getToken(cool_syntaxParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(cool_syntaxParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(cool_syntaxParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(cool_syntaxParser.FI, 0); }
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ExprContext {
		public TerminalNode CASE() { return getToken(cool_syntaxParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(cool_syntaxParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(cool_syntaxParser.ESAC, 0); }
		public List<TerminalNode> OBJECT_IDENTIFIER() { return getTokens(cool_syntaxParser.OBJECT_IDENTIFIER); }
		public TerminalNode OBJECT_IDENTIFIER(int i) {
			return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(cool_syntaxParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(cool_syntaxParser.COLON, i);
		}
		public List<TerminalNode> TYPE_IDENTIFIER() { return getTokens(cool_syntaxParser.TYPE_IDENTIFIER); }
		public TerminalNode TYPE_IDENTIFIER(int i) {
			return getToken(cool_syntaxParser.TYPE_IDENTIFIER, i);
		}
		public List<TerminalNode> RESULTS() { return getTokens(cool_syntaxParser.RESULTS); }
		public TerminalNode RESULTS(int i) {
			return getToken(cool_syntaxParser.RESULTS, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(cool_syntaxParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(cool_syntaxParser.SEMI, i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParexprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(cool_syntaxParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cool_syntaxParser.RPAREN, 0); }
		public ParexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterParexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitParexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitParexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(cool_syntaxParser.PLUS, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(cool_syntaxParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvertContext extends ExprContext {
		public TerminalNode TILDE() { return getToken(cool_syntaxParser.TILDE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InvertContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterInvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitInvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitInvert(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(cool_syntaxParser.FALSE, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(cool_syntaxParser.EQUALS, 0); }
		public EqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(cool_syntaxParser.TRUE, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ExprContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(cool_syntaxParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StaticcallContext extends ExprContext {
		public TerminalNode OBJECT_IDENTIFIER() { return getToken(cool_syntaxParser.OBJECT_IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(cool_syntaxParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(cool_syntaxParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cool_syntaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cool_syntaxParser.COMMA, i);
		}
		public StaticcallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).enterStaticcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cool_syntaxListener ) ((cool_syntaxListener)listener).exitStaticcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cool_syntaxVisitor ) return ((cool_syntaxVisitor<? extends T>)visitor).visitStaticcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(OBJECT_IDENTIFIER);
				setState(67);
				match(ASSIGN);
				setState(68);
				expr(25);
				}
				break;
			case 2:
				{
				_localctx = new StaticcallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(OBJECT_IDENTIFIER);
				setState(70);
				match(LPAREN);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19795556610448L) != 0)) {
					{
					setState(71);
					expr(0);
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(72);
						match(COMMA);
						setState(73);
						expr(0);
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(81);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(IF);
				setState(83);
				expr(0);
				setState(84);
				match(THEN);
				setState(85);
				expr(0);
				setState(86);
				match(ELSE);
				setState(87);
				expr(0);
				setState(88);
				match(FI);
				}
				break;
			case 4:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(WHILE);
				setState(91);
				expr(0);
				setState(92);
				match(LOOP);
				setState(93);
				expr(0);
				setState(94);
				match(POOL);
				}
				break;
			case 5:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(LBRACE);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					expr(0);
					setState(98);
					match(SEMI);
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 19795556610448L) != 0) );
				setState(104);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(LET);
				setState(107);
				match(OBJECT_IDENTIFIER);
				setState(108);
				match(COLON);
				setState(109);
				match(TYPE_IDENTIFIER);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(110);
					match(ASSIGN);
					setState(111);
					expr(0);
					}
				}

				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					match(OBJECT_IDENTIFIER);
					setState(116);
					match(COLON);
					setState(117);
					match(TYPE_IDENTIFIER);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(118);
						match(ASSIGN);
						setState(119);
						expr(0);
						}
					}

					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(IN);
				setState(128);
				expr(19);
				}
				break;
			case 7:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(CASE);
				setState(130);
				expr(0);
				setState(131);
				match(OF);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					match(OBJECT_IDENTIFIER);
					setState(133);
					match(COLON);
					setState(134);
					match(TYPE_IDENTIFIER);
					setState(135);
					match(RESULTS);
					setState(136);
					expr(0);
					setState(137);
					match(SEMI);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECT_IDENTIFIER );
				setState(143);
				match(ESAC);
				}
				break;
			case 8:
				{
				_localctx = new NewobjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(NEW);
				setState(146);
				match(TYPE_IDENTIFIER);
				}
				break;
			case 9:
				{
				_localctx = new VoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(ISVOID);
				setState(148);
				expr(16);
				}
				break;
			case 10:
				{
				_localctx = new InvertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(TILDE);
				setState(150);
				expr(11);
				}
				break;
			case 11:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(NOT);
				setState(152);
				expr(7);
				}
				break;
			case 12:
				{
				_localctx = new ParexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(LPAREN);
				setState(154);
				expr(0);
				setState(155);
				match(RPAREN);
				}
				break;
			case 13:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(OBJECT_IDENTIFIER);
				}
				break;
			case 14:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(INTEGERS);
				}
				break;
			case 15:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(TRUE);
				}
				break;
			case 17:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(165);
						match(PLUS);
						setState(166);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(168);
						match(MINUS);
						setState(169);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(171);
						match(MULT);
						setState(172);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(174);
						match(DIV);
						setState(175);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(177);
						match(LT);
						setState(178);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new LqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(180);
						match(LE);
						setState(181);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new EqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(183);
						match(EQUALS);
						setState(184);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ObjectcallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(186);
							match(AT);
							setState(187);
							match(TYPE_IDENTIFIER);
							}
						}

						setState(190);
						match(DOT);
						setState(191);
						match(OBJECT_IDENTIFIER);
						setState(192);
						match(LPAREN);
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19795556610448L) != 0)) {
							{
							setState(193);
							expr(0);
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(194);
								match(COMMA);
								setState(195);
								expr(0);
								}
								}
								setState(200);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(203);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*"+
		"\t\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b\u0002\u0003\u0002<\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0003\u0004"+
		"P\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004e\b\u0004\u000b\u0004\f\u0004f\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004q\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004y\b\u0004\u0005"+
		"\u0004{\b\u0004\n\u0004\f\u0004~\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u008c\b\u0004\u000b"+
		"\u0004\f\u0004\u008d\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a3\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00bd"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00c5\b\u0004\n\u0004\f\u0004\u00c8\t\u0004\u0003\u0004"+
		"\u00ca\b\u0004\u0001\u0004\u0005\u0004\u00cd\b\u0004\n\u0004\f\u0004\u00d0"+
		"\t\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0000\u00f5\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000"+
		"\u0000\u0000\u0004;\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000"+
		"\b\u00a2\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005\u0001\u0000\u0000\u0010\u0013\u0005\u0017\u0000\u0000"+
		"\u0011\u0012\u0005\u0006\u0000\u0000\u0012\u0014\u0005\u0017\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u001b\u0005\u0019\u0000\u0000"+
		"\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018\u0005\u001b\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u001a\u0000\u0000"+
		"\u001f \u0005\u001b\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u0018\u0000\u0000\"+\u0005 \u0000\u0000#(\u0003\u0006\u0003\u0000$%\u0005"+
		"\u001e\u0000\u0000%\'\u0003\u0006\u0003\u0000&$\u0001\u0000\u0000\u0000"+
		"\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+#\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005"+
		"!\u0000\u0000./\u0005\u001c\u0000\u0000/0\u0005\u0017\u0000\u000001\u0005"+
		"\u0019\u0000\u000012\u0003\b\u0004\u000023\u0005\u001a\u0000\u00003<\u0001"+
		"\u0000\u0000\u000045\u0005\u0018\u0000\u000056\u0005\u001c\u0000\u0000"+
		"69\u0005\u0017\u0000\u000078\u0005\u001f\u0000\u00008:\u0003\b\u0004\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000"+
		"\u0000;!\u0001\u0000\u0000\u0000;4\u0001\u0000\u0000\u0000<\u0005\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0018\u0000\u0000>?\u0005\u001c\u0000\u0000"+
		"?@\u0005\u0017\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0006\u0004"+
		"\uffff\uffff\u0000BC\u0005\u0018\u0000\u0000CD\u0005\u001f\u0000\u0000"+
		"D\u00a3\u0003\b\u0004\u0019EF\u0005\u0018\u0000\u0000FO\u0005 \u0000\u0000"+
		"GL\u0003\b\u0004\u0000HI\u0005\u001e\u0000\u0000IK\u0003\b\u0004\u0000"+
		"JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OG\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000Q\u00a3\u0005!\u0000\u0000RS\u0005\u0004\u0000\u0000"+
		"ST\u0003\b\u0004\u0000TU\u0005\u000b\u0000\u0000UV\u0003\b\u0004\u0000"+
		"VW\u0005\u0002\u0000\u0000WX\u0003\b\u0004\u0000XY\u0005\u0003\u0000\u0000"+
		"Y\u00a3\u0001\u0000\u0000\u0000Z[\u0005\f\u0000\u0000[\\\u0003\b\u0004"+
		"\u0000\\]\u0005\t\u0000\u0000]^\u0003\b\u0004\u0000^_\u0005\n\u0000\u0000"+
		"_\u00a3\u0001\u0000\u0000\u0000`d\u0005\u0019\u0000\u0000ab\u0003\b\u0004"+
		"\u0000bc\u0005\u001b\u0000\u0000ce\u0001\u0000\u0000\u0000da\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u001a\u0000\u0000"+
		"i\u00a3\u0001\u0000\u0000\u0000jk\u0005\b\u0000\u0000kl\u0005\u0018\u0000"+
		"\u0000lm\u0005\u001c\u0000\u0000mp\u0005\u0017\u0000\u0000no\u0005\u001f"+
		"\u0000\u0000oq\u0003\b\u0004\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q|\u0001\u0000\u0000\u0000rs\u0005\u001e\u0000\u0000st\u0005"+
		"\u0018\u0000\u0000tu\u0005\u001c\u0000\u0000ux\u0005\u0017\u0000\u0000"+
		"vw\u0005\u001f\u0000\u0000wy\u0003\b\u0004\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zr\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005\u0005\u0000\u0000\u0080\u00a3\u0003\b\u0004\u0013\u0081"+
		"\u0082\u0005\r\u0000\u0000\u0082\u0083\u0003\b\u0004\u0000\u0083\u008b"+
		"\u0005\u0010\u0000\u0000\u0084\u0085\u0005\u0018\u0000\u0000\u0085\u0086"+
		"\u0005\u001c\u0000\u0000\u0086\u0087\u0005\u0017\u0000\u0000\u0087\u0088"+
		"\u0005+\u0000\u0000\u0088\u0089\u0003\b\u0004\u0000\u0089\u008a\u0005"+
		"\u001b\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0084\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u00a3\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u00a3\u0005"+
		"\u0017\u0000\u0000\u0093\u0094\u0005\u0007\u0000\u0000\u0094\u00a3\u0003"+
		"\b\u0004\u0010\u0095\u0096\u0005)\u0000\u0000\u0096\u00a3\u0003\b\u0004"+
		"\u000b\u0097\u0098\u0005\u0011\u0000\u0000\u0098\u00a3\u0003\b\u0004\u0007"+
		"\u0099\u009a\u0005 \u0000\u0000\u009a\u009b\u0003\b\u0004\u0000\u009b"+
		"\u009c\u0005!\u0000\u0000\u009c\u00a3\u0001\u0000\u0000\u0000\u009d\u00a3"+
		"\u0005\u0018\u0000\u0000\u009e\u00a3\u0005\u0014\u0000\u0000\u009f\u00a3"+
		"\u0005,\u0000\u0000\u00a0\u00a3\u0005\u0012\u0000\u0000\u00a1\u00a3\u0005"+
		"\u0013\u0000\u0000\u00a2A\u0001\u0000\u0000\u0000\u00a2E\u0001\u0000\u0000"+
		"\u0000\u00a2R\u0001\u0000\u0000\u0000\u00a2Z\u0001\u0000\u0000\u0000\u00a2"+
		"`\u0001\u0000\u0000\u0000\u00a2j\u0001\u0000\u0000\u0000\u00a2\u0081\u0001"+
		"\u0000\u0000\u0000\u00a2\u0091\u0001\u0000\u0000\u0000\u00a2\u0093\u0001"+
		"\u0000\u0000\u0000\u00a2\u0095\u0001\u0000\u0000\u0000\u00a2\u0097\u0001"+
		"\u0000\u0000\u0000\u00a2\u0099\u0001\u0000\u0000\u0000\u00a2\u009d\u0001"+
		"\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00ce\u0001\u0000\u0000\u0000\u00a4\u00a5\n\u000f"+
		"\u0000\u0000\u00a5\u00a6\u0005\"\u0000\u0000\u00a6\u00cd\u0003\b\u0004"+
		"\u0010\u00a7\u00a8\n\u000e\u0000\u0000\u00a8\u00a9\u0005#\u0000\u0000"+
		"\u00a9\u00cd\u0003\b\u0004\u000f\u00aa\u00ab\n\r\u0000\u0000\u00ab\u00ac"+
		"\u0005$\u0000\u0000\u00ac\u00cd\u0003\b\u0004\u000e\u00ad\u00ae\n\f\u0000"+
		"\u0000\u00ae\u00af\u0005%\u0000\u0000\u00af\u00cd\u0003\b\u0004\r\u00b0"+
		"\u00b1\n\n\u0000\u0000\u00b1\u00b2\u0005\'\u0000\u0000\u00b2\u00cd\u0003"+
		"\b\u0004\u000b\u00b3\u00b4\n\t\u0000\u0000\u00b4\u00b5\u0005(\u0000\u0000"+
		"\u00b5\u00cd\u0003\b\u0004\n\u00b6\u00b7\n\b\u0000\u0000\u00b7\u00b8\u0005"+
		"&\u0000\u0000\u00b8\u00cd\u0003\b\u0004\t\u00b9\u00bc\n\u0018\u0000\u0000"+
		"\u00ba\u00bb\u0005\u001d\u0000\u0000\u00bb\u00bd\u0005\u0017\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0005*\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0018\u0000\u0000\u00c0\u00c9\u0005 \u0000\u0000\u00c1\u00c6"+
		"\u0003\b\u0004\u0000\u00c2\u00c3\u0005\u001e\u0000\u0000\u00c3\u00c5\u0003"+
		"\b\u0004\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c1\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005!\u0000"+
		"\u0000\u00cc\u00a4\u0001\u0000\u0000\u0000\u00cc\u00a7\u0001\u0000\u0000"+
		"\u0000\u00cc\u00aa\u0001\u0000\u0000\u0000\u00cc\u00ad\u0001\u0000\u0000"+
		"\u0000\u00cc\u00b0\u0001\u0000\u0000\u0000\u00cc\u00b3\u0001\u0000\u0000"+
		"\u0000\u00cc\u00b6\u0001\u0000\u0000\u0000\u00cc\u00b9\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\t\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u0014\r\u0013\u001b(+9;LOfpx|\u008d"+
		"\u00a2\u00bc\u00c6\u00c9\u00cc\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}