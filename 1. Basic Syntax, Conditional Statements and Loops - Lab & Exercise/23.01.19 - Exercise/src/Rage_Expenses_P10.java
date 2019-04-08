import java.util.Scanner;

public class Rage_Expenses_P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesPrice = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = (lostGamesPrice / 2) * headsetPrice + (lostGamesPrice / 3) * mousePrice + (lostGamesPrice / 6) * keyboardPrice + (lostGamesPrice / 12) * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}