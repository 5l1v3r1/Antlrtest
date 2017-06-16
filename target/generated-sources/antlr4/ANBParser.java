// Generated from ANB.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ANB_Identifier=12, ANB_String=13, ANB_COMMENT=14, WS=15, 
		ANB_Message=16, ANB_ListIdentifier=17, ANB_ListKnow=18, ANB_VARIABLES=19, 
		ANB_KNOW_FUNCTION=20;
	public static final int
		RULE_anb_Document = 0, RULE_anb_Protocol = 1, RULE_anb_Types = 2, RULE_anb_type = 3, 
		RULE_anb_Knowlegde = 4, RULE_anb_Know = 5, RULE_anb_Actions = 6, RULE_anb_Action = 7, 
		RULE_anb_Goals = 8, RULE_anb_goal = 9;
	public static final String[] ruleNames = {
		"anb_Document", "anb_Protocol", "anb_Types", "anb_type", "anb_Knowlegde", 
		"anb_Know", "anb_Actions", "anb_Action", "anb_Goals", "anb_goal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "':'", "'Types'", "';'", "'Knowledge'", "'Actions'", 
		"'->'", "'('", "','", "'<-'", "'Goals'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ANB_Identifier", "ANB_String", "ANB_COMMENT", "WS", "ANB_Message", "ANB_ListIdentifier", 
		"ANB_ListKnow", "ANB_VARIABLES", "ANB_KNOW_FUNCTION"
	};
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
	public String getGrammarFileName() { return "ANB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANBParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Anb_DocumentContext extends ParserRuleContext {
		public Anb_ProtocolContext anb_Protocol() {
			return getRuleContext(Anb_ProtocolContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(ANBParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ANBParser.WS, i);
		}
		public Anb_TypesContext anb_Types() {
			return getRuleContext(Anb_TypesContext.class,0);
		}
		public Anb_KnowlegdeContext anb_Knowlegde() {
			return getRuleContext(Anb_KnowlegdeContext.class,0);
		}
		public Anb_ActionsContext anb_Actions() {
			return getRuleContext(Anb_ActionsContext.class,0);
		}
		public Anb_GoalsContext anb_Goals() {
			return getRuleContext(Anb_GoalsContext.class,0);
		}
		public Anb_DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Document(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Document(this);
		}
	}

	public final Anb_DocumentContext anb_Document() throws RecognitionException {
		Anb_DocumentContext _localctx = new Anb_DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_anb_Document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			anb_Protocol();
			setState(21);
			match(WS);
			setState(22);
			anb_Types();
			setState(23);
			match(WS);
			setState(24);
			anb_Knowlegde();
			setState(25);
			match(WS);
			setState(26);
			anb_Actions();
			setState(27);
			match(WS);
			setState(28);
			anb_Goals();
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

	public static class Anb_ProtocolContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ANBParser.WS, 0); }
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public Anb_ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Protocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Protocol(this);
		}
	}

	public final Anb_ProtocolContext anb_Protocol() throws RecognitionException {
		Anb_ProtocolContext _localctx = new Anb_ProtocolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anb_Protocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(T__1);
			setState(32);
			match(WS);
			setState(33);
			match(ANB_Identifier);
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

	public static class Anb_TypesContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ANBParser.WS, 0); }
		public Anb_typeContext anb_type() {
			return getRuleContext(Anb_typeContext.class,0);
		}
		public Anb_TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Types(this);
		}
	}

	public final Anb_TypesContext anb_Types() throws RecognitionException {
		Anb_TypesContext _localctx = new Anb_TypesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anb_Types);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__2);
			setState(36);
			match(T__1);
			setState(37);
			match(WS);
			setState(38);
			anb_type();
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

	public static class Anb_typeContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public List<TerminalNode> WS() { return getTokens(ANBParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ANBParser.WS, i);
		}
		public TerminalNode ANB_ListIdentifier() { return getToken(ANBParser.ANB_ListIdentifier, 0); }
		public Anb_typeContext anb_type() {
			return getRuleContext(Anb_typeContext.class,0);
		}
		public Anb_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_type(this);
		}
	}

	public final Anb_typeContext anb_type() throws RecognitionException {
		Anb_typeContext _localctx = new Anb_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anb_type);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(ANB_Identifier);
				setState(41);
				match(WS);
				setState(42);
				match(ANB_ListIdentifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(ANB_Identifier);
				setState(44);
				match(WS);
				setState(45);
				match(ANB_ListIdentifier);
				setState(46);
				match(T__3);
				setState(47);
				match(WS);
				setState(48);
				anb_type();
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

	public static class Anb_KnowlegdeContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ANBParser.WS, 0); }
		public Anb_KnowContext anb_Know() {
			return getRuleContext(Anb_KnowContext.class,0);
		}
		public Anb_KnowlegdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Knowlegde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Knowlegde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Knowlegde(this);
		}
	}

	public final Anb_KnowlegdeContext anb_Knowlegde() throws RecognitionException {
		Anb_KnowlegdeContext _localctx = new Anb_KnowlegdeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anb_Knowlegde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__4);
			setState(52);
			match(T__1);
			setState(53);
			match(WS);
			setState(54);
			anb_Know();
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

	public static class Anb_KnowContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public List<TerminalNode> WS() { return getTokens(ANBParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ANBParser.WS, i);
		}
		public TerminalNode ANB_VARIABLES() { return getToken(ANBParser.ANB_VARIABLES, 0); }
		public Anb_KnowContext anb_Know() {
			return getRuleContext(Anb_KnowContext.class,0);
		}
		public Anb_KnowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Know; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Know(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Know(this);
		}
	}

	public final Anb_KnowContext anb_Know() throws RecognitionException {
		Anb_KnowContext _localctx = new Anb_KnowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_anb_Know);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(ANB_Identifier);
				setState(57);
				match(T__1);
				setState(58);
				match(WS);
				setState(59);
				match(ANB_VARIABLES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(ANB_Identifier);
				setState(61);
				match(T__1);
				setState(62);
				match(WS);
				setState(63);
				match(ANB_VARIABLES);
				setState(64);
				match(T__3);
				setState(65);
				match(WS);
				setState(66);
				anb_Know();
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

	public static class Anb_ActionsContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ANBParser.WS, 0); }
		public Anb_ActionContext anb_Action() {
			return getRuleContext(Anb_ActionContext.class,0);
		}
		public Anb_ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Actions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Actions(this);
		}
	}

	public final Anb_ActionsContext anb_Actions() throws RecognitionException {
		Anb_ActionsContext _localctx = new Anb_ActionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_anb_Actions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__5);
			setState(70);
			match(T__1);
			setState(71);
			match(WS);
			setState(72);
			anb_Action();
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

	public static class Anb_ActionContext extends ParserRuleContext {
		public List<TerminalNode> ANB_Identifier() { return getTokens(ANBParser.ANB_Identifier); }
		public TerminalNode ANB_Identifier(int i) {
			return getToken(ANBParser.ANB_Identifier, i);
		}
		public TerminalNode ANB_Message() { return getToken(ANBParser.ANB_Message, 0); }
		public Anb_ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Action(this);
		}
	}

	public final Anb_ActionContext anb_Action() throws RecognitionException {
		Anb_ActionContext _localctx = new Anb_ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_anb_Action);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(ANB_Identifier);
				setState(75);
				match(T__6);
				setState(76);
				match(ANB_Identifier);
				setState(77);
				match(T__7);
				setState(78);
				match(ANB_Identifier);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(79);
					match(T__8);
					setState(80);
					match(ANB_Identifier);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__1);
				setState(87);
				match(ANB_Message);
				setState(88);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ANB_Identifier);
				setState(90);
				match(T__9);
				setState(91);
				match(ANB_Identifier);
				setState(92);
				match(T__7);
				setState(93);
				match(ANB_Identifier);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(94);
					match(T__8);
					setState(95);
					match(ANB_Identifier);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__1);
				setState(102);
				match(ANB_Message);
				setState(103);
				match(T__3);
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

	public static class Anb_GoalsContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(ANBParser.WS, 0); }
		public Anb_goalContext anb_goal() {
			return getRuleContext(Anb_goalContext.class,0);
		}
		public Anb_GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Goals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Goals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Goals(this);
		}
	}

	public final Anb_GoalsContext anb_Goals() throws RecognitionException {
		Anb_GoalsContext _localctx = new Anb_GoalsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_anb_Goals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__10);
			setState(107);
			match(T__1);
			setState(108);
			match(WS);
			setState(109);
			anb_goal();
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

	public static class Anb_goalContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public Anb_goalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_goal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_goal(this);
		}
	}

	public final Anb_goalContext anb_goal() throws RecognitionException {
		Anb_goalContext _localctx = new Anb_goalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_anb_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ANB_Identifier);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26t\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7F\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tT\n\t\f\t\16\tW\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tc\n\t\f\t\16\tf\13\t\3\t\3\t\3\t\5"+
		"\tk\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22"+
		"\24\2\2\2n\2\26\3\2\2\2\4 \3\2\2\2\6%\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2"+
		"\2\fE\3\2\2\2\16G\3\2\2\2\20j\3\2\2\2\22l\3\2\2\2\24q\3\2\2\2\26\27\5"+
		"\4\3\2\27\30\7\21\2\2\30\31\5\6\4\2\31\32\7\21\2\2\32\33\5\n\6\2\33\34"+
		"\7\21\2\2\34\35\5\16\b\2\35\36\7\21\2\2\36\37\5\22\n\2\37\3\3\2\2\2 !"+
		"\7\3\2\2!\"\7\4\2\2\"#\7\21\2\2#$\7\16\2\2$\5\3\2\2\2%&\7\5\2\2&\'\7\4"+
		"\2\2\'(\7\21\2\2()\5\b\5\2)\7\3\2\2\2*+\7\16\2\2+,\7\21\2\2,\64\7\23\2"+
		"\2-.\7\16\2\2./\7\21\2\2/\60\7\23\2\2\60\61\7\6\2\2\61\62\7\21\2\2\62"+
		"\64\5\b\5\2\63*\3\2\2\2\63-\3\2\2\2\64\t\3\2\2\2\65\66\7\7\2\2\66\67\7"+
		"\4\2\2\678\7\21\2\289\5\f\7\29\13\3\2\2\2:;\7\16\2\2;<\7\4\2\2<=\7\21"+
		"\2\2=F\7\25\2\2>?\7\16\2\2?@\7\4\2\2@A\7\21\2\2AB\7\25\2\2BC\7\6\2\2C"+
		"D\7\21\2\2DF\5\f\7\2E:\3\2\2\2E>\3\2\2\2F\r\3\2\2\2GH\7\b\2\2HI\7\4\2"+
		"\2IJ\7\21\2\2JK\5\20\t\2K\17\3\2\2\2LM\7\16\2\2MN\7\t\2\2NO\7\16\2\2O"+
		"P\7\n\2\2PU\7\16\2\2QR\7\13\2\2RT\7\16\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\4\2\2YZ\7\22\2\2Zk\7\6\2\2[\\\7\16"+
		"\2\2\\]\7\f\2\2]^\7\16\2\2^_\7\n\2\2_d\7\16\2\2`a\7\13\2\2ac\7\16\2\2"+
		"b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\4\2\2"+
		"hi\7\22\2\2ik\7\6\2\2jL\3\2\2\2j[\3\2\2\2k\21\3\2\2\2lm\7\r\2\2mn\7\4"+
		"\2\2no\7\21\2\2op\5\24\13\2p\23\3\2\2\2qr\7\16\2\2r\25\3\2\2\2\7\63EU"+
		"dj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}