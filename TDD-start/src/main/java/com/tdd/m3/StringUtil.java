package com.tdd.m3;

public class StringUtil {
    public static String truncate(String input, int limit) throws IllegalArgumentException {
        if (input == null) throw new IllegalArgumentException("String cant be null");
        if (limit <= 0) throw new IllegalArgumentException("Limit need to me higher than 0");

        String ellipsis = "...";
        String tmp = input.trim();
        if (tmp.length() <= limit || tmp.length() <= ellipsis.length()) return input;

        return input.substring(0, limit) + ellipsis;
    }
}
