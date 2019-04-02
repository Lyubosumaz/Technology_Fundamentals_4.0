import java.util.Scanner;

public class Recursive_Fibonacci_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        long[] fibonacciNumbers = {1, 1};
        int counter = 0;
        if (input == 0) {
            System.out.println(0);
        } else {
            while (input-- > 2) {
                long[] fibonacciSequence = new long[fibonacciNumbers.length + 1];

                for (int i = 0; i < fibonacciNumbers.length; i++) {
                    fibonacciSequence[i] = fibonacciNumbers[i];
                }
                fibonacciSequence[fibonacciSequence.length - 1] = fibonacciSequence[counter] + fibonacciSequence[counter + 1];
                counter++;
                fibonacciNumbers = fibonacciSequence;
            }
            System.out.println(fibonacciNumbers[fibonacciNumbers.length - 1]);
        }
    }
}