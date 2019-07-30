package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;
import com.johncorby.customlanguage.Type;

/**
 * local var stored in current func's stack frame
 */
public class FrameVar extends LocalVar {
    public FrameVar(Func parent, Type type, String name) {
        super(parent, type, name);

        // allocate space on declare
        // instead of all at once during func prologue cuz that's harder lol
        Asm.write(String.format("sub esp, %s ; declare var %s", type.size, name));

    }

    @Override
    public int initPos() {
        return parent.vars.stream()
                .filter(v -> v instanceof FrameVar)
                .mapToInt(v -> v.type.size)
                .sum();
    }
}
