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
            T__9 = 10, T__10 = 11, T__11 = 12, INT_LITERAL = 13, STR_LITERAL = 14, IDENT = 15,
            WHITESPACE = 16, COMMENT = 17, BLOCK_COMMENT = 18;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008d\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4" +
                    "\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f" +
                    "\3\f\3\r\3\r\3\16\5\16I\n\16\3\16\6\16L\n\16\r\16\16\16M\3\17\3\17\7\17" +
                    "R\n\17\f\17\16\17U\13\17\3\17\3\17\3\20\3\20\5\20[\n\20\3\20\3\20\3\20" +
                    "\7\20`\n\20\f\20\16\20c\13\20\3\21\3\21\6\21g\n\21\r\21\16\21h\3\21\3" +
                    "\21\3\22\3\22\3\22\3\22\7\22q\n\22\f\22\16\22t\13\22\3\22\3\22\3\22\3" +
                    "\22\3\23\3\23\3\23\3\23\7\23~\n\23\f\23\16\23\u0081\13\23\3\23\3\23\3" +
                    "\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\5Sr\177\2\27\3\3\5\4\7\5\t" +
                    "\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23" +
                    "%\24\'\2)\2+\2\3\2\6\4\2\13\13\"\"\3\2\62;\4\2C\\c|\4\2\f\f\17\17\2\u0094" +
                    "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2" +
                    "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2" +
                    "\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2" +
                    "\2\2\2%\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65" +
                    "\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2" +
                    "\27C\3\2\2\2\31E\3\2\2\2\33H\3\2\2\2\35O\3\2\2\2\37Z\3\2\2\2!f\3\2\2\2" +
                    "#l\3\2\2\2%y\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b\3\2\2\2-.\7" +
                    "=\2\2.\4\3\2\2\2/\60\7*\2\2\60\6\3\2\2\2\61\62\7.\2\2\62\b\3\2\2\2\63" +
                    "\64\7+\2\2\64\n\3\2\2\2\65\66\7}\2\2\66\f\3\2\2\2\678\7\177\2\28\16\3" +
                    "\2\2\29:\7?\2\2:\20\3\2\2\2;<\7c\2\2<=\7u\2\2=>\7o\2\2>\22\3\2\2\2?@\7" +
                    ",\2\2@\24\3\2\2\2AB\7\61\2\2B\26\3\2\2\2CD\7-\2\2D\30\3\2\2\2EF\7/\2\2" +
                    "F\32\3\2\2\2GI\7/\2\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\'\24\2KJ\3\2\2" +
                    "\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\34\3\2\2\2OS\7$\2\2PR\13\2\2\2QP\3\2" +
                    "\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7$\2\2W\36\3" +
                    "\2\2\2X[\5)\25\2Y[\7a\2\2ZX\3\2\2\2ZY\3\2\2\2[a\3\2\2\2\\`\5\'\24\2]`" +
                    "\5)\25\2^`\7a\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2a" +
                    "b\3\2\2\2b \3\2\2\2ca\3\2\2\2dg\t\2\2\2eg\5+\26\2fd\3\2\2\2fe\3\2\2\2" +
                    "gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\21\2\2k\"\3\2\2\2lm\7\61" +
                    "\2\2mn\7\61\2\2nr\3\2\2\2oq\13\2\2\2po\3\2\2\2qt\3\2\2\2rs\3\2\2\2rp\3" +
                    "\2\2\2su\3\2\2\2tr\3\2\2\2uv\5+\26\2vw\3\2\2\2wx\b\22\2\2x$\3\2\2\2yz" +
                    "\7\61\2\2z{\7,\2\2{\177\3\2\2\2|~\13\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177" +
                    "\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082" +
                    "\u0083\7,\2\2\u0083\u0084\7\61\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\23" +
                    "\2\2\u0086&\3\2\2\2\u0087\u0088\t\3\2\2\u0088(\3\2\2\2\u0089\u008a\t\4" +
                    "\2\2\u008a*\3\2\2\2\u008b\u008c\t\5\2\2\u008c,\3\2\2\2\r\2HMSZ_afhr\177" +
                    "\3\b\2\2";
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
                "T__9", "T__10", "T__11", "INT_LITERAL", "STR_LITERAL", "IDENT", "WHITESPACE",
                "COMMENT", "BLOCK_COMMENT", "DIGIT", "LETTER", "NEWLINE"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "';'", "'('", "','", "')'", "'{'", "'}'", "'='", "'asm'", "'*'",
                "'/'", "'+'", "'-'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, "INT_LITERAL", "STR_LITERAL", "IDENT", "WHITESPACE", "COMMENT",
                "BLOCK_COMMENT"
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
