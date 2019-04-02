import java.util.Scanner;

public class Vacation_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double singlePerson = 0.00;
        if (type.equalsIgnoreCase("Students")) {
            switch (day) {
                case "Friday":
                    singlePerson = 8.45;
                    break;
                case "Saturday":
                    singlePerson = 9.80;
                    break;
                case "Sunday":
                    singlePerson = 10.46;
                    break;
            }
        } else if (type.equalsIgnoreCase("Business")) {
            switch (day) {
                case "Friday":
                    singlePerson = 10.90;
                    break;
                case "Saturday":
                    singlePerson = 15.60;
                    break;
                case "Sunday":
                    singlePerson = 16;
                    break;
            }
        } else if (type.equalsIgnoreCase("Regular")) {
            switch (day) {
                case "Friday":
                    singlePerson = 15;
                    break;
                case "Saturday":
                    singlePerson = 20;
                    break;
                case "Sunday":
                    singlePerson = 22.50;
                    break;
            }
        }
        double totalPrice = singlePerson * groupSize;
        if (type.equalsIgnoreCase("Students") && groupSize >= 30) {
            totalPrice -= totalPrice * 0.15;
        } else if (type.equalsIgnoreCase("Business") && groupSize >= 100) {
            totalPrice -= (singlePerson * 10);
        } else if (type.equalsIgnoreCase("Regular") && groupSize >= 10 && groupSize <= 20) {
            totalPrice -= totalPrice * 0.05;
        }
        System.out.printf("Total price: %.02f", totalPrice);
    }
}