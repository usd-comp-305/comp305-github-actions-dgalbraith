package edu.sandiego.comp305;

public final class StringUtils {

    private StringUtils() {
    }

    public static String reverseString(final String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
