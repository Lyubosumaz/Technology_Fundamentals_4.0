import java.util.Scanner;

public class Max_Sequence_of_Equal_Elements_P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int outputNum = 0;
        int maxCounter = 0;

        for (int i = 0; i < numbers.length; i++) {
            int currentCounter = 0;

            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    currentCounter++;

                    if (currentCounter > maxCounter) {
                        maxCounter = currentCounter;
                        outputNum = numbers[j];
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < maxCounter; i++) {
            System.out.printf("%d ", outputNum);
        }
    }
}