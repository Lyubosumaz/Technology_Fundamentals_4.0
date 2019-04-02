import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class From_Left_to_The_Right_P02v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String output = "";
        int input = Integer.parseInt(reader.readLine());
        for (int i = 0; i < input; i++) {
            String[] twoNumbers = reader.readLine().split("\\s+");
            long leftPartOfArray = Long.parseLong(twoNumbers[0]);
            long rightPartOfArray = Long.parseLong(twoNumbers[1]);

            long biggerNum = Math.abs(rightPartOfArray);
            if (leftPartOfArray > rightPartOfArray) {
                biggerNum = Math.abs(leftPartOfArray);
            }
            long sumOfDigits = 0;
            while (biggerNum != 0) {
                sumOfDigits += biggerNum % 10;
                biggerNum /= 10;
            }
            output += sumOfDigits + "\n";
        }
        System.out.println(output);
    }
}