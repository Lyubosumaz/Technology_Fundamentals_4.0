import java.util.Scanner;

public class Gaming_Store_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double spent = 0;
        String gameName = scanner.nextLine();
        while (!"Game Time".equalsIgnoreCase(gameName)) {
            switch (gameName) {
                case "OutFall 4":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        balance -= 39.99;
                        spent += 39.99;
                        System.out.println("Bought OutFall 4");
                        break;
                    }
                case "CS: OG":
                    if (balance < 15.99) {
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        balance -= 15.99;
                        spent += 15.99;
                        System.out.println("Bought CS: OG");
                        break;
                    }
                case "Zplinter Zell":
                    if (balance < 19.99) {
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        balance -= 19.99;
                        spent += 19.99;
                        System.out.println("Bought Zplinter Zell");
                        break;
                    }
                case "Honored 2":
                    if (balance < 59.99) {
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        balance -= 59.99;
                        spent += 59.99;
                        System.out.println("Bought Honored 2");
                        break;
                    }
                case "RoverWatch":
                    if (balance < 29.99) {
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        balance -= 29.99;
                        spent += 29.99;
                        System.out.println("Bought RoverWatch");
                        break;
                    }
                case "RoverWatch Origins Edition":
                    if (balance < 39.99) {
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        balance -= 39.99;
                        spent += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                        break;
                    }
                default:
                    System.out.println("Not Found");
                    break;
            }
            gameName = scanner.nextLine();
        }
        if (balance == 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);
        }
    }
}