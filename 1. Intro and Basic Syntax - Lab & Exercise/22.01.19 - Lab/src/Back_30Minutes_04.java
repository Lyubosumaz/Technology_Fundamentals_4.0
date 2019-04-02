import java.util.Scanner;

public class Back_30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;
        int timeHours = totalMinutes / 60;
        int timeMinutes = totalMinutes % 60;

        if (hours >= 23) {
            timeHours = 0;
        }
        System.out.printf("%d:%02d", timeHours, timeMinutes);
    }
}