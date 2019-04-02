import java.util.Scanner;

public class Special_Numbers_P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        String check = "";
        int temp = 0;
        int sum = 0;
        for (int i = 1; i <= times; i++) {
            temp = i;
            while (temp != 0) {
                sum += (temp % 10);
                temp /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                check = "True";
            } else {
                check = "False";
            }
            sum = 0;
            System.out.printf("%d -> %s\n", i, check);
        }
    }
}