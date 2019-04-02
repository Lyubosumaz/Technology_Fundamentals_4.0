import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password_Validator_P04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputPassword = reader.readLine();
        if (!checkLength(inputPassword)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkLettersDigits(inputPassword)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!checkForTwoDigits(inputPassword)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (checkLength(inputPassword) && checkLettersDigits(inputPassword) && checkForTwoDigits(inputPassword)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean checkLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean checkLettersDigits(String password) {
        String allCorrectValues = "";
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if ((currentSymbol >= 48 && currentSymbol <= 57) ||
                    (currentSymbol >= 65 && currentSymbol <= 90) ||
                    (currentSymbol >= 97 && currentSymbol <= 122)) {
                allCorrectValues += ((char) (i));
            } else {
                return false;
            }
        }
        if (allCorrectValues.length() == password.length()) {
            return true;
        }
        return false;
    }

    public static boolean checkForTwoDigits(String password) {
        int numberOfDigits = 0;
        int tempNum = 0;
        for (int i = 0; i < password.length(); i++) {
            tempNum = password.charAt(i);
            if (tempNum >= 48 && tempNum <= 57) {
                numberOfDigits++;
            }
            if (numberOfDigits >= 2) {
                return true;
            }
        }
        return false;
    }
}