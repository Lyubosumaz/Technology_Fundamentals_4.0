import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digits_Letters_and_Other_P05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();

        String digits = "";
        String letters = "";
        String characters = "";

        for (int i = 0; i < inputText.length(); i++) {
            char current = inputText.charAt(i);
            if (Character.isDigit(current)) {
                digits += current;
            } else if (Character.isAlphabetic(current)) {
                letters += current;
            } else if (Character.isDefined(current)) {
                characters += current;
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(characters);
    }
}