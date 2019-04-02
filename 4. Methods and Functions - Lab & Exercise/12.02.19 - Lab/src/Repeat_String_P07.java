import java.util.Scanner;

public class Repeat_String_P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String neededToBeRepeat = scanner.nextLine();
        int timesToBeRepeat = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(neededToBeRepeat, timesToBeRepeat));
    }


    private static String repeatString(String text, int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }
}
