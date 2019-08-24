package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Type;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * global variable (not contained in a function)
 * todo eventually implement
 */
public class GlobalVar extends Var {
    public static boolean headerWritten = false;

    public GlobalVar(Type type, String name) {
        super(type, name);
        // todo actually store globals all in one place and write them later (in same way that you do for pushing preserved regs to func?)
    }

    @Override
    public String getAsm() {
        return null;
    }

    @Override
    public void init(ParseTree expr) {
        // todo implement
    }

    @Override
    public String getOfsBase() {
        return "globals";
    }

    @Override
    public int initOfs() {
        return get(GlobalVar.class).stream()
                .mapToInt(v -> v.type.size)
                .sum();
    }
}
