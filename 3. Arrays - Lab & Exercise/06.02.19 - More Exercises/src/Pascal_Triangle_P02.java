import java.util.Scanner;

public class Pascal_Triangle_P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] firstArray = {1, 1};
        String output = "1 \n1 1";

        if (input == 1) {
            System.out.println("1");
        } else {
            while (input-- > 2) {
                output += "\n";
                int[] sumArray = new int[firstArray.length - 1];
                int[] derivativeArray = new int[firstArray.length + 1];
                for (int i = 0; i < firstArray.length - 1; i++) {
                    sumArray[i] = firstArray[i] + firstArray[i + 1];
                }
                derivativeArray[0] = 1;
                derivativeArray[derivativeArray.length - 1] = 1;
                for (int i = 0; i < sumArray.length; i++) {
                    derivativeArray[i + 1] = sumArray[i];
                }
                for (int i = 0; i < derivativeArray.length; i++) {
                    output += derivativeArray[i] + " ";
                }
                firstArray = derivativeArray;
            }
            System.out.println(output);
        }
    }
}