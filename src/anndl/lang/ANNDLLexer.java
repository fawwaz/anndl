// Generated from ANNDL.g4 by ANTLR 4.4
package ANNDL.anndl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANNDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__31=1, T__30=2, T__29=3, T__28=4, T__27=5, T__26=6, T__25=7, T__24=8, 
		T__23=9, T__22=10, T__21=11, T__20=12, T__19=13, T__18=14, T__17=15, T__16=16, 
		T__15=17, T__14=18, T__13=19, T__12=20, T__11=21, T__10=22, T__9=23, T__8=24, 
		T__7=25, T__6=26, T__5=27, T__4=28, T__3=29, T__2=30, T__1=31, T__0=32, 
		WS=33, INT=34, ID=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'"
	};
	public static final String[] ruleNames = {
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WS", 
		"INT", "ID"
	};


	public ANNDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ANNDL.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u0120\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\6\"\u010b\n\"\r\"\16\""+
		"\u010c\3\"\3\"\3#\6#\u0112\n#\r#\16#\u0113\3$\6$\u0117\n$\r$\16$\u0118"+
		"\3$\7$\u011c\n$\f$\16$\u011f\13$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\4\2\13\13\17\17"+
		"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\u0123\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3"+
		"\2\2\2\tR\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21d\3\2\2\2\23o\3"+
		"\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31\u0081\3\2\2\2\33\u0090\3\2\2\2\35\u0097"+
		"\3\2\2\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a6\3\2\2\2%\u00af\3\2\2\2"+
		"\'\u00b4\3\2\2\2)\u00b6\3\2\2\2+\u00ba\3\2\2\2-\u00c1\3\2\2\2/\u00ca\3"+
		"\2\2\2\61\u00cf\3\2\2\2\63\u00d3\3\2\2\2\65\u00dc\3\2\2\2\67\u00de\3\2"+
		"\2\29\u00e4\3\2\2\2;\u00ea\3\2\2\2=\u00ef\3\2\2\2?\u00f9\3\2\2\2A\u0100"+
		"\3\2\2\2C\u010a\3\2\2\2E\u0111\3\2\2\2G\u0116\3\2\2\2IJ\7.\2\2J\4\3\2"+
		"\2\2KL\7\f\2\2L\6\3\2\2\2MN\7d\2\2NO\7w\2\2OP\7c\2\2PQ\7v\2\2Q\b\3\2\2"+
		"\2RS\7l\2\2ST\7w\2\2TU\7o\2\2UV\7n\2\2VW\7c\2\2WX\7j\2\2X\n\3\2\2\2YZ"+
		"\7/\2\2Z\f\3\2\2\2[\\\7<\2\2\\\16\3\2\2\2]^\7f\2\2^_\7g\2\2_`\7p\2\2`"+
		"a\7i\2\2ab\7c\2\2bc\7p\2\2c\20\3\2\2\2de\7o\2\2ef\7w\2\2fg\7n\2\2gh\7"+
		"v\2\2hi\7k\2\2ij\7n\2\2jk\7c\2\2kl\7{\2\2lm\7g\2\2mn\7t\2\2n\22\3\2\2"+
		"\2op\7p\2\2pq\7c\2\2qr\7o\2\2rs\7c\2\2st\7m\2\2tu\7c\2\2uv\7p\2\2v\24"+
		"\3\2\2\2wx\7}\2\2x\26\3\2\2\2yz\7u\2\2z{\7k\2\2{|\7i\2\2|}\7o\2\2}~\7"+
		"q\2\2~\177\7k\2\2\177\u0080\7f\2\2\u0080\30\3\2\2\2\u0081\u0082\7m\2\2"+
		"\u0082\u0083\7n\2\2\u0083\u0084\7c\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7h\2\2\u0087\u0088\7k\2\2\u0088\u0089\7m\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7u\2\2\u008b\u008c\7k\2\2\u008c\u008d\7m\2\2"+
		"\u008d\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\32\3\2\2\2\u0090\u0091\7"+
		"p\2\2\u0091\u0092\7g\2\2\u0092\u0093\7w\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7p\2\2\u0096\34\3\2\2\2\u0097\u0098\7u\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7i\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7g\2\2\u009d\36\3\2\2\2\u009e\u009f\7\177\2\2\u009f \3\2\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7{\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\u00a5\7t\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7v"+
		"\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7m\2\2\u00ab\u00ac"+
		"\7v\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae$\3\2\2\2\u00af\u00b0"+
		"\7f\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"&\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7k\2\2\u00b9*\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7q\2\2"+
		"\u00bf\u00c0\7t\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2"+
		"\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7"+
		"\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7i\2\2\u00c9.\3\2\2\2\u00ca\u00cb"+
		"\7h\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\60\3\2\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7p\2\2\u00d2"+
		"\62\3\2\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7m\2\2\u00d5\u00d6\7v\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7x\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7u\2\2"+
		"\u00da\u00db\7k\2\2\u00db\64\3\2\2\2\u00dc\u00dd\7?\2\2\u00dd\66\3\2\2"+
		"\2\u00de\u00df\7f\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7o\2\2\u00e38\3\2\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6"+
		"\7q\2\2\u00e6\u00e7\7f\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7n\2\2\u00e9"+
		":\3\2\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7g\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7q\2\2\u00f1"+
		"\u00f2\7o\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7p\2\2"+
		"\u00f5\u00f6\7v\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7o\2\2\u00f8>\3\2\2"+
		"\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7o\2\2\u00fc\u00fd"+
		"\7r\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7p\2\2\u00ff@\3\2\2\2\u0100\u0101"+
		"\7j\2\2\u0101\u0102\7c\2\2\u0102\u0103\7u\2\2\u0103\u0104\7k\2\2\u0104"+
		"\u0105\7n\2\2\u0105\u0106\7p\2\2\u0106\u0107\7{\2\2\u0107\u0108\7c\2\2"+
		"\u0108B\3\2\2\2\u0109\u010b\t\2\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\b\"\2\2\u010fD\3\2\2\2\u0110\u0112\t\3\2\2\u0111\u0110\3\2\2\2"+
		"\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114F\3"+
		"\2\2\2\u0115\u0117\t\4\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011d\3\2\2\2\u011a\u011c\t\5"+
		"\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011eH\3\2\2\2\u011f\u011d\3\2\2\2\7\2\u010c\u0113\u0118"+
		"\u011d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}