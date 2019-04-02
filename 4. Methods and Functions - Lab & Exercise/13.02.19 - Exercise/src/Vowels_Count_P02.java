import java.util.Scanner;

public class Vowels_Count_P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        numberOfVowels(input);
    }

    private static void numberOfVowels(String text) {
        int numberVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 65 || text.charAt(i) == 97 ||
                    text.charAt(i) == 69 || text.charAt(i) == 101 ||
                    text.charAt(i) == 73 || text.charAt(i) == 105 ||
                    text.charAt(i) == 79 || text.charAt(i) == 111 ||
                    text.charAt(i) == 85 || text.charAt(i) == 117) {
                numberVowels++;
            }
        }
        System.out.println(numberVowels);
    }
}