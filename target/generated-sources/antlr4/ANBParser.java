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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, ANB_Identifier=21, ANB_COMMENT=22, WS=23, 
		ANB_KNOW=24, ANB_KNOW_FUNCTION=25, ANB_KNOW_CONDITION=26, ANB_CHANNEL=27;
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
		null, "'Protocol'", "':'", "'Types'", "';'", "'Knowledge'", "'where'", 
		"','", "'Actions'", "'{'", "'}'", "'|'", "'('", "')'", "'Goals'", "'weakly'", 
		"'authenticates'", "'on'", "'secret'", "'between'", "'of'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "ANB_Identifier", 
		"ANB_COMMENT", "WS", "ANB_KNOW", "ANB_KNOW_FUNCTION", "ANB_KNOW_CONDITION", 
		"ANB_CHANNEL"
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
			setState(34);
			anb_Type();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(35);
				match(T__3);
				setState(36);
				anb_Type();
				}
				}
				setState(41);
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
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
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
			setState(50);
			anb_know();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << ANB_Identifier))) != 0)) {
				{
				{
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(51);
					match(T__3);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				anb_know();
				}
				}
				setState(62);
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

	public static class Anb_knowContext extends ParserRuleContext {
		public TerminalNode ANB_Identifier() { return getToken(ANBParser.ANB_Identifier, 0); }
		public TerminalNode ANB_KNOW() { return getToken(ANBParser.ANB_KNOW, 0); }
		public List<TerminalNode> ANB_KNOW_CONDITION() { return getTokens(ANBParser.ANB_KNOW_CONDITION); }
		public TerminalNode ANB_KNOW_CONDITION(int i) {
			return getToken(ANBParser.ANB_KNOW_CONDITION, i);
		}
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
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANB_Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ANB_Identifier);
				setState(64);
				match(T__1);
				setState(65);
				match(ANB_KNOW);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__5);
				setState(67);
				match(ANB_KNOW_CONDITION);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(68);
					match(T__6);
					setState(69);
					match(ANB_KNOW_CONDITION);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
			setState(77);
			match(T__7);
			setState(78);
			match(T__1);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				anb_Action();
				}
				}
				setState(82); 
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
			setState(84);
			match(ANB_Identifier);
			setState(85);
			match(ANB_CHANNEL);
			setState(86);
			match(ANB_Identifier);
			setState(87);
			match(T__1);
			setState(89); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(88);
					anb_SubAction(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public List<TerminalNode> ANB_KNOW() { return getTokens(ANBParser.ANB_KNOW); }
		public TerminalNode ANB_KNOW(int i) {
			return getToken(ANBParser.ANB_KNOW, i);
		}
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
		return anb_SubAction(0);
	}

	private Anb_SubActionContext anb_SubAction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Anb_SubActionContext _localctx = new Anb_SubActionContext(_ctx, _parentState);
		Anb_SubActionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_anb_SubAction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(94);
				match(ANB_Identifier);
				}
				break;
			case 2:
				{
				setState(95);
				match(ANB_KNOW);
				}
				break;
			case 3:
				{
				setState(96);
				match(T__8);
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case ANB_Identifier:
				case ANB_KNOW:
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(97);
						match(ANB_KNOW);
						}
						break;
					case 2:
						{
						setState(98);
						anb_SubAction(0);
						}
						break;
					}
					}
					break;
				case T__6:
				case T__9:
					{
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(101);
						match(T__6);
						setState(102);
						anb_SubAction(0);
						}
						}
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110);
				match(T__9);
				setState(111);
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
				{
				setState(112);
				match(T__8);
				setState(113);
				match(T__10);
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case ANB_Identifier:
				case ANB_KNOW:
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(114);
						match(ANB_KNOW);
						}
						break;
					case 2:
						{
						setState(115);
						anb_SubAction(0);
						}
						break;
					}
					}
					break;
				case T__6:
				case T__10:
					{
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(118);
						match(T__6);
						setState(119);
						anb_SubAction(0);
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				match(T__10);
				setState(128);
				match(T__9);
				setState(129);
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
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new Anb_SubActionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_anb_SubAction);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						match(T__11);
						setState(134);
						anb_SubAction(0);
						setState(135);
						match(T__12);
						}
						break;
					case 2:
						{
						_localctx = new Anb_SubActionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_anb_SubAction);
						setState(137);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(140); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(138);
								match(T__6);
								setState(139);
								anb_SubAction(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(142); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(149);
			match(T__13);
			setState(150);
			match(T__1);
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				anb_Goal();
				}
				}
				setState(154); 
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
		public TerminalNode ANB_CHANNEL() { return getToken(ANBParser.ANB_CHANNEL, 0); }
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				match(T__14);
				setState(158);
				match(T__15);
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				match(T__16);
				setState(161);
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
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				match(T__15);
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				match(T__16);
				setState(166);
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
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				match(T__17);
				setState(169);
				match(T__18);
				setState(170);
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
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==ANB_Identifier || _la==ANB_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				match(T__17);
				setState(173);
				match(T__19);
				setState(174);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(ANB_Identifier);
				setState(176);
				match(ANB_CHANNEL);
				setState(177);
				match(ANB_Identifier);
				setState(178);
				match(T__1);
				setState(179);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return anb_SubAction_sempred((Anb_SubActionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean anb_SubAction_sempred(Anb_SubActionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00b9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3"+
		"\6\7\6\67\n\6\f\6\16\6:\13\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\5\7N\n\7\3\b\3\b\3\b\6\bS\n\b\r"+
		"\b\16\bT\3\t\3\t\3\t\3\t\3\t\6\t\\\n\t\r\t\16\t]\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nf\n\n\3\n\3\n\7\nj\n\n\f\n\16\nm\13\n\5\no\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\nw\n\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\5\n\u0080\n\n\3\n\3\n"+
		"\3\n\5\n\u0085\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u008f\n\n\r\n\16"+
		"\n\u0090\7\n\u0093\n\n\f\n\16\n\u0096\13\n\3\13\3\13\3\13\6\13\u009b\n"+
		"\13\r\13\16\13\u009c\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b7\n\f\3\f\2\3\22"+
		"\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\27\27\32\32\2\u00c6\2\30\3\2\2\2"+
		"\4\36\3\2\2\2\6\"\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\fM\3\2\2\2\16O\3\2"+
		"\2\2\20V\3\2\2\2\22\u0084\3\2\2\2\24\u0097\3\2\2\2\26\u00b6\3\2\2\2\30"+
		"\31\5\4\3\2\31\32\5\6\4\2\32\33\5\n\6\2\33\34\5\16\b\2\34\35\5\24\13\2"+
		"\35\3\3\2\2\2\36\37\7\3\2\2\37 \7\4\2\2 !\7\27\2\2!\5\3\2\2\2\"#\7\5\2"+
		"\2#$\7\4\2\2$)\5\b\5\2%&\7\6\2\2&(\5\b\5\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2"+
		"\2\2)*\3\2\2\2*\7\3\2\2\2+)\3\2\2\2,-\7\27\2\2-\61\7\32\2\2./\7\27\2\2"+
		"/\61\7\27\2\2\60,\3\2\2\2\60.\3\2\2\2\61\t\3\2\2\2\62\63\7\7\2\2\63\64"+
		"\7\4\2\2\64>\5\f\7\2\65\67\7\6\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;=\5\f\7\2<8\3\2\2\2=@\3\2\2\2><\3\2\2"+
		"\2>?\3\2\2\2?\13\3\2\2\2@>\3\2\2\2AB\7\27\2\2BC\7\4\2\2CN\7\32\2\2DE\7"+
		"\b\2\2EJ\7\34\2\2FG\7\t\2\2GI\7\34\2\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2J"+
		"K\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MA\3\2\2\2MD\3\2\2\2N\r\3\2\2\2OP\7\n\2\2"+
		"PR\7\4\2\2QS\5\20\t\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\17\3\2"+
		"\2\2VW\7\27\2\2WX\7\35\2\2XY\7\27\2\2Y[\7\4\2\2Z\\\5\22\n\2[Z\3\2\2\2"+
		"\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\21\3\2\2\2_`\b\n\1\2`\u0085\7\27\2\2"+
		"a\u0085\7\32\2\2bn\7\13\2\2cf\7\32\2\2df\5\22\n\2ec\3\2\2\2ed\3\2\2\2"+
		"fo\3\2\2\2gh\7\t\2\2hj\5\22\n\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2"+
		"\2lo\3\2\2\2mk\3\2\2\2ne\3\2\2\2nk\3\2\2\2op\3\2\2\2pq\7\f\2\2q\u0085"+
		"\t\2\2\2rs\7\13\2\2s\177\7\r\2\2tw\7\32\2\2uw\5\22\n\2vt\3\2\2\2vu\3\2"+
		"\2\2w\u0080\3\2\2\2xy\7\t\2\2y{\5\22\n\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177v\3\2\2\2\177|\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\7\r\2\2\u0082\u0083\7\f\2\2\u0083\u0085\t\2\2\2\u0084"+
		"_\3\2\2\2\u0084a\3\2\2\2\u0084b\3\2\2\2\u0084r\3\2\2\2\u0085\u0094\3\2"+
		"\2\2\u0086\u0087\f\4\2\2\u0087\u0088\7\16\2\2\u0088\u0089\5\22\n\2\u0089"+
		"\u008a\7\17\2\2\u008a\u0093\3\2\2\2\u008b\u008e\f\3\2\2\u008c\u008d\7"+
		"\t\2\2\u008d\u008f\5\22\n\2\u008e\u008c\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0086\3\2"+
		"\2\2\u0092\u008b\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\20\2"+
		"\2\u0098\u009a\7\4\2\2\u0099\u009b\5\26\f\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\25\3\2\2"+
		"\2\u009e\u009f\t\2\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\7\22\2\2\u00a1"+
		"\u00a2\t\2\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00b7\t\2\2\2\u00a4\u00a5\t"+
		"\2\2\2\u00a5\u00a6\7\22\2\2\u00a6\u00a7\t\2\2\2\u00a7\u00a8\7\23\2\2\u00a8"+
		"\u00b7\t\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\7"+
		"\25\2\2\u00ac\u00b7\t\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\u00af\7\24\2\2\u00af"+
		"\u00b0\7\26\2\2\u00b0\u00b7\t\2\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\7"+
		"\35\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00b5\7\4\2\2\u00b5\u00b7\7\27\2\2"+
		"\u00b6\u009e\3\2\2\2\u00b6\u00a4\3\2\2\2\u00b6\u00a9\3\2\2\2\u00b6\u00ad"+
		"\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\27\3\2\2\2\26)\608>JMT]eknv|\177\u0084"+
		"\u0090\u0092\u0094\u009c\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}