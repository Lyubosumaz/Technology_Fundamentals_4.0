import java.util.Scanner;

public class Theatre_Promotions_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int amount = 0;
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            if (age >= 0 && age <= 18) {
                switch (typeDay) {
                    case "Weekday":
                        amount = 12;
                        break;
                    case "Weekend":
                        amount = 15;
                        break;
                    case "Holiday":
                        amount = 5;
                        break;
                }
            } else if (age > 18 && age <= 64) {
                switch (typeDay) {
                    case "Weekday":
                        amount = 18;
                        break;
                    case "Weekend":
                        amount = 20;
                        break;
                    case "Holiday":
                        amount = 12;
                        break;
                }
            } else if (age > 64 && age <= 122) {
                switch (typeDay) {
                    case "Weekday":
                        amount = 12;
                        break;
                    case "Weekend":
                        amount = 15;
                        break;
                    case "Holiday":
                        amount = 10;
                        break;
                }
            }
            System.out.printf("%d$", amount);
        }
    }
}