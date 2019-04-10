import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_Miner_Task_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();

        String inputText = reader.readLine();

        int wordIndex = inputText.indexOf(word);
        while (wordIndex != -1) {
            inputText = inputText.substring(0, wordIndex) + inputText.substring(wordIndex + word.length());

            wordIndex = inputText.indexOf(word);
        }
        System.out.println(inputText);
    }
}