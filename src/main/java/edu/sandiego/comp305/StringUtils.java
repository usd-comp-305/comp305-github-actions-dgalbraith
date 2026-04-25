package edu.sandiego.comp305;

public class StringUtils {

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

}
