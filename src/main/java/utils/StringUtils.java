package utils;

public class StringUtils {

    public static String extractTextBeforeDotOrColon(String text) {
        String[] parts = text.split("[.:]", 2);
        return parts[0];
    }
}
