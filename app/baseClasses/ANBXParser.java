// Generated from ANBX.g4 by ANTLR 4.7

    package baseClasses;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANBXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ANBX_Identifier=25, ANBX_COMMENT=26, WS=27, ANBX_DELIMITER=28, ANBX_KNOW_RESERVEDWORDS=29, 
		ANBX_KNOW=30, ANBX_KNOW_FUNCTION=31, ANBX_KNOW_CONDITION=32, ANBX_CHANNEL=33, 
		ANBX_OPERATION=34;
	public static final int
		RULE_anbx_Protocol = 0, RULE_anbx_ProtocolName = 1, RULE_anbx_Types = 2, 
		RULE_anbx_Type = 3, RULE_anbx_Definitions = 4, RULE_anbx_Definition = 5, 
		RULE_anbx_SubDefinition = 6, RULE_anbx_Knowlegde = 7, RULE_anbx_Know = 8, 
		RULE_anbx_Actions = 9, RULE_anbx_Action = 10, RULE_anbx_SubAction = 11, 
		RULE_anbx_Goals = 12, RULE_anbx_Goal = 13;
	public static final String[] ruleNames = {
		"anbx_Protocol", "anbx_ProtocolName", "anbx_Types", "anbx_Type", "anbx_Definitions", 
		"anbx_Definition", "anbx_SubDefinition", "anbx_Knowlegde", "anbx_Know", 
		"anbx_Actions", "anbx_Action", "anbx_SubAction", "anbx_Goals", "anbx_Goal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "'Types'", "';'", "'['", "']'", "'Definitions'", "'{'", 
		"'}'", "'|'", "'Knowledge'", "'where'", "'share'", "'agree'", "'Actions'", 
		"'('", "'-'", "')'", "'Goals'", "'weakly'", "'authenticates'", "'on'", 
		"'secret'", "'between'", "'of'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ANBX_Identifier", "ANBX_COMMENT", "WS", "ANBX_DELIMITER", "ANBX_KNOW_RESERVEDWORDS", 
		"ANBX_KNOW", "ANBX_KNOW_FUNCTION", "ANBX_KNOW_CONDITION", "ANBX_CHANNEL", 
		"ANBX_OPERATION"
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
	public String getGrammarFileName() { return "ANBX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANBXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Anbx_ProtocolContext extends ParserRuleContext {
		public Anbx_ProtocolNameContext anbx_ProtocolName() {
			return getRuleContext(Anbx_ProtocolNameContext.class,0);
		}
		public Anbx_TypesContext anbx_Types() {
			return getRuleContext(Anbx_TypesContext.class,0);
		}
		public Anbx_KnowlegdeContext anbx_Knowlegde() {
			return getRuleContext(Anbx_KnowlegdeContext.class,0);
		}
		public Anbx_ActionsContext anbx_Actions() {
			return getRuleContext(Anbx_ActionsContext.class,0);
		}
		public Anbx_GoalsContext anbx_Goals() {
			return getRuleContext(Anbx_GoalsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ANBXParser.EOF, 0); }
		public List<Anbx_DefinitionsContext> anbx_Definitions() {
			return getRuleContexts(Anbx_DefinitionsContext.class);
		}
		public Anbx_DefinitionsContext anbx_Definitions(int i) {
			return getRuleContext(Anbx_DefinitionsContext.class,i);
		}
		public Anbx_ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Protocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Protocol(this);
		}
	}

	public final Anbx_ProtocolContext anbx_Protocol() throws RecognitionException {
		Anbx_ProtocolContext _localctx = new Anbx_ProtocolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_anbx_Protocol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			anbx_ProtocolName();
			setState(29);
			anbx_Types();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(30);
				anbx_Definitions();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			anbx_Knowlegde();
			setState(37);
			anbx_Actions();
			setState(38);
			anbx_Goals();
			setState(39);
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

	public static class Anbx_ProtocolNameContext extends ParserRuleContext {
		public TerminalNode ANBX_DELIMITER() { return getToken(ANBXParser.ANBX_DELIMITER, 0); }
		public List<TerminalNode> ANBX_Identifier() { return getTokens(ANBXParser.ANBX_Identifier); }
		public TerminalNode ANBX_Identifier(int i) {
			return getToken(ANBXParser.ANBX_Identifier, i);
		}
		public Anbx_ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_ProtocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_ProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_ProtocolName(this);
		}
	}

	public final Anbx_ProtocolNameContext anbx_ProtocolName() throws RecognitionException {
		Anbx_ProtocolNameContext _localctx = new Anbx_ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anbx_ProtocolName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(ANBX_DELIMITER);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				match(ANBX_Identifier);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANBX_Identifier );
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

	public static class Anbx_TypesContext extends ParserRuleContext {
		public TerminalNode ANBX_DELIMITER() { return getToken(ANBXParser.ANBX_DELIMITER, 0); }
		public List<Anbx_TypeContext> anbx_Type() {
			return getRuleContexts(Anbx_TypeContext.class);
		}
		public Anbx_TypeContext anbx_Type(int i) {
			return getRuleContext(Anbx_TypeContext.class,i);
		}
		public Anbx_TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Types(this);
		}
	}

	public final Anbx_TypesContext anbx_Types() throws RecognitionException {
		Anbx_TypesContext _localctx = new Anbx_TypesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anbx_Types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			match(ANBX_DELIMITER);
			setState(50);
			anbx_Type();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(51);
				match(T__2);
				setState(52);
				anbx_Type();
				}
				}
				setState(57);
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

	public static class Anbx_TypeContext extends ParserRuleContext {
		public List<TerminalNode> ANBX_Identifier() { return getTokens(ANBXParser.ANBX_Identifier); }
		public TerminalNode ANBX_Identifier(int i) {
			return getToken(ANBXParser.ANBX_Identifier, i);
		}
		public List<TerminalNode> ANBX_KNOW() { return getTokens(ANBXParser.ANBX_KNOW); }
		public TerminalNode ANBX_KNOW(int i) {
			return getToken(ANBXParser.ANBX_KNOW, i);
		}
		public TerminalNode ANBX_CHANNEL() { return getToken(ANBXParser.ANBX_CHANNEL, 0); }
		public Anbx_TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Type(this);
		}
	}

	public final Anbx_TypeContext anbx_Type() throws RecognitionException {
		Anbx_TypeContext _localctx = new Anbx_TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anbx_Type);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ANBX_Identifier);
				setState(59);
				match(ANBX_KNOW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(ANBX_Identifier);
				setState(61);
				match(ANBX_Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(ANBX_Identifier);
				setState(63);
				match(T__3);
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				match(ANBX_CHANNEL);
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				match(T__4);
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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

	public static class Anbx_DefinitionsContext extends ParserRuleContext {
		public TerminalNode ANBX_DELIMITER() { return getToken(ANBXParser.ANBX_DELIMITER, 0); }
		public List<Anbx_DefinitionContext> anbx_Definition() {
			return getRuleContexts(Anbx_DefinitionContext.class);
		}
		public Anbx_DefinitionContext anbx_Definition(int i) {
			return getRuleContext(Anbx_DefinitionContext.class,i);
		}
		public Anbx_DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Definitions(this);
		}
	}

	public final Anbx_DefinitionsContext anbx_Definitions() throws RecognitionException {
		Anbx_DefinitionsContext _localctx = new Anbx_DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_anbx_Definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__5);
			setState(72);
			match(ANBX_DELIMITER);
			setState(73);
			anbx_Definition();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(74);
				match(T__2);
				setState(75);
				anbx_Definition();
				}
				}
				setState(80);
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

	public static class Anbx_DefinitionContext extends ParserRuleContext {
		public TerminalNode ANBX_Identifier() { return getToken(ANBXParser.ANBX_Identifier, 0); }
		public TerminalNode ANBX_DELIMITER() { return getToken(ANBXParser.ANBX_DELIMITER, 0); }
		public List<Anbx_SubDefinitionContext> anbx_SubDefinition() {
			return getRuleContexts(Anbx_SubDefinitionContext.class);
		}
		public Anbx_SubDefinitionContext anbx_SubDefinition(int i) {
			return getRuleContext(Anbx_SubDefinitionContext.class,i);
		}
		public Anbx_DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Definition(this);
		}
	}

	public final Anbx_DefinitionContext anbx_Definition() throws RecognitionException {
		Anbx_DefinitionContext _localctx = new Anbx_DefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_anbx_Definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ANBX_Identifier);
			setState(82);
			match(ANBX_DELIMITER);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				anbx_SubDefinition(0);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << ANBX_Identifier) | (1L << ANBX_KNOW))) != 0) );
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

	public static class Anbx_SubDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ANBX_Identifier() { return getTokens(ANBXParser.ANBX_Identifier); }
		public TerminalNode ANBX_Identifier(int i) {
			return getToken(ANBXParser.ANBX_Identifier, i);
		}
		public List<TerminalNode> ANBX_KNOW() { return getTokens(ANBXParser.ANBX_KNOW); }
		public TerminalNode ANBX_KNOW(int i) {
			return getToken(ANBXParser.ANBX_KNOW, i);
		}
		public List<Anbx_SubDefinitionContext> anbx_SubDefinition() {
			return getRuleContexts(Anbx_SubDefinitionContext.class);
		}
		public Anbx_SubDefinitionContext anbx_SubDefinition(int i) {
			return getRuleContext(Anbx_SubDefinitionContext.class,i);
		}
		public List<TerminalNode> ANBX_DELIMITER() { return getTokens(ANBXParser.ANBX_DELIMITER); }
		public TerminalNode ANBX_DELIMITER(int i) {
			return getToken(ANBXParser.ANBX_DELIMITER, i);
		}
		public Anbx_SubDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_SubDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_SubDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_SubDefinition(this);
		}
	}

	public final Anbx_SubDefinitionContext anbx_SubDefinition() throws RecognitionException {
		return anbx_SubDefinition(0);
	}

	private Anbx_SubDefinitionContext anbx_SubDefinition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Anbx_SubDefinitionContext _localctx = new Anbx_SubDefinitionContext(_ctx, _parentState);
		Anbx_SubDefinitionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_anbx_SubDefinition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(89);
				match(ANBX_Identifier);
				}
				break;
			case 2:
				{
				setState(90);
				match(ANBX_KNOW);
				}
				break;
			case 3:
				{
				setState(91);
				match(T__3);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(92);
					match(ANBX_Identifier);
					}
					break;
				case 2:
					{
					setState(93);
					match(ANBX_KNOW);
					}
					break;
				case 3:
					{
					setState(94);
					anbx_SubDefinition(0);
					}
					break;
				}
				setState(97);
				match(T__4);
				}
				break;
			case 4:
				{
				setState(98);
				match(T__3);
				setState(99);
				match(ANBX_Identifier);
				setState(100);
				match(ANBX_DELIMITER);
				setState(101);
				match(ANBX_Identifier);
				setState(102);
				match(T__4);
				}
				break;
			case 5:
				{
				setState(103);
				match(T__6);
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(104);
						match(ANBX_Identifier);
						}
						break;
					case 2:
						{
						setState(105);
						match(ANBX_KNOW);
						}
						break;
					case 3:
						{
						setState(106);
						anbx_SubDefinition(0);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << ANBX_Identifier) | (1L << ANBX_DELIMITER) | (1L << ANBX_KNOW))) != 0)) {
						{
						setState(113);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(109);
							match(ANBX_DELIMITER);
							setState(110);
							match(ANBX_Identifier);
							}
							break;
						case 2:
							{
							setState(111);
							match(ANBX_KNOW);
							}
							break;
						case 3:
							{
							setState(112);
							anbx_SubDefinition(0);
							}
							break;
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(120);
				match(T__7);
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				{
				setState(122);
				match(T__6);
				setState(123);
				match(T__8);
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__6:
				case ANBX_Identifier:
				case ANBX_KNOW:
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(124);
						match(ANBX_KNOW);
						}
						break;
					case 2:
						{
						setState(125);
						anbx_SubDefinition(0);
						}
						break;
					}
					}
					break;
				case T__8:
				case ANBX_DELIMITER:
					{
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ANBX_DELIMITER) {
						{
						{
						setState(128);
						match(ANBX_DELIMITER);
						setState(129);
						anbx_SubDefinition(0);
						}
						}
						setState(134);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				match(T__8);
				setState(138);
				match(T__7);
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Anbx_SubDefinitionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_anbx_SubDefinition);
					setState(142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(145); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(143);
							match(ANBX_DELIMITER);
							setState(144);
							anbx_SubDefinition(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(147); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Anbx_KnowlegdeContext extends ParserRuleContext {
		public TerminalNode ANBX_DELIMITER() { return getToken(ANBXParser.ANBX_DELIMITER, 0); }
		public List<Anbx_KnowContext> anbx_Know() {
			return getRuleContexts(Anbx_KnowContext.class);
		}
		public Anbx_KnowContext anbx_Know(int i) {
			return getRuleContext(Anbx_KnowContext.class,i);
		}
		public Anbx_KnowlegdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Knowlegde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Knowlegde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Knowlegde(this);
		}
	}

	public final Anbx_KnowlegdeContext anbx_Knowlegde() throws RecognitionException {
		Anbx_KnowlegdeContext _localctx = new Anbx_KnowlegdeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_anbx_Knowlegde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__9);
			setState(155);
			match(ANBX_DELIMITER);
			setState(156);
			anbx_Know();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__10) | (1L << ANBX_Identifier) | (1L << ANBX_KNOW))) != 0)) {
				{
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(157);
					match(T__2);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				anbx_Know();
				}
				}
				setState(168);
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

	public static class Anbx_KnowContext extends ParserRuleContext {
		public List<TerminalNode> ANBX_Identifier() { return getTokens(ANBXParser.ANBX_Identifier); }
		public TerminalNode ANBX_Identifier(int i) {
			return getToken(ANBXParser.ANBX_Identifier, i);
		}
		public List<TerminalNode> ANBX_DELIMITER() { return getTokens(ANBXParser.ANBX_DELIMITER); }
		public TerminalNode ANBX_DELIMITER(int i) {
			return getToken(ANBXParser.ANBX_DELIMITER, i);
		}
		public List<TerminalNode> ANBX_KNOW() { return getTokens(ANBXParser.ANBX_KNOW); }
		public TerminalNode ANBX_KNOW(int i) {
			return getToken(ANBXParser.ANBX_KNOW, i);
		}
		public List<TerminalNode> ANBX_KNOW_CONDITION() { return getTokens(ANBXParser.ANBX_KNOW_CONDITION); }
		public TerminalNode ANBX_KNOW_CONDITION(int i) {
			return getToken(ANBXParser.ANBX_KNOW_CONDITION, i);
		}
		public Anbx_KnowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Know; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Know(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Know(this);
		}
	}

	public final Anbx_KnowContext anbx_Know() throws RecognitionException {
		Anbx_KnowContext _localctx = new Anbx_KnowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_anbx_Know);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(ANBX_Identifier);
				setState(170);
				match(ANBX_DELIMITER);
				setState(171);
				match(ANBX_KNOW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__10);
				setState(173);
				match(ANBX_KNOW_CONDITION);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANBX_DELIMITER) {
					{
					{
					setState(174);
					match(ANBX_DELIMITER);
					setState(175);
					match(ANBX_KNOW_CONDITION);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(T__11);
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				match(T__12);
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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

	public static class Anbx_ActionsContext extends ParserRuleContext {
		public TerminalNode ANBX_DELIMITER() { return getToken(ANBXParser.ANBX_DELIMITER, 0); }
		public List<Anbx_ActionContext> anbx_Action() {
			return getRuleContexts(Anbx_ActionContext.class);
		}
		public Anbx_ActionContext anbx_Action(int i) {
			return getRuleContext(Anbx_ActionContext.class,i);
		}
		public Anbx_ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Actions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Actions(this);
		}
	}

	public final Anbx_ActionsContext anbx_Actions() throws RecognitionException {
		Anbx_ActionsContext _localctx = new Anbx_ActionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_anbx_Actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__13);
			setState(190);
			match(ANBX_DELIMITER);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				anbx_Action();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANBX_Identifier );
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

	public static class Anbx_ActionContext extends ParserRuleContext {
		public List<TerminalNode> ANBX_Identifier() { return getTokens(ANBXParser.ANBX_Identifier); }
		public TerminalNode ANBX_Identifier(int i) {
			return getToken(ANBXParser.ANBX_Identifier, i);
		}
		public TerminalNode ANBX_CHANNEL() { return getToken(ANBXParser.ANBX_CHANNEL, 0); }
		public List<TerminalNode> ANBX_DELIMITER() { return getTokens(ANBXParser.ANBX_DELIMITER); }
		public TerminalNode ANBX_DELIMITER(int i) {
			return getToken(ANBXParser.ANBX_DELIMITER, i);
		}
		public List<Anbx_SubActionContext> anbx_SubAction() {
			return getRuleContexts(Anbx_SubActionContext.class);
		}
		public Anbx_SubActionContext anbx_SubAction(int i) {
			return getRuleContext(Anbx_SubActionContext.class,i);
		}
		public List<TerminalNode> ANBX_KNOW() { return getTokens(ANBXParser.ANBX_KNOW); }
		public TerminalNode ANBX_KNOW(int i) {
			return getToken(ANBXParser.ANBX_KNOW, i);
		}
		public List<TerminalNode> ANBX_OPERATION() { return getTokens(ANBXParser.ANBX_OPERATION); }
		public TerminalNode ANBX_OPERATION(int i) {
			return getToken(ANBXParser.ANBX_OPERATION, i);
		}
		public Anbx_ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Action(this);
		}
	}

	public final Anbx_ActionContext anbx_Action() throws RecognitionException {
		Anbx_ActionContext _localctx = new Anbx_ActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_anbx_Action);
		int _la;
		try {
			int _alt;
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(ANBX_Identifier);
				setState(197);
				match(ANBX_CHANNEL);
				setState(198);
				match(ANBX_Identifier);
				setState(199);
				match(ANBX_DELIMITER);
				setState(201); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(200);
						anbx_SubAction(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(203); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(ANBX_Identifier);
				setState(206);
				match(ANBX_CHANNEL);
				setState(207);
				match(ANBX_Identifier);
				setState(208);
				match(ANBX_DELIMITER);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ANBX_OPERATION) {
					{
					{
					setState(209);
					match(ANBX_OPERATION);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(T__14);
				setState(216);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << ANBX_Identifier) | (1L << ANBX_KNOW))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(217);
				match(T__8);
				setState(218);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << ANBX_Identifier) | (1L << ANBX_KNOW))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				match(T__8);
				setState(220);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << ANBX_Identifier) | (1L << ANBX_KNOW))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				match(T__16);
				setState(222);
				match(ANBX_DELIMITER);
				setState(224); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(223);
						anbx_SubAction(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(226); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Anbx_SubActionContext extends ParserRuleContext {
		public TerminalNode ANBX_Identifier() { return getToken(ANBXParser.ANBX_Identifier, 0); }
		public List<TerminalNode> ANBX_KNOW() { return getTokens(ANBXParser.ANBX_KNOW); }
		public TerminalNode ANBX_KNOW(int i) {
			return getToken(ANBXParser.ANBX_KNOW, i);
		}
		public List<Anbx_SubActionContext> anbx_SubAction() {
			return getRuleContexts(Anbx_SubActionContext.class);
		}
		public Anbx_SubActionContext anbx_SubAction(int i) {
			return getRuleContext(Anbx_SubActionContext.class,i);
		}
		public List<TerminalNode> ANBX_DELIMITER() { return getTokens(ANBXParser.ANBX_DELIMITER); }
		public TerminalNode ANBX_DELIMITER(int i) {
			return getToken(ANBXParser.ANBX_DELIMITER, i);
		}
		public Anbx_SubActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_SubAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_SubAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_SubAction(this);
		}
	}

	public final Anbx_SubActionContext anbx_SubAction() throws RecognitionException {
		return anbx_SubAction(0);
	}

	private Anbx_SubActionContext anbx_SubAction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Anbx_SubActionContext _localctx = new Anbx_SubActionContext(_ctx, _parentState);
		Anbx_SubActionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_anbx_SubAction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(231);
				match(ANBX_Identifier);
				}
				break;
			case 2:
				{
				setState(232);
				match(ANBX_KNOW);
				}
				break;
			case 3:
				{
				setState(233);
				match(T__3);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(234);
					match(ANBX_KNOW);
					}
					break;
				case 2:
					{
					setState(235);
					anbx_SubAction(0);
					}
					break;
				}
				setState(238);
				match(T__4);
				}
				break;
			case 4:
				{
				setState(239);
				match(T__6);
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__6:
				case ANBX_Identifier:
				case ANBX_KNOW:
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(240);
						match(ANBX_KNOW);
						}
						break;
					case 2:
						{
						setState(241);
						anbx_SubAction(0);
						}
						break;
					}
					}
					break;
				case T__7:
				case ANBX_DELIMITER:
					{
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ANBX_DELIMITER) {
						{
						{
						setState(244);
						match(ANBX_DELIMITER);
						setState(245);
						anbx_SubAction(0);
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253);
				match(T__7);
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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
				{
				setState(255);
				match(T__6);
				setState(256);
				match(T__8);
				setState(268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__6:
				case ANBX_Identifier:
				case ANBX_KNOW:
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(257);
						match(ANBX_KNOW);
						}
						break;
					case 2:
						{
						setState(258);
						anbx_SubAction(0);
						}
						break;
					}
					}
					break;
				case T__8:
				case ANBX_DELIMITER:
					{
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ANBX_DELIMITER) {
						{
						{
						setState(261);
						match(ANBX_DELIMITER);
						setState(262);
						anbx_SubAction(0);
						}
						}
						setState(267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(270);
				match(T__8);
				setState(271);
				match(T__7);
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new Anbx_SubActionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_anbx_SubAction);
						setState(275);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(276);
						match(T__14);
						setState(277);
						anbx_SubAction(0);
						setState(278);
						match(T__16);
						}
						break;
					case 2:
						{
						_localctx = new Anbx_SubActionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_anbx_SubAction);
						setState(280);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(283); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(281);
								match(ANBX_DELIMITER);
								setState(282);
								anbx_SubAction(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(285); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class Anbx_GoalsContext extends ParserRuleContext {
		public TerminalNode ANBX_DELIMITER() { return getToken(ANBXParser.ANBX_DELIMITER, 0); }
		public List<Anbx_GoalContext> anbx_Goal() {
			return getRuleContexts(Anbx_GoalContext.class);
		}
		public Anbx_GoalContext anbx_Goal(int i) {
			return getRuleContext(Anbx_GoalContext.class,i);
		}
		public Anbx_GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Goals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Goals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Goals(this);
		}
	}

	public final Anbx_GoalsContext anbx_Goals() throws RecognitionException {
		Anbx_GoalsContext _localctx = new Anbx_GoalsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_anbx_Goals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__17);
			setState(293);
			match(ANBX_DELIMITER);
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				anbx_Goal();
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANBX_Identifier || _la==ANBX_KNOW );
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

	public static class Anbx_GoalContext extends ParserRuleContext {
		public List<TerminalNode> ANBX_KNOW() { return getTokens(ANBXParser.ANBX_KNOW); }
		public TerminalNode ANBX_KNOW(int i) {
			return getToken(ANBXParser.ANBX_KNOW, i);
		}
		public List<TerminalNode> ANBX_Identifier() { return getTokens(ANBXParser.ANBX_Identifier); }
		public TerminalNode ANBX_Identifier(int i) {
			return getToken(ANBXParser.ANBX_Identifier, i);
		}
		public TerminalNode ANBX_CHANNEL() { return getToken(ANBXParser.ANBX_CHANNEL, 0); }
		public TerminalNode ANBX_DELIMITER() { return getToken(ANBXParser.ANBX_DELIMITER, 0); }
		public Anbx_GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anbx_Goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).enterAnbx_Goal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANBXListener ) ((ANBXListener)listener).exitAnbx_Goal(this);
		}
	}

	public final Anbx_GoalContext anbx_Goal() throws RecognitionException {
		Anbx_GoalContext _localctx = new Anbx_GoalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_anbx_Goal);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(300);
				match(T__18);
				setState(301);
				match(T__19);
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(303);
				match(T__20);
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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
				setState(305);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(306);
				match(T__19);
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(308);
				match(T__20);
				setState(309);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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
				setState(310);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				match(T__21);
				setState(312);
				match(T__22);
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
				match(T__21);
				setState(316);
				match(T__23);
				setState(317);
				_la = _input.LA(1);
				if ( !(_la==ANBX_Identifier || _la==ANBX_KNOW) ) {
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
				setState(318);
				match(ANBX_Identifier);
				setState(319);
				match(ANBX_CHANNEL);
				setState(320);
				match(ANBX_Identifier);
				setState(321);
				match(ANBX_DELIMITER);
				setState(322);
				match(ANBX_Identifier);
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
		case 6:
			return anbx_SubDefinition_sempred((Anbx_SubDefinitionContext)_localctx, predIndex);
		case 11:
			return anbx_SubAction_sempred((Anbx_SubActionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean anbx_SubDefinition_sempred(Anbx_SubDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean anbx_SubAction_sempred(Anbx_SubActionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0148\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2"+
		"%\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\4\3\4\3"+
		"\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13\6\3\7\3\7"+
		"\3\7\6\7W\n\7\r\7\16\7X\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\b\3\b\3\b\3\b\7\bt\n\b\f\b\16"+
		"\bw\13\b\5\by\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3\b\3\b\7\b\u0085"+
		"\n\b\f\b\16\b\u0088\13\b\5\b\u008a\n\b\3\b\3\b\3\b\5\b\u008f\n\b\3\b\3"+
		"\b\3\b\6\b\u0094\n\b\r\b\16\b\u0095\7\b\u0098\n\b\f\b\16\b\u009b\13\b"+
		"\3\t\3\t\3\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\3\t\7\t\u00a7\n\t\f"+
		"\t\16\t\u00aa\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b3\n\n\f\n\16\n"+
		"\u00b6\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00be\n\n\3\13\3\13\3\13\6\13"+
		"\u00c3\n\13\r\13\16\13\u00c4\3\f\3\f\3\f\3\f\3\f\6\f\u00cc\n\f\r\f\16"+
		"\f\u00cd\3\f\3\f\3\f\3\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00e3\n\f\r\f\16\f\u00e4\5\f\u00e7\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ef\n\r\3\r\3\r\3\r\3\r\5\r\u00f5\n\r"+
		"\3\r\3\r\7\r\u00f9\n\r\f\r\16\r\u00fc\13\r\5\r\u00fe\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0106\n\r\3\r\3\r\7\r\u010a\n\r\f\r\16\r\u010d\13\r\5\r"+
		"\u010f\n\r\3\r\3\r\3\r\5\r\u0114\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6"+
		"\r\u011e\n\r\r\r\16\r\u011f\7\r\u0122\n\r\f\r\16\r\u0125\13\r\3\16\3\16"+
		"\3\16\6\16\u012a\n\16\r\16\16\16\u012b\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0146\n\17\3\17\2\4\16\30\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\4\4\2\33\33  \5\2\22\22\33\33  \2\u0170\2\36\3\2"+
		"\2\2\4+\3\2\2\2\6\62\3\2\2\2\bG\3\2\2\2\nI\3\2\2\2\fS\3\2\2\2\16\u008e"+
		"\3\2\2\2\20\u009c\3\2\2\2\22\u00bd\3\2\2\2\24\u00bf\3\2\2\2\26\u00e6\3"+
		"\2\2\2\30\u0113\3\2\2\2\32\u0126\3\2\2\2\34\u0145\3\2\2\2\36\37\5\4\3"+
		"\2\37#\5\6\4\2 \"\5\n\6\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3"+
		"\2\2\2%#\3\2\2\2&\'\5\20\t\2\'(\5\24\13\2()\5\32\16\2)*\7\2\2\3*\3\3\2"+
		"\2\2+,\7\3\2\2,.\7\36\2\2-/\7\33\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\5\3\2\2\2\62\63\7\4\2\2\63\64\7\36\2\2\649\5\b\5\2\65"+
		"\66\7\5\2\2\668\5\b\5\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2"+
		":\7\3\2\2\2;9\3\2\2\2<=\7\33\2\2=H\7 \2\2>?\7\33\2\2?H\7\33\2\2@A\7\33"+
		"\2\2AB\7\6\2\2BC\t\2\2\2CD\7#\2\2DE\t\2\2\2EF\7\7\2\2FH\t\2\2\2G<\3\2"+
		"\2\2G>\3\2\2\2G@\3\2\2\2H\t\3\2\2\2IJ\7\b\2\2JK\7\36\2\2KP\5\f\7\2LM\7"+
		"\5\2\2MO\5\f\7\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\13\3\2\2\2R"+
		"P\3\2\2\2ST\7\33\2\2TV\7\36\2\2UW\5\16\b\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y\r\3\2\2\2Z[\b\b\1\2[\u008f\7\33\2\2\\\u008f\7 \2\2]a\7\6"+
		"\2\2^b\7\33\2\2_b\7 \2\2`b\5\16\b\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2bc\3"+
		"\2\2\2c\u008f\7\7\2\2de\7\6\2\2ef\7\33\2\2fg\7\36\2\2gh\7\33\2\2h\u008f"+
		"\7\7\2\2ix\7\t\2\2jn\7\33\2\2kn\7 \2\2ln\5\16\b\2mj\3\2\2\2mk\3\2\2\2"+
		"ml\3\2\2\2ny\3\2\2\2op\7\36\2\2pt\7\33\2\2qt\7 \2\2rt\5\16\b\2so\3\2\2"+
		"\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2"+
		"\2xm\3\2\2\2xu\3\2\2\2yz\3\2\2\2z{\7\n\2\2{\u008f\t\2\2\2|}\7\t\2\2}\u0089"+
		"\7\13\2\2~\u0081\7 \2\2\177\u0081\5\16\b\2\u0080~\3\2\2\2\u0080\177\3"+
		"\2\2\2\u0081\u008a\3\2\2\2\u0082\u0083\7\36\2\2\u0083\u0085\5\16\b\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0080\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\13\2\2\u008c\u008d\7"+
		"\n\2\2\u008d\u008f\t\2\2\2\u008eZ\3\2\2\2\u008e\\\3\2\2\2\u008e]\3\2\2"+
		"\2\u008ed\3\2\2\2\u008ei\3\2\2\2\u008e|\3\2\2\2\u008f\u0099\3\2\2\2\u0090"+
		"\u0093\f\3\2\2\u0091\u0092\7\36\2\2\u0092\u0094\5\16\b\2\u0093\u0091\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0090\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\17\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d"+
		"\7\f\2\2\u009d\u009e\7\36\2\2\u009e\u00a8\5\22\n\2\u009f\u00a1\7\5\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\22\n\2"+
		"\u00a6\u00a2\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\33\2\2\u00ac"+
		"\u00ad\7\36\2\2\u00ad\u00be\7 \2\2\u00ae\u00af\7\r\2\2\u00af\u00b4\7\""+
		"\2\2\u00b0\u00b1\7\36\2\2\u00b1\u00b3\7\"\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00be\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\t\2\2\2\u00b8\u00b9\7\16\2\2\u00b9"+
		"\u00be\t\2\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00be\t"+
		"\2\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00be\23\3\2\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c2\7\36"+
		"\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c7\7\33\2"+
		"\2\u00c7\u00c8\7#\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00cb\7\36\2\2\u00ca"+
		"\u00cc\5\30\r\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00e7\3\2\2\2\u00cf\u00d0\7\33\2\2\u00d0"+
		"\u00d1\7#\2\2\u00d1\u00d2\7\33\2\2\u00d2\u00d6\7\36\2\2\u00d3\u00d5\7"+
		"$\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\21"+
		"\2\2\u00da\u00db\t\3\2\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\t\3\2\2\u00dd"+
		"\u00de\7\13\2\2\u00de\u00df\t\3\2\2\u00df\u00e0\7\23\2\2\u00e0\u00e2\7"+
		"\36\2\2\u00e1\u00e3\5\30\r\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00c6\3\2"+
		"\2\2\u00e6\u00cf\3\2\2\2\u00e7\27\3\2\2\2\u00e8\u00e9\b\r\1\2\u00e9\u0114"+
		"\7\33\2\2\u00ea\u0114\7 \2\2\u00eb\u00ee\7\6\2\2\u00ec\u00ef\7 \2\2\u00ed"+
		"\u00ef\5\30\r\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00f0\u0114\7\7\2\2\u00f1\u00fd\7\t\2\2\u00f2\u00f5\7 \2\2\u00f3"+
		"\u00f5\5\30\r\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00fe\3"+
		"\2\2\2\u00f6\u00f7\7\36\2\2\u00f7\u00f9\5\30\r\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\7\n\2\2\u0100\u0114\t\2\2\2\u0101\u0102\7\t"+
		"\2\2\u0102\u010e\7\13\2\2\u0103\u0106\7 \2\2\u0104\u0106\5\30\r\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u010f\3\2\2\2\u0107\u0108\7\36"+
		"\2\2\u0108\u010a\5\30\r\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0105\3\2\2\2\u010e\u010b\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\7\13\2\2\u0111\u0112\7\n\2\2\u0112\u0114\t\2\2\2\u0113\u00e8\3"+
		"\2\2\2\u0113\u00ea\3\2\2\2\u0113\u00eb\3\2\2\2\u0113\u00f1\3\2\2\2\u0113"+
		"\u0101\3\2\2\2\u0114\u0123\3\2\2\2\u0115\u0116\f\4\2\2\u0116\u0117\7\21"+
		"\2\2\u0117\u0118\5\30\r\2\u0118\u0119\7\23\2\2\u0119\u0122\3\2\2\2\u011a"+
		"\u011d\f\3\2\2\u011b\u011c\7\36\2\2\u011c\u011e\5\30\r\2\u011d\u011b\3"+
		"\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u0115\3\2\2\2\u0121\u011a\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\31\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126\u0127\7\24\2\2\u0127\u0129\7\36\2\2\u0128\u012a\5\34\17"+
		"\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\33\3\2\2\2\u012d\u012e\t\2\2\2\u012e\u012f\7\25\2\2\u012f"+
		"\u0130\7\26\2\2\u0130\u0131\t\2\2\2\u0131\u0132\7\27\2\2\u0132\u0146\t"+
		"\2\2\2\u0133\u0134\t\2\2\2\u0134\u0135\7\26\2\2\u0135\u0136\t\2\2\2\u0136"+
		"\u0137\7\27\2\2\u0137\u0146\t\2\2\2\u0138\u0139\t\2\2\2\u0139\u013a\7"+
		"\30\2\2\u013a\u013b\7\31\2\2\u013b\u0146\t\2\2\2\u013c\u013d\t\2\2\2\u013d"+
		"\u013e\7\30\2\2\u013e\u013f\7\32\2\2\u013f\u0146\t\2\2\2\u0140\u0141\7"+
		"\33\2\2\u0141\u0142\7#\2\2\u0142\u0143\7\33\2\2\u0143\u0144\7\36\2\2\u0144"+
		"\u0146\7\33\2\2\u0145\u012d\3\2\2\2\u0145\u0133\3\2\2\2\u0145\u0138\3"+
		"\2\2\2\u0145\u013c\3\2\2\2\u0145\u0140\3\2\2\2\u0146\35\3\2\2\2)#\609"+
		"GPXamsux\u0080\u0086\u0089\u008e\u0095\u0099\u00a2\u00a8\u00b4\u00bd\u00c4"+
		"\u00cd\u00d6\u00e4\u00e6\u00ee\u00f4\u00fa\u00fd\u0105\u010b\u010e\u0113"+
		"\u011f\u0121\u0123\u012b\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}