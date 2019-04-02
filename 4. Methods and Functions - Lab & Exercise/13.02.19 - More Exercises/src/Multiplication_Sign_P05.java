import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication_Sign_P05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArray = new int[3];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println(result(inputArray));
    }

    private static String result(int[] threeNumbers) {
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < threeNumbers.length; i++) {
            if (threeNumbers[i] == 0) {
                return "zero";
            }
            if (threeNumbers[i] > 0) {
                countPositive++;
            }
            if (threeNumbers[i] < 0) {
                countNegative++;
            }
        }
        if ((countPositive == 1 && countNegative == 2) || countPositive == 3) {
            return "positive";
        } else {
            return "negative";
        }
    }
}