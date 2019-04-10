import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Letters_Change_Numbers_P14 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = reader.readLine().split("\\s+");
        Pattern pattern = Pattern.compile("(?<before>[A-Za-z])(?<number>\\d+)(?<after>[A-Za-z])");

        String alphabet = " abcdefghijklmnopqrstuvwxyz";
        double sum = 0.0;

        for (int i = 0; i < inputArray.length; i++) {

            Matcher matcher = pattern.matcher(inputArray[i]);

            if (matcher.find()) {
                String letterBefore = (matcher.group("before"));
                int number = Integer.parseInt(matcher.group("number"));
                String letterAfter = matcher.group("after");

                double letterBeforeValue = 0;
                if (alphabet.contains(letterBefore.toLowerCase())) {
                    letterBeforeValue = alphabet.indexOf(letterBefore.toLowerCase());
                }
                double letterAfterValue = 0;
                if (alphabet.contains(letterAfter.toLowerCase())) {
                    letterAfterValue = alphabet.indexOf(letterAfter.toLowerCase());
                }
                double sumOne = 0.0;

                char start = letterBefore.charAt(0);
                if (Character.isUpperCase(start)) {
                    sumOne += number / letterBeforeValue;
                } else {
                    sumOne += number * letterBeforeValue;
                }
                double sumTwo = 0.0;

                char end = letterAfter.charAt(0);
                if (Character.isUpperCase(end)) {
                    sumTwo += sumOne - letterAfterValue;
                } else {
                    sumTwo += sumOne + letterAfterValue;
                }
                sum += sumTwo;
            }
        }
        System.out.println(String.format("%.2f", sum));
    }
}