// Generated from SQL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, SPACES=14, SINGLE_LINE_COMMENT=15, 
		MULTILINE_COMMENT=16, ID=17, NUM=18, CHAR=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "LETTER", "DIGIT", "A", "B", "C", "D", 
		"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
		"S", "T", "U", "V", "W", "X", "Y", "Z", "SPACES", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "ID", "NUM", "CHAR"
	};


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00fd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u00b9\n+"+
		"\r+\16+\u00ba\3+\3+\3,\3,\3,\3,\7,\u00c3\n,\f,\16,\u00c6\13,\3,\3,\3-"+
		"\3-\3-\3-\7-\u00ce\n-\f-\16-\u00d1\13-\3-\3-\3-\5-\u00d6\n-\3-\3-\3.\3"+
		".\3.\7.\u00dd\n.\f.\16.\u00e0\13.\3/\3/\7/\u00e4\n/\f/\16/\u00e7\13/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u00f5"+
		"\n\60\7\60\u00f7\n\60\f\60\16\60\u00fa\13\60\3\60\3\60\3\u00cf\2\61\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G"+
		"\2I\2K\2M\2O\2Q\2S\2U\20W\21Y\22[\23]\24_\25\3\2!\4\2C\\c|\4\2CCcc\4\2"+
		"DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\16"+
		"\17\"\"\4\2\f\f\17\17\6\2#\61<B]b}\177\4\2\f\f$$\u00ef\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2"+
		"\2\17m\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27w\3\2\2\2\31y\3\2"+
		"\2\2\33|\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085"+
		"\3\2\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2"+
		"-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0095\3\2\2\2\65\u0097"+
		"\3\2\2\2\67\u0099\3\2\2\29\u009b\3\2\2\2;\u009d\3\2\2\2=\u009f\3\2\2\2"+
		"?\u00a1\3\2\2\2A\u00a3\3\2\2\2C\u00a5\3\2\2\2E\u00a7\3\2\2\2G\u00a9\3"+
		"\2\2\2I\u00ab\3\2\2\2K\u00ad\3\2\2\2M\u00af\3\2\2\2O\u00b1\3\2\2\2Q\u00b3"+
		"\3\2\2\2S\u00b5\3\2\2\2U\u00b8\3\2\2\2W\u00be\3\2\2\2Y\u00c9\3\2\2\2["+
		"\u00d9\3\2\2\2]\u00e1\3\2\2\2_\u00e8\3\2\2\2ab\7\60\2\2b\4\3\2\2\2cd\7"+
		"+\2\2d\6\3\2\2\2ef\7.\2\2f\b\3\2\2\2gh\7/\2\2h\n\3\2\2\2ij\7,\2\2j\f\3"+
		"\2\2\2kl\7*\2\2l\16\3\2\2\2mn\7>\2\2no\7@\2\2o\20\3\2\2\2pq\7>\2\2q\22"+
		"\3\2\2\2rs\7?\2\2s\24\3\2\2\2tu\7>\2\2uv\7?\2\2v\26\3\2\2\2wx\7@\2\2x"+
		"\30\3\2\2\2yz\7+\2\2z{\7\"\2\2{\32\3\2\2\2|}\7@\2\2}~\7?\2\2~\34\3\2\2"+
		"\2\177\u0080\t\2\2\2\u0080\36\3\2\2\2\u0081\u0082\4\62;\2\u0082 \3\2\2"+
		"\2\u0083\u0084\t\3\2\2\u0084\"\3\2\2\2\u0085\u0086\t\4\2\2\u0086$\3\2"+
		"\2\2\u0087\u0088\t\5\2\2\u0088&\3\2\2\2\u0089\u008a\t\6\2\2\u008a(\3\2"+
		"\2\2\u008b\u008c\t\7\2\2\u008c*\3\2\2\2\u008d\u008e\t\b\2\2\u008e,\3\2"+
		"\2\2\u008f\u0090\t\t\2\2\u0090.\3\2\2\2\u0091\u0092\t\n\2\2\u0092\60\3"+
		"\2\2\2\u0093\u0094\t\13\2\2\u0094\62\3\2\2\2\u0095\u0096\t\f\2\2\u0096"+
		"\64\3\2\2\2\u0097\u0098\t\r\2\2\u0098\66\3\2\2\2\u0099\u009a\t\16\2\2"+
		"\u009a8\3\2\2\2\u009b\u009c\t\17\2\2\u009c:\3\2\2\2\u009d\u009e\t\20\2"+
		"\2\u009e<\3\2\2\2\u009f\u00a0\t\21\2\2\u00a0>\3\2\2\2\u00a1\u00a2\t\22"+
		"\2\2\u00a2@\3\2\2\2\u00a3\u00a4\t\23\2\2\u00a4B\3\2\2\2\u00a5\u00a6\t"+
		"\24\2\2\u00a6D\3\2\2\2\u00a7\u00a8\t\25\2\2\u00a8F\3\2\2\2\u00a9\u00aa"+
		"\t\26\2\2\u00aaH\3\2\2\2\u00ab\u00ac\t\27\2\2\u00acJ\3\2\2\2\u00ad\u00ae"+
		"\t\30\2\2\u00aeL\3\2\2\2\u00af\u00b0\t\31\2\2\u00b0N\3\2\2\2\u00b1\u00b2"+
		"\t\32\2\2\u00b2P\3\2\2\2\u00b3\u00b4\t\33\2\2\u00b4R\3\2\2\2\u00b5\u00b6"+
		"\t\34\2\2\u00b6T\3\2\2\2\u00b7\u00b9\t\35\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\b+\2\2\u00bdV\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0"+
		"\7\61\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\n\36\2\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b,\2\2\u00c8X\3\2\2\2\u00c9\u00ca"+
		"\7\61\2\2\u00ca\u00cb\7,\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\13\2\2\2"+
		"\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3"+
		"\u00d6\7\61\2\2\u00d4\u00d6\7\2\2\3\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b-\2\2\u00d8Z\3\2\2\2\u00d9\u00de"+
		"\5\35\17\2\u00da\u00dd\5\35\17\2\u00db\u00dd\5\37\20\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\\\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e5\5\37\20"+
		"\2\u00e2\u00e4\5\37\20\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6^\3\2\2\2\u00e7\u00e5\3\2\2\2"+
		"\u00e8\u00f8\7)\2\2\u00e9\u00f5\t\2\2\2\u00ea\u00f5\5\37\20\2\u00eb\u00f5"+
		"\3\2\2\2\u00ec\u00f5\t\37\2\2\u00ed\u00ee\7\u0080\2\2\u00ee\u00f5\7\13"+
		"\2\2\u00ef\u00f5\t \2\2\u00f0\u00f1\7^\2\2\u00f1\u00f5\7p\2\2\u00f2\u00f3"+
		"\7^\2\2\u00f3\u00f5\7v\2\2\u00f4\u00e9\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4"+
		"\u00eb\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00ef\3\2"+
		"\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7)\2\2\u00fc"+
		"`\3\2\2\2\f\2\u00ba\u00c4\u00cf\u00d5\u00dc\u00de\u00e5\u00f4\u00f8\3"+
		"\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}