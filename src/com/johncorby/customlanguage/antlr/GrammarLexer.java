// Generated from /home/johncorby/Desktop/code stuff/CustomLanguage/Grammar.g4 by ANTLR 4.7.2
package com.johncorby.customlanguage.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, INT_LITERAL = 14, FLOAT_LITERAL = 15,
            CHAR_LITERAL = 16, STR_LITERAL = 17, IDENT = 18, WHITESPACE = 19, COMMENT = 20,
            BLOCK_COMMENT = 21;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b4\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t" +
                    "\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\5\17Q\n\17\3" +
                    "\17\6\17T\n\17\r\17\16\17U\3\20\5\20Y\n\20\3\20\6\20\\\n\20\r\20\16\20" +
                    "]\3\20\3\20\6\20b\n\20\r\20\16\20c\3\20\6\20g\n\20\r\20\16\20h\3\20\3" +
                    "\20\6\20m\n\20\r\20\16\20n\5\20q\n\20\3\21\3\21\3\21\3\21\3\22\3\22\7" +
                    "\22y\n\22\f\22\16\22|\13\22\3\22\3\22\3\23\3\23\5\23\u0082\n\23\3\23\3" +
                    "\23\3\23\7\23\u0087\n\23\f\23\16\23\u008a\13\23\3\24\3\24\6\24\u008e\n" +
                    "\24\r\24\16\24\u008f\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0098\n\25\f\25" +
                    "\16\25\u009b\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00a5" +
                    "\n\26\f\26\16\26\u00a8\13\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3" +
                    "\30\3\31\3\31\5z\u0099\u00a6\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23" +
                    "\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61" +
                    "\2\3\2\6\4\2\13\13\"\"\3\2\62;\4\2C\\c|\4\2\f\f\17\17\2\u00c2\2\3\3\2" +
                    "\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17" +
                    "\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2" +
                    "\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3" +
                    "\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67" +
                    "\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23" +
                    "E\3\2\2\2\25G\3\2\2\2\27I\3\2\2\2\31K\3\2\2\2\33M\3\2\2\2\35P\3\2\2\2" +
                    "\37X\3\2\2\2!r\3\2\2\2#v\3\2\2\2%\u0081\3\2\2\2\'\u008d\3\2\2\2)\u0093" +
                    "\3\2\2\2+\u00a0\3\2\2\2-\u00ae\3\2\2\2/\u00b0\3\2\2\2\61\u00b2\3\2\2\2" +
                    "\63\64\7=\2\2\64\4\3\2\2\2\65\66\7*\2\2\66\6\3\2\2\2\678\7.\2\28\b\3\2" +
                    "\2\29:\7+\2\2:\n\3\2\2\2;<\7}\2\2<\f\3\2\2\2=>\7\177\2\2>\16\3\2\2\2?" +
                    "@\7?\2\2@\20\3\2\2\2AB\7c\2\2BC\7u\2\2CD\7o\2\2D\22\3\2\2\2EF\7,\2\2F" +
                    "\24\3\2\2\2GH\7\61\2\2H\26\3\2\2\2IJ\7\'\2\2J\30\3\2\2\2KL\7-\2\2L\32" +
                    "\3\2\2\2MN\7/\2\2N\34\3\2\2\2OQ\7/\2\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2R" +
                    "T\5-\27\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\36\3\2\2\2WY\7/\2\2" +
                    "XW\3\2\2\2XY\3\2\2\2Yp\3\2\2\2Z\\\5-\27\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2" +
                    "\2]^\3\2\2\2^q\3\2\2\2_a\7\60\2\2`b\5-\27\2a`\3\2\2\2bc\3\2\2\2ca\3\2" +
                    "\2\2cd\3\2\2\2dq\3\2\2\2eg\5-\27\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2" +
                    "\2\2ij\3\2\2\2jl\7\60\2\2km\5-\27\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3" +
                    "\2\2\2oq\3\2\2\2p[\3\2\2\2p_\3\2\2\2pf\3\2\2\2q \3\2\2\2rs\7)\2\2st\13" +
                    "\2\2\2tu\7)\2\2u\"\3\2\2\2vz\7$\2\2wy\13\2\2\2xw\3\2\2\2y|\3\2\2\2z{\3" +
                    "\2\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7$\2\2~$\3\2\2\2\177\u0082\5/\30" +
                    "\2\u0080\u0082\7a\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0088" +
                    "\3\2\2\2\u0083\u0087\5-\27\2\u0084\u0087\5/\30\2\u0085\u0087\7a\2\2\u0086" +
                    "\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2" +
                    "\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089&\3\2\2\2\u008a\u0088" +
                    "\3\2\2\2\u008b\u008e\t\2\2\2\u008c\u008e\5\61\31\2\u008d\u008b\3\2\2\2" +
                    "\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090" +
                    "\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\24\2\2\u0092(\3\2\2\2\u0093" +
                    "\u0094\7\61\2\2\u0094\u0095\7\61\2\2\u0095\u0099\3\2\2\2\u0096\u0098\13" +
                    "\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u009a\3\2\2\2\u0099" +
                    "\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\61" +
                    "\31\2\u009d\u009e\3\2\2\2\u009e\u009f\b\25\2\2\u009f*\3\2\2\2\u00a0\u00a1" +
                    "\7\61\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2\2" +
                    "\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4" +
                    "\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7,\2\2\u00aa" +
                    "\u00ab\7\61\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\26\2\2\u00ad,\3\2\2" +
                    "\2\u00ae\u00af\t\3\2\2\u00af.\3\2\2\2\u00b0\u00b1\t\4\2\2\u00b1\60\3\2" +
                    "\2\2\u00b2\u00b3\t\5\2\2\u00b3\62\3\2\2\2\23\2PUX]chnpz\u0081\u0086\u0088" +
                    "\u008d\u008f\u0099\u00a6\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public GrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "T__11", "T__12", "INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL",
                "STR_LITERAL", "IDENT", "WHITESPACE", "COMMENT", "BLOCK_COMMENT", "DIGIT",
                "LETTER", "NEWLINE"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "';'", "'('", "','", "')'", "'{'", "'}'", "'='", "'asm'", "'*'",
                "'/'", "'%'", "'+'", "'-'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, "INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", "STR_LITERAL",
                "IDENT", "WHITESPACE", "COMMENT", "BLOCK_COMMENT"
        };
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
    public String getGrammarFileName() {
        return "Grammar.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}
