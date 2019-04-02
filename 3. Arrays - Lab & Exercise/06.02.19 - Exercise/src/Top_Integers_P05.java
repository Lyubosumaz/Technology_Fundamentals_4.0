import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Top_Integers_P05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            boolean anyBigger = true;


            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    anyBigger = false;
                    break;
                }
            }
            if (anyBigger) {
                System.out.printf("%d ", numbers[i]);
            }
        }
    }
}