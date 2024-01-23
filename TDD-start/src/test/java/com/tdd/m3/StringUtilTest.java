package com.tdd.m3;

import com.tdd.m3.StringUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("The String util class should")
public class StringUtilTest {
    @ParameterizedTest()
    @CsvSource(textBlock = """
                T..., 1
                The economy..., 11
            """)
    @DisplayName("Truncate the string and add the '...' in the end if the limit was reached")
    public void limitReached_StringTruncates(String output, int limit) {
        String input = "The economy is about to";
        assertEquals(output, StringUtil.truncate(input, limit));
    }

    @ParameterizedTest()
    @CsvSource(textBlock = """
            The economy is about to, 30
            The economy is about to, 23
            """)
    @DisplayName("not truncate the string if the limit wasn't reached or it's equal to string length")
    public void limitNotReachOrEqual_StringNotChanged(String input, int limit) {
        assertEquals("The economy is about to", StringUtil.truncate(input, limit));
    }

    @ParameterizedTest()
    @CsvSource(textBlock = """
            '', 10
            '    ', 2
            """)
    @DisplayName("Not truncate if the input is blank or empty")
    public void inputEmptyOrBlank_StringNotChanged(String input, int limit) {
        assertEquals(input, StringUtil.truncate(input, limit));
    }

    @ParameterizedTest()
    @CsvSource(textBlock = """
            1
            2
            3
            """)
    @DisplayName("Not truncate if the resulted truncated string be bigger than the input itself")
    public void inputShorterThanLimit_StringNotChanged(int limit) {
        String input = "The";

        assertEquals(input, StringUtil.truncate(input, limit));
    }

    @ParameterizedTest()
    @CsvSource(textBlock = """
             , 30
            The economy is about to, -10
            The economy is about to, 0
            """)
    @DisplayName("throws an IllegalArgumentExepetion if the string is null or the limit is 0 or lower")
    public void invalidInput_IsReject(String input, int limit) {
        assertThrows(IllegalArgumentException.class, () -> StringUtil.truncate(input, limit));
    }
}
