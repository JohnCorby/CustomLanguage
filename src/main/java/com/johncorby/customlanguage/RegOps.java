package com.johncorby.customlanguage;

import static com.johncorby.customlanguage.Util.cassert;

/**
 * handles operations of registers
 * <p>
 * uses c calling conventions
 * scratch: eax, ecx, edx
 * preserved: ebx, esi, edi, ebp, esp
 * <p>
 * see {@link Expr}
 */
public class RegOps {
    public static void assertFree(Reg reg) {
        cassert(reg.free, String.format("reg %s is not free and is supposed to be", reg));
    }

    public static Reg getFree() {
        for (var reg : Reg.values())
            if (reg.free) return reg;
        throw new CompileError("all registers used because im an idiot");
    }

    public static Reg load(String thing) {
        var reg = getFree();
        Asm.write(String.format("mov %s, %s ; %s = %s", reg, thing, reg, thing));
        reg.free = false;
        return reg;
    }

    public static void store(String thing, Reg reg) {
        Asm.write(String.format("mov %s, %s ; %s = %s", thing, reg, thing, reg));
        reg.free = true;
    }

    public static void add(Reg reg1, Reg reg2) {
        Asm.write(String.format("add %s, %s ; %s += %s", reg1, reg2, reg1, reg2));
        reg2.free = true;
    }

    public static void mul(Reg reg1, Reg reg2) {
        Asm.write(String.format("imul %s, %s ; %s *= %s", reg1, reg2, reg1, reg2));
        reg2.free = true;
    }

    public enum Reg {
        EAX(false),
        EDX(false),
        ECX(false),
        EBX(true),
        ESI(true),
        EDI(true),
        EBP(true),
        ESP(true);

        public final boolean preserved;
        public boolean free = true;

        Reg(boolean preserved) {
            this.preserved = preserved;
        }

        public static Reg get(String name) {
            return valueOf(name.toUpperCase());
        }

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
