package com.johncorby.customlanguage;

/**
 * todo
 * test suite for compiling (and possibly running) programs
 * make this whole thing more into a translator (aka store less info on things) to more easily blend with assembly
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
