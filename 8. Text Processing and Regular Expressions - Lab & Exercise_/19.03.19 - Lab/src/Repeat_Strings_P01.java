import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repeat_Strings_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                result.append(word);
            }
        }
        System.out.println(result);
    }
}