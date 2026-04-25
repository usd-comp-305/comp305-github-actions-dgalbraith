package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverseString_hello() {
        assertEquals("hello", StringUtils.reverseString("olleh"));
    }


}