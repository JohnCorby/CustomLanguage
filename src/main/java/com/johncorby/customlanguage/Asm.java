package com.johncorby.customlanguage;

import java.io.FileWriter;
import java.io.IOException;

import static com.johncorby.customlanguage.Main.IN_PATH;
import static com.johncorby.customlanguage.Util.change_ext;
import static com.johncorby.customlanguage.Util.do_cmd;

public class Asm {
    private static String OUT_PATH;
    private static FileWriter stream;

    public static void init() {
        OUT_PATH = change_ext(IN_PATH, ".asm");
        try {
            stream = new FileWriter(OUT_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(String... lines) {
        try {
            for (var line : lines)
                stream.write(line + '\n');
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void make() {
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        do_cmd("make", OUT_PATH);
    }
}
