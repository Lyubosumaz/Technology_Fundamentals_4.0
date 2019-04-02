import java.util.Arrays;
        import java.util.Scanner;

public class Even_and_Odd_Subtraction_P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0, oddSum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}