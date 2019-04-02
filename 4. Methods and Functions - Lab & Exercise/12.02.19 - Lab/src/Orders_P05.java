import java.util.Scanner;

public class Orders_P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String order = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        amountToPay(order, quantity);
    }

    public static void amountToPay(String product, int quantity) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", (double) (1.50 * quantity));
                break;
            case "water":
                System.out.printf("%.2f", (double) (1.00 * quantity));
                break;
            case "coke":
                System.out.printf("%.2f", (double) (1.40 * quantity));
                break;
            case "snacks":
                System.out.printf("%.2f", (double) (2.00 * quantity));
                break;
        }
    }
}