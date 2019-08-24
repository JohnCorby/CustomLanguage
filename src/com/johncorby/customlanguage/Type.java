package com.johncorby.customlanguage;

import static com.johncorby.customlanguage.Util.format;

/**
 * represents var types
 */
public enum Type {
    BYTE(1),
    WORD(2),
    DWORD(4);

    public final int size;

    Type(int size) {
        this.size = size;
    }

    public static Type get(String name) {
        return valueOf(name.toUpperCase());
    }

    public String sizeOperand() {
        switch (size) {
            case 1:
                return "byte";
            case 2:
                return "word";
            case 4:
                return "dword";
            default:
                throw new CompileError(format("unknown size operand %s for type %s", size, this));
        }
    }
}
