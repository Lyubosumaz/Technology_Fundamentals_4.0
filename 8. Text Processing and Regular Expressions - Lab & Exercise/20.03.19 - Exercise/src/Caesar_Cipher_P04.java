import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caesar_Cipher_P04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();

        String outputText = "";

        for (int i = 0; i < inputText.length(); i++) {
            char cipher = (char) (inputText.charAt(i) + 3);
            outputText += cipher;
        }
        System.out.println(outputText);
    }
}