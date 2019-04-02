import java.util.Arrays;
import java.util.Scanner;

public class Equal_Arrays_P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = 0;
        if (firstArray.length > secondArray.length) {
            maxLength = firstArray.length;
        } else {
            maxLength = secondArray.length;
        }
        int index = -1;
        int sum = 0;
        for (int i = 0; i < maxLength; i++) {
            sum += firstArray[i];
            if (firstArray[i] != secondArray[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);

        }
    }
}