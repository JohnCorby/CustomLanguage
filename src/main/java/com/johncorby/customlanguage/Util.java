package com.johncorby.customlanguage;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * misc utils
 */
public class Util {
    /**
     * convert any object to a string
     */
    public static String toString(Object obj) {
        if (obj instanceof Object[])
            return Arrays.deepToString((Object[]) obj);
        return String.valueOf(obj);
    }

    /**
     * python-like print format
     */
    public static String format(Object... args) {
        StringBuilder msg = new StringBuilder();
        for (var arg : args)
            msg.append(toString(arg)).append(' ');
        return msg.toString();
    }

    /**
     * python-like print
     */
    public static void print(Object... args) {
        System.out.println(format(args));
    }

    /**
     * exec command as process
     */
    public static int do_cmd(String... args) {
        try {
            return new ProcessBuilder(args)
                    .inheritIO()
                    .start()
                    .waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     * change extension of file name
     */
    public static String change_ext(String file, String ext) {
        return file.substring(0, file.lastIndexOf('.')) + ext;
    }

    /**
     * assert but raise {@link CompileError} instead of {@link AssertionError}
     */
    public static void cassert(boolean condition, String errorMsg) {
        if (!condition) throw new CompileError(errorMsg);
    }

    /**
     * replace all patterns in input using a mapping function
     */
    public static String replaceMap(String input, String pattern, Function<MatchResult, String> mapper) {
        var matches = Pattern.compile(pattern)
                .matcher(input)
                .results()
                .collect(Collectors.toSet());
        for (var match : matches)
            input = input.replace(
                    match.group(),
                    mapper.apply(match)
            );
        return input;
    }
}
