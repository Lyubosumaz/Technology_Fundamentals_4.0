import java.util.Scanner;

public class Middle_Characters_P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(middle(input));
    }

    private static String middle(String text) {
        int position = 0;
        int length = 0;
        if (text.length() % 2 == 0) {
            position = text.length() / 2 - 1;
            length = 2;
        } else {
            position = text.length() / 2;
            length = 1;
        }
        String result = "";
        for (int i = position; i < position + length; i++) {
            result += text.charAt(i);
        }
        return result;
    }
}