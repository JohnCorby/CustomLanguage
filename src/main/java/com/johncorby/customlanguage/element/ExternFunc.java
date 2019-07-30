package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;

/**
 * an external function (resolved by assembler)
 */
public class ExternFunc extends Func {
    public ExternFunc(String name) {
        super(name);

        Asm.write("extern " + name);
    }
}
