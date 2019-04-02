import java.util.Scanner;

public class Array_Rotation_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        String[] rotationArray = new String[inputArray.length];
        rotationArray = inputArray;

        for (int i = 0; i < n; i++) {
            String temp = "";
            temp = rotationArray[0];
            for (int j = 0; j < inputArray.length - 1; j++) {
                rotationArray[j] = inputArray[j + 1];
            }
            rotationArray[inputArray.length - 1] = temp;
        }
        for (int i = 0; i < rotationArray.length; i++) {
            System.out.printf("%s ", rotationArray[i]);
        }
    }
}