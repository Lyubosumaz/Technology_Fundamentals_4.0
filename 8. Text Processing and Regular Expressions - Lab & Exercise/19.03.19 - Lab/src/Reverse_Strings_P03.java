import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_Strings_P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        while (!"end".equals(input = reader.readLine())) {

            String result = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                result += input.charAt(i);
            }
            System.out.println(String.format("%s = %s", input, result));
        }
    }
}