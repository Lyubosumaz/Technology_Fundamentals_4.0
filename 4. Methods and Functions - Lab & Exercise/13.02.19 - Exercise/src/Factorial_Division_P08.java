import java.util.Scanner;

public class Factorial_Division_P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println(String.format("%.2f", factorialsABDivided(a, b)));
    }

    public static double factorialsABDivided(double a, double b) {
        double result = 0;

        double firstFactorial = 1;
        for (int i = 1; i <= a; i++) {
            firstFactorial *= i;
        }
        double secondFactorial = 1;
        for (int i = 1; i <= b; i++) {
            secondFactorial *= i;
        }
        result = firstFactorial / secondFactorial;
        return result;
    }
}