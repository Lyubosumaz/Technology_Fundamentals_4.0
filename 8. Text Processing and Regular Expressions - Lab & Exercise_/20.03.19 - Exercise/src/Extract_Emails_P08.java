import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract_Emails_P08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        String regex = "(^|\\s)[A-Za-z][\\w.-]*@[A-Za-z-]+(\\.[A-Za-z]+)+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String output = "";
        while (matcher.find()) {
            output += matcher.group() + "\n";
        }
        System.out.println(output);
    }
}