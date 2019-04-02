import java.util.Scanner;
import java.util.regex.Pattern;

public class From_Left_to_The_Right_P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        while (input-- > 0) {
            long biggerNum = 0;
            String num = scanner.nextLine();
            String[] parts = num.split(Pattern.quote(" "));
            long partOne = Long.parseLong(parts[0]);
            long partTwo = Long.parseLong(parts[1]);
            if (partOne >= partTwo) {
                biggerNum = partOne;
            } else {
                biggerNum = partTwo;
            }
            int sum = 0;
            while (biggerNum == 0) {
                sum += biggerNum % 10;
                biggerNum /= 10;
            }
            System.out.println(sum);
        }
    }
}