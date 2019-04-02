import java.math.BigDecimal;
import java.util.Scanner;

public class Exact_Sum_Real_Numbers_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal("0");
        for (int i = 0; i < numbersCount; i++) {
            BigDecimal input = new BigDecimal(scanner.nextLine());
            sum = sum.add(input);
        }
        System.out.println(sum);
    }
}