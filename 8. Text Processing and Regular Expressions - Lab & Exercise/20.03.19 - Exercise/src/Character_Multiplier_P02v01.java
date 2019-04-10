import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Character_Multiplier_P02v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        String firstWord = input.substring(0, input.indexOf(' '));
        String secondWord = input.substring(input.lastIndexOf(' ') + 1);

        System.out.println(multiplyCharacters(firstWord, secondWord));
    }

    private static long multiplyCharacters(String first, String second) {
        int minLength = Math.min(first.length(), second.length());

        long sum = 0;
        for (int i = 0; i < minLength; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }
        String maxLength = first.length() < second.length() ? second : first;

        for (int i = minLength; i < maxLength.length(); i++) {
            sum += maxLength.charAt(i);
        }
        return sum;
    }
}