import java.util.Scanner;

public class Sum_Odd_Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 1;
        for (int i = 0; counter <= num; i++) {
            if (i % 2 > 0) {
                System.out.printf("%d\n", i);
                sum += i;
                counter++;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}