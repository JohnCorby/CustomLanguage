// Generated from /home/johncorby/Desktop/code stuff/CustomLanguage/Grammar.g4 by ANTLR 4.7.2
package com.johncorby.customlanguage.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link GrammarParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(GrammarParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(GrammarParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#externFuncDeclare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExternFuncDeclare(GrammarParser.ExternFuncDeclareContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#funcDeclare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncDeclare(GrammarParser.FuncDeclareContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#funcArg}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncArg(GrammarParser.FuncArgContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(GrammarParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#funcCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncCall(GrammarParser.FuncCallContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#funcCallArgs}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncCallArgs(GrammarParser.FuncCallArgsContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#varDeclare}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarDeclare(GrammarParser.VarDeclareContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#varAssign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarAssign(GrammarParser.VarAssignContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#asm}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAsm(GrammarParser.AsmContext ctx);

    /**
     * Visit a parse tree produced by the {@code funcExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncExpr(GrammarParser.FuncExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code intExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIntExpr(GrammarParser.IntExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code addSubExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddSubExpr(GrammarParser.AddSubExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code mulDivExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMulDivExpr(GrammarParser.MulDivExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code parenExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParenExpr(GrammarParser.ParenExprContext ctx);

    /**
     * Visit a parse tree produced by the {@code idExpr}
     * labeled alternative in {@link GrammarParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdExpr(GrammarParser.IdExprContext ctx);
}
