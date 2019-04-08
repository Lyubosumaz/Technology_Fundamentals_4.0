import java.util.Scanner;

public class Vending_Machine_P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0;
        while (true) {
            String moneyInput = scanner.nextLine();
            if ("Start".equalsIgnoreCase(moneyInput)) {
                break;
            }
            switch (moneyInput) {
                case "0.1":
                    totalMoney += 0.10;
                    break;
                case "0.2":
                    totalMoney += 0.20;
                    break;
                case "0.5":
                case "0.50":
                    totalMoney += 0.50;
                    break;
                case "1":
                    totalMoney += 1.00;
                    break;
                case "2":
                    totalMoney += 2.00;
                    break;
                default:
                    double currentInput = Double.parseDouble(moneyInput);
                    System.out.printf("Cannot accept %.2f\n", currentInput);
                    break;
            }
        }
        double productPrice = 0;
        while (true) {
            String buyProduct = scanner.nextLine();
            if ("End".equalsIgnoreCase(buyProduct)) {
                break;
            }
            switch (buyProduct) {
                case "Nuts":
                    productPrice = 2.00;
                    if (totalMoney >= productPrice) {
                        totalMoney -= productPrice;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    productPrice = 0.70;
                    if (totalMoney >= productPrice) {
                        totalMoney -= productPrice;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    productPrice = 1.50;
                    if (totalMoney >= productPrice) {
                        totalMoney -= productPrice;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    productPrice = 0.80;
                    if (totalMoney >= productPrice) {
                        totalMoney -= productPrice;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    productPrice = 1.00;
                    if (totalMoney >= productPrice) {
                        totalMoney -= productPrice;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}