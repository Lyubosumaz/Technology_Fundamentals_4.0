import java.util.Scanner;

public class Vending_Machine_P07v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";
        double sum = 0.0;
        while (!"Start".equalsIgnoreCase(text)) {
            double currentInput = Double.parseDouble(scanner.nextLine());
            if (currentInput == 0.1 || currentInput == 0.2 || currentInput == 0.5 || currentInput == 1 || currentInput == 2) {
                sum += currentInput;
            } else {
                System.out.printf("Cannot accept %.2f\n", currentInput);
            }
            text = Double.toString(currentInput);
        }
    }
}