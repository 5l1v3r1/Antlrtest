// Generated from ANB.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ANB_Identifier=11, ANB_COMMENT=12, WS=13, ANB_KNOW=14, ANB_KNOW_FUNCTION=15, 
		ANB_CHANNEL=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "ANB_Identifier", "ANB_COMMENT", "WS", "ANB_KNOW", "ANB_KNOW_FUNCTION", 
		"ANB_CHANNEL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Protocol'", "':'", "'Types'", "';'", "'Knowledge'", "'Actions'", 
		"'{'", "'}'", "'|'", "'Goals'", null, null, null, null, null, "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ANB_Identifier", 
		"ANB_COMMENT", "WS", "ANB_KNOW", "ANB_KNOW_FUNCTION", "ANB_CHANNEL"
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


	public ANBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\fW"+
		"\n\f\f\f\16\fZ\13\f\3\r\3\r\7\r^\n\r\f\r\16\ra\13\r\3\r\3\r\3\16\3\16"+
		"\5\16g\n\16\3\16\6\16j\n\16\r\16\16\16k\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17t\n\17\7\17v\n\17\f\17\16\17y\13\17\3\17\5\17|\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0083\n\20\3\20\3\20\3\21\3\21\3\21\2\2\22\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3"+
		"\2\6\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\4\2\13\13\"\"\2\u0092\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2"+
		"\5,\3\2\2\2\7.\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2\r@\3\2\2\2\17H\3\2\2"+
		"\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27T\3\2\2\2\31[\3\2\2\2\33i\3\2"+
		"\2\2\35{\3\2\2\2\37}\3\2\2\2!\u0086\3\2\2\2#$\7R\2\2$%\7t\2\2%&\7q\2\2"+
		"&\'\7v\2\2\'(\7q\2\2()\7e\2\2)*\7q\2\2*+\7n\2\2+\4\3\2\2\2,-\7<\2\2-\6"+
		"\3\2\2\2./\7V\2\2/\60\7{\2\2\60\61\7r\2\2\61\62\7g\2\2\62\63\7u\2\2\63"+
		"\b\3\2\2\2\64\65\7=\2\2\65\n\3\2\2\2\66\67\7M\2\2\678\7p\2\289\7q\2\2"+
		"9:\7y\2\2:;\7n\2\2;<\7g\2\2<=\7f\2\2=>\7i\2\2>?\7g\2\2?\f\3\2\2\2@A\7"+
		"C\2\2AB\7e\2\2BC\7v\2\2CD\7k\2\2DE\7q\2\2EF\7p\2\2FG\7u\2\2G\16\3\2\2"+
		"\2HI\7}\2\2I\20\3\2\2\2JK\7\177\2\2K\22\3\2\2\2LM\7~\2\2M\24\3\2\2\2N"+
		"O\7I\2\2OP\7q\2\2PQ\7c\2\2QR\7n\2\2RS\7u\2\2S\26\3\2\2\2TX\t\2\2\2UW\t"+
		"\3\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\30\3\2\2\2ZX\3\2\2\2["+
		"_\7%\2\2\\^\n\4\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2"+
		"a_\3\2\2\2bc\b\r\2\2c\32\3\2\2\2dj\t\5\2\2eg\7\17\2\2fe\3\2\2\2fg\3\2"+
		"\2\2gh\3\2\2\2hj\7\f\2\2id\3\2\2\2if\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2lm\3\2\2\2mn\b\16\2\2n\34\3\2\2\2ow\5\27\f\2ps\7.\2\2qt\5\27\f\2r"+
		"t\5\37\20\2sq\3\2\2\2sr\3\2\2\2tv\3\2\2\2up\3\2\2\2vy\3\2\2\2wu\3\2\2"+
		"\2wx\3\2\2\2x|\3\2\2\2yw\3\2\2\2z|\5\37\20\2{o\3\2\2\2{z\3\2\2\2|\36\3"+
		"\2\2\2}~\5\27\f\2~\u0082\7*\2\2\177\u0083\5\27\f\2\u0080\u0083\5\37\20"+
		"\2\u0081\u0083\5\35\17\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7+\2\2\u0085 \3\2\2\2\u0086\u0087"+
		"\7/\2\2\u0087\u0088\7@\2\2\u0088\"\3\2\2\2\f\2X_fiksw{\u0082\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}