import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_Power_P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        DecimalFormat format = new DecimalFormat("#.#####");
        System.out.println(format.format(mathPower(number, power)));
    }

    private static double mathPower(double num, int pow) {
        double result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= num;
        }
        return result;
    }
}
