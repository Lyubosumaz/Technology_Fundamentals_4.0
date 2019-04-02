import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_Strings_P03v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();

        while (!"end".equals(inputText)) {

            StringBuilder builder = new StringBuilder();
            builder.append(inputText);

            String pattern = "%s = %s";
            System.out.println(String.format(pattern, inputText, builder.reverse()));

            inputText = reader.readLine();
        }
    }
}