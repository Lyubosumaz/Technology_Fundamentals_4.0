import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Condense_Array_to_Number_P07 {
    public static void main(String[] args) throws IOException {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputNumbers = Arrays.stream(((BufferedReader) reader).readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (inputNumbers.length > 1) {
            int[] condensed = new int[inputNumbers.length - 1];
            for (int i = 0; i < inputNumbers.length - 1; i++) {
                condensed[i] = inputNumbers[i] + inputNumbers[i + 1];
            }
            inputNumbers = condensed;
        }
//        System.out.println(Arrays.toString(inputNumbers));
        Arrays.stream(inputNumbers).forEach(System.out::println);
    }
}