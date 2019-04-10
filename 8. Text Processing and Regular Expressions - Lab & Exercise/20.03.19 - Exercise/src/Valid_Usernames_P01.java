import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_Usernames_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();
        String regex = "(^|(?<=\\s))(?<name>[A-Za-z0-9_-]{3,16})($|(?=,))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputText);

        StringBuilder output = new StringBuilder();
        while (matcher.find()) {
            output.append(matcher.group());
            output.append("\n");
        }
        System.out.println(output);
    }
}