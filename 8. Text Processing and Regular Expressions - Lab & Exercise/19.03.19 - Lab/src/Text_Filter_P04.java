import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text_Filter_P04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] banWordsArray = reader.readLine().split(", ");
        String inputText = reader.readLine();

        for (String banWord : banWordsArray) {
            if (inputText.contains(banWord)) {
                String replacement = "";
                for (int i = 0; i < banWord.length(); i++) {
                    replacement += "*";
                }
                inputText = inputText.replace(banWord, replacement);
            }
        }
        System.out.println(inputText);
    }
}