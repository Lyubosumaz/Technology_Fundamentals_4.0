import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Activation_Keys_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^[A-Za-z\\d]+$");

        String[] inputArray = reader.readLine().split("&");

        String output = "";

        for (int i = 0; i < inputArray.length; i++) {

            String codeLine = inputArray[i];
            Matcher matcher = pattern.matcher(codeLine);

            if (matcher.matches()) {
                StringBuilder upperCode = new StringBuilder();

                for (int j = 0; j < codeLine.length(); j++) {

                    char letter = codeLine.charAt(j);

                    if (codeLine.length() == 16) {
                        if (j == 4 || j == 8 || j == 12) {
                            upperCode.append('-');
                        }
                    } else if (codeLine.length() == 25) {
                        if (j == 5 || j == 10 || j == 15 || j == 20) {
                            upperCode.append('-');
                        }
                    }
                    int result = 9;
                    if (Character.isDigit(letter)) {
                        result -= Character.getNumericValue(letter);
                        upperCode.append(result);
                    }
                    if (Character.isLowerCase(letter)) {
                        upperCode.append(Character.toUpperCase(letter));
                    } else if (Character.isUpperCase(letter)) {
                        upperCode.append(Character.toChars(letter));
                    }
                }
                if (inputArray.length - 1 == i) {
                    output += upperCode;
                } else {
                    output += upperCode + ", ";
                }
            }
        }
        System.out.println(output);
    }
}