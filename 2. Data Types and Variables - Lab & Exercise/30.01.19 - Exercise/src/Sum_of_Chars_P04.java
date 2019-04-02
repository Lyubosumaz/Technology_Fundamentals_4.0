import java.util.Scanner;

public class Sum_of_Chars_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < num; i++) {
            char input = scanner.nextLine().charAt(0);
            sum += input;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}