import java.util.Scanner;

public class Magic_Sum_P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);

        }
        int magicNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == magicNumber) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}