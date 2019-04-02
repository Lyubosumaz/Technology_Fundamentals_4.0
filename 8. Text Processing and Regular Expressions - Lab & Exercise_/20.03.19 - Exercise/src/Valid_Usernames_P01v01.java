import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Valid_Usernames_P01v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split(", ");
        for (String word : words) {
            if (validateWord(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean validateWord(String word) {
        if (word.length() < 3 || word.length() > 16) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetterOrDigit(word.charAt(i)) && word.charAt(i) != '-' && word.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }
}