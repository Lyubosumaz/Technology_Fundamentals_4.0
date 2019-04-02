import java.util.Scanner;

public class Multiplication_Table2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10) {
            System.out.printf("%d X %d = %d\n", num, times, num * times);
        } else {
            for (int i = 1; times <= 10; i++) {
                System.out.printf("%d X %d = %d\n", num, times, num * times);
                times++;
            }
        }
    }
}