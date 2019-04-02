import java.util.Scanner;

public class Pounds_to_Dollars_P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double USD = Double.parseDouble(scanner.nextLine());
        double pounds = USD * 1.31;
        System.out.printf("%.3f", pounds);
    }
}