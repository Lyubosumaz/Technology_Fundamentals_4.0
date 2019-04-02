import java.util.Scanner;

public class Day_of_Week_P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (inputNum < 1 || inputNum > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(days[inputNum - 1]);
        }
    }
}