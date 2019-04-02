import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply_Evens_by_Odds_P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        System.out.println(multiplyEvenOddNumbers(Math.abs(input)));
    }


    private static int multiplyEvenOddNumbers(int number) {
        int evenSum = sumEvenDigits(number);
        int oddSum = sumOddDigits(number);
        return evenSum * oddSum;
    }

    private static int sumEvenDigits(int number) {
        int temp = 0;
        int sumEven = 0;
        while (number > 0) {
            temp = number % 10;
            if (temp % 2 == 0) {
                sumEven += temp;
            }
            number /= 10;
        }
        return sumEven;
    }

    private static int sumOddDigits(int number) {
        int temp = 0;
        int sumOdd = 0;
        while (number > 0) {
            temp = number % 10;
            if (temp % 2 != 0) {
                sumOdd += temp;
            }
            number /= 10;
        }
        return sumOdd;
    }
}