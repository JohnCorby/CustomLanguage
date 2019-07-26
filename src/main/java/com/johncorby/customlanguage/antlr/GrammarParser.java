// Generated from /home/johncorby/Desktop/CustomLanguage/Grammar.g4 by ANTLR 4.7.2
package com.johncorby.customlanguage.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, EXPR = 8, INT_LITERAL = 9,
            IDENT = 10, WHITESPACE = 11, COMMENT = 12, BLOCK_COMMENT = 13;
    public static final int
            RULE_program = 0, RULE_statement = 1, RULE_funcDeclare = 2, RULE_funcArg = 3,
            RULE_varDeclare = 4, RULE_varAssign = 5, RULE_block = 6;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17C\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25" +
                    "\13\2\3\2\3\2\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4$\n\4" +
                    "\f\4\16\4\'\13\4\5\4)\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7" +
                    "\3\7\3\7\3\7\3\7\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\b\3\b\3\b\2\2\t\2\4" +
                    "\6\b\n\f\16\2\2\2A\2\23\3\2\2\2\4\33\3\2\2\2\6\35\3\2\2\2\b-\3\2\2\2\n" +
                    "\60\3\2\2\2\f\64\3\2\2\2\169\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25" +
                    "\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27" +
                    "\7\2\2\3\27\3\3\2\2\2\30\34\5\6\4\2\31\34\5\n\6\2\32\34\5\f\7\2\33\30" +
                    "\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\35\36\7\f\2\2\36\37" +
                    "\7\f\2\2\37(\7\3\2\2 %\5\b\5\2!\"\7\4\2\2\"$\5\b\5\2#!\3\2\2\2$\'\3\2" +
                    "\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\'%\3\2\2\2( \3\2\2\2()\3\2\2\2)*\3" +
                    "\2\2\2*+\7\5\2\2+,\5\16\b\2,\7\3\2\2\2-.\7\f\2\2./\7\f\2\2/\t\3\2\2\2" +
                    "\60\61\7\f\2\2\61\62\7\f\2\2\62\63\7\6\2\2\63\13\3\2\2\2\64\65\7\f\2\2" +
                    "\65\66\7\7\2\2\66\67\7\n\2\2\678\7\6\2\28\r\3\2\2\29=\7\b\2\2:<\5\4\3" +
                    "\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\t\2" +
                    "\2A\17\3\2\2\2\7\23\33%(=";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

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

    public GrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "statement", "funcDeclare", "funcArg", "varDeclare", "varAssign",
                "block"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'('", "','", "')'", "';'", "'='", "'{'", "'}'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, "EXPR", "INT_LITERAL",
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
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(17);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == IDENT) {
                    {
                        {
                            setState(14);
                            statement();
                        }
                    }
                    setState(19);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(20);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(25);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(22);
                    funcDeclare();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(23);
                    varDeclare();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(24);
                    varAssign();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FuncDeclareContext funcDeclare() throws RecognitionException {
        FuncDeclareContext _localctx = new FuncDeclareContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_funcDeclare);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(27);
                ((FuncDeclareContext) _localctx).retType = match(IDENT);
                setState(28);
                ((FuncDeclareContext) _localctx).name = match(IDENT);
                setState(29);
                match(T__0);
                setState(38);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == IDENT) {
                    {
                        setState(30);
                        funcArg();
                        setState(35);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == T__1) {
                            {
                                {
                                    setState(31);
                                    match(T__1);
                                    setState(32);
                                    funcArg();
                                }
                            }
                            setState(37);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(40);
                match(T__2);
                setState(41);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FuncArgContext funcArg() throws RecognitionException {
        FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_funcArg);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(43);
                ((FuncArgContext) _localctx).argType = match(IDENT);
                setState(44);
                ((FuncArgContext) _localctx).name = match(IDENT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarDeclareContext varDeclare() throws RecognitionException {
        VarDeclareContext _localctx = new VarDeclareContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_varDeclare);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(46);
                ((VarDeclareContext) _localctx).varType = match(IDENT);
                setState(47);
                ((VarDeclareContext) _localctx).name = match(IDENT);
                setState(48);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarAssignContext varAssign() throws RecognitionException {
        VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_varAssign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(50);
                ((VarAssignContext) _localctx).name = match(IDENT);
                setState(51);
                match(T__4);
                setState(52);
                ((VarAssignContext) _localctx).val = match(EXPR);
                setState(53);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(55);
                match(T__5);
                setState(59);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == IDENT) {
                    {
                        {
                            setState(56);
                            statement();
                        }
                    }
                    setState(61);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(62);
                match(T__6);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(GrammarParser.EOF, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitProgram(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FuncDeclareContext funcDeclare() {
            return getRuleContext(FuncDeclareContext.class, 0);
        }

        public VarDeclareContext varDeclare() {
            return getRuleContext(VarDeclareContext.class, 0);
        }

        public VarAssignContext varAssign() {
            return getRuleContext(VarAssignContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitStatement(this);
        }
    }

    public static class FuncDeclareContext extends ParserRuleContext {
        public Token retType;
        public Token name;

        public FuncDeclareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(GrammarParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(GrammarParser.IDENT, i);
        }

        public List<FuncArgContext> funcArg() {
            return getRuleContexts(FuncArgContext.class);
        }

        public FuncArgContext funcArg(int i) {
            return getRuleContext(FuncArgContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcDeclare;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterFuncDeclare(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitFuncDeclare(this);
        }
    }

    public static class FuncArgContext extends ParserRuleContext {
        public Token argType;
        public Token name;

        public FuncArgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(GrammarParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(GrammarParser.IDENT, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcArg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterFuncArg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitFuncArg(this);
        }
    }

    public static class VarDeclareContext extends ParserRuleContext {
        public Token varType;
        public Token name;

        public VarDeclareContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> IDENT() {
            return getTokens(GrammarParser.IDENT);
        }

        public TerminalNode IDENT(int i) {
            return getToken(GrammarParser.IDENT, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varDeclare;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterVarDeclare(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitVarDeclare(this);
        }
    }

    public static class VarAssignContext extends ParserRuleContext {
        public Token name;
        public Token val;

        public VarAssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IDENT() {
            return getToken(GrammarParser.IDENT, 0);
        }

        public TerminalNode EXPR() {
            return getToken(GrammarParser.EXPR, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_varAssign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterVarAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitVarAssign(this);
        }
    }

    public static class BlockContext extends ParserRuleContext {
        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitBlock(this);
        }
    }
}
