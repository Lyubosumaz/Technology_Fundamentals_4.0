import java.util.Scanner;

public class Printing_Triangle_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            printLine(i);
        }

        for (int i = input - 1; i >= 1; i--) {
            printLine(i);
        }

    }

    private static void printLine(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

}