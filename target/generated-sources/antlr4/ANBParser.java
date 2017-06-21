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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ANB_Identifier=17, 
		ANB_COMMENT=18, WS=19, ANB_KNOW=20, ANB_KNOW_FUNCTION=21, ANB_CHANNEL=22;
	public static final int
		RULE_anb_Protocol = 0, RULE_anb_ProtocolName = 1, RULE_anb_Types = 2, 
		RULE_anb_Type = 3, RULE_anb_Knowlegde = 4, RULE_anb_know = 5, RULE_anb_Actions = 6, 
		RULE_anb_Action = 7, RULE_anb_SubAction = 8, RULE_anb_Goals = 9, RULE_anb_Goal = 10;
	public static final String[] ruleNames = {
		"anb_Protocol", "anb_ProtocolName", "anb_Types", "anb_Type", "anb_Knowlegde", 
		"anb_know", "anb_Actions", "anb_Action", "anb_SubAction", "anb_Goals", 
		"anb_Goal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "':'", "'Types'", "';'", "'Knowledge'", "'Actions'", 
		"'{'", "'}'", "'|'", "'Goals'", "'weakly'", "'authenticates'", "'on'", 
		"'secret'", "'between'", "'of'", null, null, null, null, null, "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "ANB_Identifier", "ANB_COMMENT", "WS", "ANB_KNOW", 
		"ANB_KNOW_FUNCTION", "ANB_CHANNEL"
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
	public static class Anb_ProtocolContext extends ParserRuleContext {
		public Anb_ProtocolNameContext anb_ProtocolName() {
			return getRuleContext(Anb_ProtocolNameContext.class,0);
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
		enterRule(_localctx, 0, RULE_anb_Protocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			anb_ProtocolName();
			setState(23);
			anb_Types();
			setState(24);
			anb_Knowlegde();
			setState(25);
			anb_Actions();
			setState(26);
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

	public static class Anb_ProtocolNameContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public Anb_ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_ProtocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_ProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_ProtocolName(this);
		}
	}

	public final Anb_ProtocolNameContext anb_ProtocolName() throws RecognitionException {
		Anb_ProtocolNameContext _localctx = new Anb_ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anb_ProtocolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(T__1);
			setState(30);
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
		public List<Anb_TypeContext> anb_Type() {
			return getRuleContexts(Anb_TypeContext.class);
		}
		public Anb_TypeContext anb_Type(int i) {
			return getRuleContext(Anb_TypeContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__2);
			setState(33);
			match(T__1);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(34);
					anb_Type();
					setState(35);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(37);
					anb_Type();
					}
					break;
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANB_Identifier );
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

	public static class Anb_TypeContext extends ParserRuleContext {
		public List<TerminalNode> ANB_Identifier() { return getTokens(ANBParser.ANB_Identifier); }
		public TerminalNode ANB_Identifier(int i) {
			return getToken(ANBParser.ANB_Identifier, i);
		}
		public TerminalNode ANB_KNOW() { return getToken(ANBParser.ANB_KNOW, 0); }
		public Anb_TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Type(this);
		}
	}

	public final Anb_TypeContext anb_Type() throws RecognitionException {
		Anb_TypeContext _localctx = new Anb_TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anb_Type);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ANB_Identifier);
				setState(43);
				match(ANB_KNOW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(ANB_Identifier);
				setState(45);
				match(ANB_Identifier);
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
		public List<Anb_knowContext> anb_know() {
			return getRuleContexts(Anb_knowContext.class);
		}
		public Anb_knowContext anb_know(int i) {
			return getRuleContext(Anb_knowContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__4);
			setState(49);
			match(T__1);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(50);
					anb_know();
					setState(51);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(53);
					anb_know();
					}
					break;
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANB_Identifier );
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

	public static class Anb_knowContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public TerminalNode ANB_KNOW() { return getToken(ANBParser.ANB_KNOW, 0); }
		public Anb_knowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_know; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_know(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_know(this);
		}
	}

	public final Anb_knowContext anb_know() throws RecognitionException {
		Anb_knowContext _localctx = new Anb_knowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_anb_know);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ANB_Identifier);
			setState(59);
			match(T__1);
			setState(60);
			match(ANB_KNOW);
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
		public List<Anb_ActionContext> anb_Action() {
			return getRuleContexts(Anb_ActionContext.class);
		}
		public Anb_ActionContext anb_Action(int i) {
			return getRuleContext(Anb_ActionContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__5);
			setState(63);
			match(T__1);
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				anb_Action();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANB_Identifier );
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
		public TerminalNode ANB_CHANNEL() { return getToken(ANBParser.ANB_CHANNEL, 0); }
		public List<Anb_SubActionContext> anb_SubAction() {
			return getRuleContexts(Anb_SubActionContext.class);
		}
		public Anb_SubActionContext anb_SubAction(int i) {
			return getRuleContext(Anb_SubActionContext.class,i);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ANB_Identifier);
			setState(70);
			match(ANB_CHANNEL);
			setState(71);
			match(ANB_Identifier);
			setState(72);
			match(T__1);
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					anb_SubAction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Anb_SubActionContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public TerminalNode ANB_KNOW() { return getToken(ANBParser.ANB_KNOW, 0); }
		public List<Anb_SubActionContext> anb_SubAction() {
			return getRuleContexts(Anb_SubActionContext.class);
		}
		public Anb_SubActionContext anb_SubAction(int i) {
			return getRuleContext(Anb_SubActionContext.class,i);
		}
		public Anb_SubActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_SubAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_SubAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_SubAction(this);
		}
	}

	public final Anb_SubActionContext anb_SubAction() throws RecognitionException {
		Anb_SubActionContext _localctx = new Anb_SubActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_anb_SubAction);
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ANB_Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(ANB_KNOW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(T__6);
				setState(81);
				anb_SubAction();
				setState(82);
				match(T__7);
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						anb_SubAction();
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__6);
				setState(90);
				match(T__8);
				setState(91);
				anb_SubAction();
				setState(92);
				match(T__8);
				setState(93);
				match(T__7);
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						anb_SubAction();
						}
						} 
					}
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Anb_GoalsContext extends ParserRuleContext {
		public List<Anb_GoalContext> anb_Goal() {
			return getRuleContexts(Anb_GoalContext.class);
		}
		public Anb_GoalContext anb_Goal(int i) {
			return getRuleContext(Anb_GoalContext.class,i);
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
		enterRule(_localctx, 18, RULE_anb_Goals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__9);
			setState(103);
			match(T__1);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				anb_Goal();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANB_Identifier || _la==ANB_KNOW );
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

	public static class Anb_GoalContext extends ParserRuleContext {
		public List<TerminalNode> ANB_KNOW() { return getTokens(ANBParser.ANB_KNOW); }
		public TerminalNode ANB_KNOW(int i) {
			return getToken(ANBParser.ANB_KNOW, i);
		}
		public List<TerminalNode> ANB_Identifier() { return getTokens(ANBParser.ANB_Identifier); }
		public TerminalNode ANB_Identifier(int i) {
			return getToken(ANBParser.ANB_Identifier, i);
		}
		public Anb_GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anb_Goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).enterAnb_Goal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBListener ) ((ANBListener)listener).exitAnb_Goal(this);
		}
	}

	public final Anb_GoalContext anb_Goal() throws RecognitionException {
		Anb_GoalContext _localctx = new Anb_GoalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_anb_Goal);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				match(T__10);
				setState(111);
				match(T__11);
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				match(T__12);
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(T__11);
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(T__12);
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				match(T__13);
				setState(122);
				match(T__14);
				setState(123);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				match(T__13);
				setState(126);
				match(T__15);
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\6\4)\n\4\r\4\16\4*\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\6\69\n\6\r\6\16\6:\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\bD\n\b\r\b\16"+
		"\bE\3\t\3\t\3\t\3\t\3\t\6\tM\n\t\r\t\16\tN\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"W\n\n\f\n\16\nZ\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nb\n\n\f\n\16\ne\13\n\5"+
		"\ng\n\n\3\13\3\13\3\13\6\13l\n\13\r\13\16\13m\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0083\n\f\3\f"+
		"\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\23\23\26\26\2\u0089\2\30\3\2"+
		"\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f<\3\2\2\2\16"+
		"@\3\2\2\2\20G\3\2\2\2\22f\3\2\2\2\24h\3\2\2\2\26\u0082\3\2\2\2\30\31\5"+
		"\4\3\2\31\32\5\6\4\2\32\33\5\n\6\2\33\34\5\16\b\2\34\35\5\24\13\2\35\3"+
		"\3\2\2\2\36\37\7\3\2\2\37 \7\4\2\2 !\7\23\2\2!\5\3\2\2\2\"#\7\5\2\2#("+
		"\7\4\2\2$%\5\b\5\2%&\7\6\2\2&)\3\2\2\2\')\5\b\5\2($\3\2\2\2(\'\3\2\2\2"+
		")*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,-\7\23\2\2-\61\7\26\2\2./\7"+
		"\23\2\2/\61\7\23\2\2\60,\3\2\2\2\60.\3\2\2\2\61\t\3\2\2\2\62\63\7\7\2"+
		"\2\638\7\4\2\2\64\65\5\f\7\2\65\66\7\6\2\2\669\3\2\2\2\679\5\f\7\28\64"+
		"\3\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<=\7\23"+
		"\2\2=>\7\4\2\2>?\7\26\2\2?\r\3\2\2\2@A\7\b\2\2AC\7\4\2\2BD\5\20\t\2CB"+
		"\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\17\3\2\2\2GH\7\23\2\2HI\7\30\2"+
		"\2IJ\7\23\2\2JL\7\4\2\2KM\5\22\n\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2O\21\3\2\2\2Pg\7\23\2\2Qg\7\26\2\2RS\7\t\2\2ST\5\22\n\2TX\7\n\2\2"+
		"UW\5\22\n\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Yg\3\2\2\2ZX\3\2\2"+
		"\2[\\\7\t\2\2\\]\7\13\2\2]^\5\22\n\2^_\7\13\2\2_c\7\n\2\2`b\5\22\n\2a"+
		"`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fP\3\2\2\2"+
		"fQ\3\2\2\2fR\3\2\2\2f[\3\2\2\2g\23\3\2\2\2hi\7\f\2\2ik\7\4\2\2jl\5\26"+
		"\f\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\25\3\2\2\2op\t\2\2\2pq\7"+
		"\r\2\2qr\7\16\2\2rs\t\2\2\2st\7\17\2\2t\u0083\t\2\2\2uv\t\2\2\2vw\7\16"+
		"\2\2wx\t\2\2\2xy\7\17\2\2y\u0083\t\2\2\2z{\t\2\2\2{|\7\20\2\2|}\7\21\2"+
		"\2}\u0083\t\2\2\2~\177\t\2\2\2\177\u0080\7\20\2\2\u0080\u0081\7\22\2\2"+
		"\u0081\u0083\t\2\2\2\u0082o\3\2\2\2\u0082u\3\2\2\2\u0082z\3\2\2\2\u0082"+
		"~\3\2\2\2\u0083\27\3\2\2\2\16(*\608:ENXcfm\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}