import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Data_Type_Finder_P01v3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while (!"END".equals(input = reader.readLine())) {
            boolean isInt = true;

            try {
                int integerNumber = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInt = false;
            }

            boolean isDouble = true;
            try {
                double floatingNumber = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }

            if (isInt) {
                System.out.printf("%s is integer type\n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating point type\n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type\n", input);
            } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))) {
                System.out.printf("%s is boolean type\n", input);
            } else {
                System.out.printf("%s is string type\n", input);
            }
        }
    }
}