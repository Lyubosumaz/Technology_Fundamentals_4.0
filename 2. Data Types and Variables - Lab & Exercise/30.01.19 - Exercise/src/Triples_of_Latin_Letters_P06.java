import java.util.Scanner;

public class Triples_of_Latin_Letters_P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < input; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < input; k++) {
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c\n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}