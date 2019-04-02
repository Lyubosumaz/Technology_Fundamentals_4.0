import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Data_Type_Finder_P01v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        while (!"END".equals(input = reader.readLine())) {
            if (isInteger(input)) {
                System.out.printf("%s is integer type\n", input);
            } else if (isDouble(input)) {
                System.out.printf("%s is floating point type\n", input);
            } else if (isCharacterOrString(input)) {
                System.out.printf("%s is character type\n", input);
            } else if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type\n", input);
            } else {
                System.out.printf("%s is string type\n", input);
            }

        }
    }

    private static boolean isInteger(String num) {
        if (num.equals("-0")) {
            return false;
        }
        try {
            new BigInteger(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String num) {
        if (num.equals("-0") || num.equals("-0.0")) {
            return false;
        }
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isCharacterOrString(String text) {
        if (text.length() == 1) {
            return true;
        } else {
            return false;
        }
    }
}