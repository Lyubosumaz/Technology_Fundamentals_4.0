import java.util.Arrays;
        import java.util.Scanner;

public class Zig_Zag_Arrays_P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] redArray = new int[input];
        int[] blueArray = new int[input];
        int counter = 1;

        for (int i = 0; i < input; i++) {
            int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (counter % 2 == 0) {
                blueArray[i] = num[0];
                redArray[i] = num[1];
            } else {
                redArray[i] = num[0];
                blueArray[i] = num[1];
            }
            counter++;
        }

        for (int i = 0; i < input; i++) {
            if (i < input - 1) {
                System.out.print(redArray[i] + " ");
            } else {
                System.out.println(redArray[i]);
            }
        }
        for (int i = 0; i < input; i++) {
            if (i < input - 1) {
                System.out.print(blueArray[i] + " ");
            } else {
                System.out.println(blueArray[i]);
            }
        }
    }
}