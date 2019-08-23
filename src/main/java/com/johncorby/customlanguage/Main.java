package com.johncorby.customlanguage;

/**
 * todo
 * make everything an offset, using #define to alias var names to indexes
 * test suite for compiling (and possibly running) programs
 */
public class Main {
    public static String IN_PATH;

    public static void main(String[] args) {
        IN_PATH = args[0];

        Asm.init();
        Parse.go();
        Asm.make();
    }
}
