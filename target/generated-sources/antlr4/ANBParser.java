// Generated from ANBParser.g4 by ANTLR 4.7
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
		ANB_COMMENT=1, ANB_PROTOCOLE_TAG=2, ANB_PROTOCOLTYPE=3, ANB_TYPES_TAG=4, 
		ANB_TYPE_FUNCTIONS=5, ANB_KNOWLEDGE_TAG=6, ANB_KNOW=7, ANB_VARIABLES=8, 
		ANB_KNOW_FUNCTION=9, ANB_ACTIONS_TAG=10, ANB_ACTION_PREDOUBLEDOT=11, ANB_ACTION_POSTDOUBLEDOT=12, 
		ANB_GOALS_TAG=13, Identifier=14, Trick=15, ANB_END_LINE=16, ANB_DOUBLE_DOT=17, 
		ANB_SPECIAL_CHARACTER=18, WS=19;
	public static final int
		RULE_anbDocument = 0, RULE_protocolType = 1, RULE_types = 2, RULE_typeFuntions = 3, 
		RULE_knowledge = 4, RULE_know = 5, RULE_actions = 6, RULE_action = 7, 
		RULE_goals = 8;
	public static final String[] ruleNames = {
		"anbDocument", "protocolType", "types", "typeFuntions", "knowledge", "know", 
		"actions", "action", "goals"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'Types:'", null, "'Knowledge:'", null, null, 
		null, null, null, null, "'Goals:'", null, null, "';'", "':'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANB_COMMENT", "ANB_PROTOCOLE_TAG", "ANB_PROTOCOLTYPE", "ANB_TYPES_TAG", 
		"ANB_TYPE_FUNCTIONS", "ANB_KNOWLEDGE_TAG", "ANB_KNOW", "ANB_VARIABLES", 
		"ANB_KNOW_FUNCTION", "ANB_ACTIONS_TAG", "ANB_ACTION_PREDOUBLEDOT", "ANB_ACTION_POSTDOUBLEDOT", 
		"ANB_GOALS_TAG", "Identifier", "Trick", "ANB_END_LINE", "ANB_DOUBLE_DOT", 
		"ANB_SPECIAL_CHARACTER", "WS"
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
	public String getGrammarFileName() { return "ANBParser.g4"; }

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
	public static class AnbDocumentContext extends ParserRuleContext {
		public ProtocolTypeContext protocolType() {
			return getRuleContext(ProtocolTypeContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public KnowledgeContext knowledge() {
			return getRuleContext(KnowledgeContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public GoalsContext goals() {
			return getRuleContext(GoalsContext.class,0);
		}
		public AnbDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterAnbDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitAnbDocument(this);
		}
	}

	public final AnbDocumentContext anbDocument() throws RecognitionException {
		AnbDocumentContext _localctx = new AnbDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_anbDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(18);
			protocolType();
			}
			{
			setState(19);
			types();
			}
			{
			setState(20);
			knowledge();
			}
			{
			setState(21);
			actions();
			}
			{
			setState(22);
			goals();
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

	public static class ProtocolTypeContext extends ParserRuleContext {
		public TerminalNode ANB_PROTOCOLE_TAG() { return getToken(ANBParser.ANB_PROTOCOLE_TAG, 0); }
		public TerminalNode WS() { return getToken(ANBParser.WS, 0); }
		public ProtocolTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterProtocolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitProtocolType(this);
		}
	}

	public final ProtocolTypeContext protocolType() throws RecognitionException {
		ProtocolTypeContext _localctx = new ProtocolTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_protocolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(ANB_PROTOCOLE_TAG);
			setState(25);
			match(WS);
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode ANB_TYPES_TAG() { return getToken(ANBParser.ANB_TYPES_TAG, 0); }
		public List<TerminalNode> WS() { return getTokens(ANBParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ANBParser.WS, i);
		}
		public List<TypeFuntionsContext> typeFuntions() {
			return getRuleContexts(TypeFuntionsContext.class);
		}
		public TypeFuntionsContext typeFuntions(int i) {
			return getRuleContext(TypeFuntionsContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(ANB_TYPES_TAG);
			setState(28);
			match(WS);
			setState(29);
			typeFuntions();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(30);
				match(WS);
				setState(31);
				typeFuntions();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeFuntionsContext extends ParserRuleContext {
		public TerminalNode ANB_TYPE_FUNCTIONS() { return getToken(ANBParser.ANB_TYPE_FUNCTIONS, 0); }
		public TerminalNode ANB_END_LINE() { return getToken(ANBParser.ANB_END_LINE, 0); }
		public TerminalNode WS() { return getToken(ANBParser.WS, 0); }
		public TypeFuntionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFuntions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterTypeFuntions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitTypeFuntions(this);
		}
	}

	public final TypeFuntionsContext typeFuntions() throws RecognitionException {
		TypeFuntionsContext _localctx = new TypeFuntionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeFuntions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(37);
			match(ANB_TYPE_FUNCTIONS);
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==ANB_END_LINE || _la==WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class KnowledgeContext extends ParserRuleContext {
		public TerminalNode ANB_KNOWLEDGE_TAG() { return getToken(ANBParser.ANB_KNOWLEDGE_TAG, 0); }
		public List<TerminalNode> WS() { return getTokens(ANBParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ANBParser.WS, i);
		}
		public List<KnowContext> know() {
			return getRuleContexts(KnowContext.class);
		}
		public KnowContext know(int i) {
			return getRuleContext(KnowContext.class,i);
		}
		public KnowledgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knowledge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterKnowledge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitKnowledge(this);
		}
	}

	public final KnowledgeContext knowledge() throws RecognitionException {
		KnowledgeContext _localctx = new KnowledgeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_knowledge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ANB_KNOWLEDGE_TAG);
			setState(41);
			match(WS);
			setState(42);
			know();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(43);
				match(WS);
				setState(44);
				know();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class KnowContext extends ParserRuleContext {
		public TerminalNode ANB_KNOW() { return getToken(ANBParser.ANB_KNOW, 0); }
		public List<TerminalNode> WS() { return getTokens(ANBParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ANBParser.WS, i);
		}
		public TerminalNode ANB_VARIABLES() { return getToken(ANBParser.ANB_VARIABLES, 0); }
		public TerminalNode ANB_END_LINE() { return getToken(ANBParser.ANB_END_LINE, 0); }
		public KnowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_know; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterKnow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitKnow(this);
		}
	}

	public final KnowContext know() throws RecognitionException {
		KnowContext _localctx = new KnowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_know);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50);
			match(ANB_KNOW);
			setState(51);
			match(WS);
			setState(52);
			match(ANB_VARIABLES);
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==ANB_END_LINE || _la==WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ActionsContext extends ParserRuleContext {
		public TerminalNode ANB_ACTIONS_TAG() { return getToken(ANBParser.ANB_ACTIONS_TAG, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitActions(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_actions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ANB_ACTIONS_TAG);
			setState(56);
			action();
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ANB_ACTION_PREDOUBLEDOT() { return getToken(ANBParser.ANB_ACTION_PREDOUBLEDOT, 0); }
		public TerminalNode ANB_DOUBLE_DOT() { return getToken(ANBParser.ANB_DOUBLE_DOT, 0); }
		public TerminalNode WS() { return getToken(ANBParser.WS, 0); }
		public TerminalNode ANB_ACTION_POSTDOUBLEDOT() { return getToken(ANBParser.ANB_ACTION_POSTDOUBLEDOT, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ANB_ACTION_PREDOUBLEDOT);
			setState(59);
			match(ANB_DOUBLE_DOT);
			setState(60);
			match(WS);
			setState(61);
			match(ANB_ACTION_POSTDOUBLEDOT);
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

	public static class GoalsContext extends ParserRuleContext {
		public TerminalNode ANB_GOALS_TAG() { return getToken(ANBParser.ANB_GOALS_TAG, 0); }
		public GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).enterGoals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBParserListener ) ((ANBParserListener)listener).exitGoals(this);
		}
	}

	public final GoalsContext goals() throws RecognitionException {
		GoalsContext _localctx = new GoalsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_goals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ANB_GOALS_TAG);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4#\n\4\f\4\16\4&\13\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n"+
		"\f\16\20\22\2\3\4\2\22\22\25\25\2<\2\24\3\2\2\2\4\32\3\2\2\2\6\35\3\2"+
		"\2\2\b\'\3\2\2\2\n*\3\2\2\2\f\64\3\2\2\2\169\3\2\2\2\20<\3\2\2\2\22A\3"+
		"\2\2\2\24\25\5\4\3\2\25\26\5\6\4\2\26\27\5\n\6\2\27\30\5\16\b\2\30\31"+
		"\5\22\n\2\31\3\3\2\2\2\32\33\7\4\2\2\33\34\7\25\2\2\34\5\3\2\2\2\35\36"+
		"\7\6\2\2\36\37\7\25\2\2\37$\5\b\5\2 !\7\25\2\2!#\5\b\5\2\" \3\2\2\2#&"+
		"\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\7\3\2\2\2&$\3\2\2\2\'(\7\7\2\2()\t\2\2"+
		"\2)\t\3\2\2\2*+\7\b\2\2+,\7\25\2\2,\61\5\f\7\2-.\7\25\2\2.\60\5\f\7\2"+
		"/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\13\3\2\2\2\63\61"+
		"\3\2\2\2\64\65\7\t\2\2\65\66\7\25\2\2\66\67\7\n\2\2\678\t\2\2\28\r\3\2"+
		"\2\29:\7\f\2\2:;\5\20\t\2;\17\3\2\2\2<=\7\r\2\2=>\7\23\2\2>?\7\25\2\2"+
		"?@\7\16\2\2@\21\3\2\2\2AB\7\17\2\2B\23\3\2\2\2\4$\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}