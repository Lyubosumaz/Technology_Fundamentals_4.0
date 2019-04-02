import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tribonacci_Sequence_P04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int input = Integer.parseInt(reader.readLine());
        if (input >= 3) {
            inputBiggerThanThree(input);
        } else {
            inputUnderThree(input);
        }
    }

    private static void inputUnderThree(int input) {
        int[] underThree = {1, 1, 2};
        for (int i = 0; i < input; i++) {
            System.out.printf("%d ", underThree[i]);
        }
    }

    private static void inputBiggerThanThree(int input) {
        int[] tribonacciSequenceArray = new int[input];
        tribonacciSequenceArray[0] = 1;
        tribonacciSequenceArray[1] = 1;
        tribonacciSequenceArray[2] = 2;
        for (int i = 3; i < input; i++) {
            tribonacciSequenceArray[i] = tribonacciSequenceArray[i - 1] + tribonacciSequenceArray[i - 2] + tribonacciSequenceArray[i - 3];
        }
        for (int i = 0; i < tribonacciSequenceArray.length; i++) {
            System.out.printf("%d ", tribonacciSequenceArray[i]);
        }
    }
}