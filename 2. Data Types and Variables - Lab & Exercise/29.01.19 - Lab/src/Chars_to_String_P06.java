import java.util.Scanner;

public class Chars_to_String_P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String connection = "";
        for (int i = 0; i < 3; i++) {
            char input = scanner.nextLine().charAt(0);
            connection = connection + input;
        }
        System.out.println(connection);
    }
}