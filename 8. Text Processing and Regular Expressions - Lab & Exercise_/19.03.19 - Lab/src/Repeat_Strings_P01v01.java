import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repeat_Strings_P01v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = reader.readLine().split("\\s+");

        String result = "";

        for (int i = 0; i < inputArray.length; i++) {
            String element = inputArray[i];
            int length = element.length();

            for (int j = 0; j < length; j++) {
                result += element;
            }
        }
        System.out.println(result);
    }
}