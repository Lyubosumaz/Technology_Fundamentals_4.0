import java.util.Scanner;

public class Water_Overflow_P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int maxLiters = 0;
        for (int i = 0; i < input; i++) {
            int temp = 0;
            int liters = Integer.parseInt(scanner.nextLine());
            temp = maxLiters + liters;
            if (temp <= 255) {
                maxLiters += liters;
            } else {
                System.out.println("Insufficient capacity!");

            }
        }
        System.out.println(maxLiters);
    }
}