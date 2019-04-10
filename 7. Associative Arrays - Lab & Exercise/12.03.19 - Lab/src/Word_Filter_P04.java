import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Word_Filter_P04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputWords = Arrays.stream(reader.readLine().split("\\s+")).
                filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        for (String word : inputWords) {
            System.out.println(word);
        }
    }
}