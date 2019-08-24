package com.johncorby.customlanguage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * misc utils
 */
public class Util {
    public static String toString(Object obj) {
        if (obj instanceof Object[])
            return Arrays.deepToString((Object[]) obj);
        return String.valueOf(obj);
    }

    public static String format(String format, Object... args) {
        var fargs = Arrays.stream(args)
                .map(Util::toString)
                .toArray(String[]::new);
        return String.format(format, fargs);
    }

    public static void print(Object x) {
        System.out.println(x);
    }

    public static void print(String format, Object... args) {
        print(format(format, args));
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

    /**
     * filter class objects by subclass
     */
    public static <T, R extends T> Stream<R> filterClass(Collection<T> input, Class<R> clazz) {
        return input.stream()
                .filter(clazz::isInstance)
                .map(t -> (R) t);
    }
}
