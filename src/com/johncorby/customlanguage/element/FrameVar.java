package com.johncorby.customlanguage.element;

import com.johncorby.customlanguage.Asm;
import com.johncorby.customlanguage.Type;

import static com.johncorby.customlanguage.Util.format;

/**
 * local var stored in current func's stack frame
 */
public class FrameVar extends LocalVar {
    public FrameVar(Type type, String name) {
        super(type, name);

        // allocate space on declare
        // instead of all at once during func prologue cuz that's harder lol
        Asm.write(format("sub esp, %s", type.size));
    }

    @Override
    public int initPos() {
        return -parent.vars.stream()
                .filter(v -> v instanceof FrameVar)
                .mapToInt(v -> v.type.size)
                .sum();
    }
}
