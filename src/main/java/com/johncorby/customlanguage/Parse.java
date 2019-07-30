package com.johncorby.customlanguage;

import com.johncorby.customlanguage.antlr.GrammarLexer;
import com.johncorby.customlanguage.antlr.GrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

import static com.johncorby.customlanguage.Main.IN_PATH;

/**
 * parses source code with antlr
 */
public class Parse {
    public static void go() {
        try {
            var lexer = new GrammarLexer(CharStreams.fromFileName(IN_PATH));
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new GrammarParser(tokenStream);

            var listener = new Listener();
            var tree = parser.program();
            var walker = new ParseTreeWalker();

            walker.walk(listener, tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
