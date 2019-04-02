import java.util.Scanner;

public class Train_P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int[] arrayPassengers = new int[inputNum];
        int sumPassengers = 0;
        for (int i = 0; i < inputNum; i++) {
            int passengers = Integer.parseInt(scanner.nextLine());
            arrayPassengers[i] = passengers;
            sumPassengers += passengers;
        }
        for (int i = 0; i < arrayPassengers.length; i++) {
            System.out.printf("%d ", arrayPassengers[i]);
        }
        System.out.printf("\n%d", sumPassengers);
    }
}