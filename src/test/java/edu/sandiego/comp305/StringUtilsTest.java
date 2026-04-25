package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverseString_hello() {
        assertEquals("hello", StringUtils.reverseString("olleh"));
    }

    @Test
    void reverseString_a() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reverseString_helloWorld() {
        assertEquals("hello world", StringUtils.reverseString("dlrow olleh"));
    }
}
