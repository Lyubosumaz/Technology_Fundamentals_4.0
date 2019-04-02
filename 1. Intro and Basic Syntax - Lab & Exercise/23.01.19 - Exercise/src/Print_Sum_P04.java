import java.util.Scanner;

public class Print_Sum_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}