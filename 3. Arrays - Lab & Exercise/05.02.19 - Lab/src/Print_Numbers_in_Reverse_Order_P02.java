import java.util.Scanner;

public class Print_Numbers_in_Reverse_Order_P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[inputNum];
        for (int i = 0; i < inputNum; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
    }
}