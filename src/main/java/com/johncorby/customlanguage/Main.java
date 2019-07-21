package com.johncorby.customlanguage;

public class Main {
    public static String IN_PATH;

    public static void main(String[] args) {
        IN_PATH = args[0];

        Asm.init();
        Parse.go();
        Asm.make();
    }
}
