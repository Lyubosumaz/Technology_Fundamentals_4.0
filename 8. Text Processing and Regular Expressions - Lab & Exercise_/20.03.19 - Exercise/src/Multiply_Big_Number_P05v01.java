import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply_Big_Number_P05v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputBigNumber = reader.readLine();
        int multiplier = Integer.parseInt(reader.readLine());

        String outputNumber = "";
        int onMind = 0;
        for (int i = inputBigNumber.length() - 1; i >= 0; i--) {

            int currentNumber = 0;
            if (onMind != 0) {

                currentNumber = Integer.parseInt(String.valueOf(inputBigNumber.charAt(i))) * multiplier;

                String numberString = String.valueOf(currentNumber);
                if (currentNumber > 9) {
                    outputNumber += (Integer.parseInt(String.valueOf(numberString.charAt(1))) + onMind);
                    onMind = Integer.parseInt(String.valueOf(numberString.charAt(0)));
                } else if (currentNumber + onMind > 9) {
                    numberString = String.valueOf(currentNumber + onMind);
                    outputNumber += Integer.parseInt(String.valueOf(numberString.charAt(1)));
                    onMind = Integer.parseInt(String.valueOf(numberString.charAt(0)));
                } else {
                    outputNumber += currentNumber + onMind;
                    onMind = 0;
                }

            } else {
                currentNumber = Integer.parseInt(String.valueOf(inputBigNumber.charAt(i))) * multiplier;

                String numberString = String.valueOf(currentNumber);
                if (currentNumber > 9) {
                    outputNumber += numberString.charAt(1);
                    onMind = Integer.parseInt(String.valueOf(numberString.charAt(0)));
                }
                if (currentNumber + onMind > 9) {
                    numberString = String.valueOf(currentNumber + onMind);
                    outputNumber += Integer.parseInt(String.valueOf(numberString.charAt(1)));
                    onMind = Integer.parseInt(String.valueOf(numberString.charAt(0)));
                } else {
                    outputNumber += currentNumber + onMind;
                    onMind = 0;
                }
            }
        }
        if (onMind > 0) {
            outputNumber += onMind;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(outputNumber);
        System.out.println(builder.reverse());
    }
}