import java.util.Scanner;

public class Spice_Must_Flow_P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYields = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;
        if (startingYields < 100) {
            System.out.printf("%d\n%d\n", counter, sum);
        } else {
            while (startingYields >= 100) {
                int totalSpice = startingYields - 26;
                sum += totalSpice;
                startingYields -= 10;
                counter++;
            }
            int abandonMine = sum - 26;
            System.out.printf("%d\n%d\n", counter, abandonMine);
        }
    }
}