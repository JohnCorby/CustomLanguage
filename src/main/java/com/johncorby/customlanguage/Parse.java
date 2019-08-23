package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarLexer;
import com.johncorby.customlanguage.antlr.GrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

import static com.johncorby.customlanguage.Listener.LISTENER;
import static com.johncorby.customlanguage.Main.IN_PATH;

/**
 * parses source code with antlr
 */
public class Parse {
    public static void go() {
        try {
            var chars = CharStreams.fromFileName(IN_PATH);
            var lexer = new GrammarLexer(chars);
            var tokens = new CommonTokenStream(lexer);
            var parser = new GrammarParser(tokens);

            var tree = parser.program();
            var walker = ParseTreeWalker.DEFAULT;
            walker.walk(LISTENER, tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
