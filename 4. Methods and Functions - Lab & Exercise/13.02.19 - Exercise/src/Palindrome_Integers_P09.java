import java.util.Scanner;

public class Palindrome_Integers_P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        while (!"END".equals(input = scanner.nextLine())) {
            if (palindromeInteger(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    private static boolean palindromeInteger(String number) {
        boolean isPalindrome = false;
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) == number.charAt(number.length() - 1 - i)) {
                isPalindrome = true;
            } else {
                return isPalindrome;
            }
        }
        return isPalindrome;
    }
}