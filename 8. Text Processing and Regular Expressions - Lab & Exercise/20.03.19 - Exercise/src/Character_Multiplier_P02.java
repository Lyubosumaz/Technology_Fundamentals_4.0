import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Character_Multiplier_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputText = reader.readLine().split("\\s+");

        System.out.println(multiplication(inputText));
    }

    public static int multiplication(String[] text) {
        String left = text[0];
        String right = text[1];

        int sum = 0;
        if (left.length() == right.length()) {

            for (int i = 0; i < left.length(); i++) {
                sum += left.charAt(i) * right.charAt(i);
            }
            return sum;
        } else {
            int smallerLength = left.length();
            String biggerLength = right;
            if (left.length() > right.length()) {
                smallerLength = right.length();
                biggerLength = left;
            }

            for (int i = 0; i < smallerLength; i++) {
                sum += left.charAt(i) * right.charAt(i);
            }
            int addSum = 0;
            for (int i = smallerLength; i < biggerLength.length(); i++) {
                if (left.length() > right.length()) {
                    addSum += left.charAt(i);
                } else {
                    addSum += right.charAt(i);
                }
            }
            return sum + addSum;
        }
    }
}