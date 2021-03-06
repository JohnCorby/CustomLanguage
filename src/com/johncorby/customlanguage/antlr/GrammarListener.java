// Generated from /home/johncorby/Desktop/code stuff/CustomLanguage/Grammar.g4 by ANTLR 4.7.2
package com.johncorby.customlanguage.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link GrammarParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(GrammarParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(GrammarParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(GrammarParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(GrammarParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#externFuncDeclare}.
     *
     * @param ctx the parse tree
     */
    void enterExternFuncDeclare(GrammarParser.ExternFuncDeclareContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#externFuncDeclare}.
     *
     * @param ctx the parse tree
     */
    void exitExternFuncDeclare(GrammarParser.ExternFuncDeclareContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#funcDeclare}.
     *
     * @param ctx the parse tree
     */
    void enterFuncDeclare(GrammarParser.FuncDeclareContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#funcDeclare}.
     *
     * @param ctx the parse tree
     */
    void exitFuncDeclare(GrammarParser.FuncDeclareContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#funcArg}.
     *
     * @param ctx the parse tree
     */
    void enterFuncArg(GrammarParser.FuncArgContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#funcArg}.
     *
     * @param ctx the parse tree
     */
    void exitFuncArg(GrammarParser.FuncArgContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(GrammarParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(GrammarParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void enterFuncCall(GrammarParser.FuncCallContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#funcCall}.
     *
     * @param ctx the parse tree
     */
    void exitFuncCall(GrammarParser.FuncCallContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#funcCallArgs}.
     *
     * @param ctx the parse tree
     */
    void enterFuncCallArgs(GrammarParser.FuncCallArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#funcCallArgs}.
     *
     * @param ctx the parse tree
     */
    void exitFuncCallArgs(GrammarParser.FuncCallArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#varDeclare}.
     *
     * @param ctx the parse tree
     */
    void enterVarDeclare(GrammarParser.VarDeclareContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#varDeclare}.
     *
     * @param ctx the parse tree
     */
    void exitVarDeclare(GrammarParser.VarDeclareContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#varAssign}.
     *
     * @param ctx the parse tree
     */
    void enterVarAssign(GrammarParser.VarAssignContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#varAssign}.
     *
     * @param ctx the parse tree
     */
    void exitVarAssign(GrammarParser.VarAssignContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#asm}.
     *
     * @param ctx the parse tree
     */
    void enterAsm(GrammarParser.AsmContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#asm}.
     *
     * @param ctx the parse tree
     */
    void exitAsm(GrammarParser.AsmContext ctx);

    /**
     * Enter a parse tree produced by the {@code funcExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterFuncExpr(GrammarParser.FuncExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code funcExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitFuncExpr(GrammarParser.FuncExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code intExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterIntExpr(GrammarParser.IntExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code intExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitIntExpr(GrammarParser.IntExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code addSubExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAddSubExpr(GrammarParser.AddSubExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code addSubExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAddSubExpr(GrammarParser.AddSubExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code mulDivExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMulDivExpr(GrammarParser.MulDivExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code mulDivExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMulDivExpr(GrammarParser.MulDivExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code parenExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterParenExpr(GrammarParser.ParenExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code parenExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitParenExpr(GrammarParser.ParenExprContext ctx);

    /**
     * Enter a parse tree produced by the {@code idExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterIdExpr(GrammarParser.IdExprContext ctx);

    /**
     * Exit a parse tree produced by the {@code idExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitIdExpr(GrammarParser.IdExprContext ctx);
}
