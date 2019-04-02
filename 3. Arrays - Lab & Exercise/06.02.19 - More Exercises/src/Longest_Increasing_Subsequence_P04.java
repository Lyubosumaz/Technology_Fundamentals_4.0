import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Longest_Increasing_Subsequence_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int[] lengths = new int[numbers.length];
        int[] previousPosition = new int[numbers.length];

        int maximumLength = 0;
        int lastIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            lengths[i] = 1;
            previousPosition[i] = -1;
            for (int j = 0; j <= i - 1; j++) {
                if (numbers[j] < numbers[i] && lengths[j] + 1 > lengths[i]) {
                    lengths[i] = lengths[i] + 1;
                    previousPosition[i] = j;
                }
                if (lengths[i] > maximumLength) {
                    maximumLength = lengths[i];
                    lastIndex = i;
                }
            }
        }
        List<Integer> output = new ArrayList<>();
        while (lastIndex != -1) {
            output.add(numbers[lastIndex]);
            lastIndex = previousPosition[lastIndex];
        }
        Collections.reverse(output);
        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
    }
}