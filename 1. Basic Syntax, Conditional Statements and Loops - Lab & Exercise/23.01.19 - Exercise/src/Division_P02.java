import java.util.Scanner;

public class Division_P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int divisible = 0;

        if (num % 2 == 0) {
            divisible = 2;
        }
        if (num % 3 == 0) {
            divisible = 3;
        }
        if (num % 6 == 0) {
            divisible = 6;
        }
        if (num % 7 == 0) {
            divisible = 7;
        }
        if (num % 10 == 0) {
            divisible = 10;
        }

        if (divisible == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", divisible);
        }
    }
}