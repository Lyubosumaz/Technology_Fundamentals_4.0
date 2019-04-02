import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace_Repeating_Chars_P06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();

        String outputText = "";

        int counter = 0;

        String outputChar = "";
        for (int i = 0; i < inputText.length(); i++) {
            String currentChar = Character.toString(inputText.charAt(i));
            if (!outputChar.equals(currentChar)) {
                outputChar = currentChar;
                counter += 1;
            }
            if (counter == 1) {
                outputText += currentChar;
                counter = 0;
            }
        }
        System.out.println(outputText);
    }
}