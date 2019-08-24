package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;
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
        // write header containing address to offset from with global vars (in same way that ebp is offset from with locals)
        // todo actually store globals all in one place and write them later (in same way that you do for pushing preserved regs to func?)
        if (!headerWritten) Asm.write("globals:");
    }

    @Override
    public String getAsm() {
        return null;
    }

    @Override
    public void init(ParseTree expr) {
        // todo implement
    }
}
