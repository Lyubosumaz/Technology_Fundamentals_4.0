import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match_Phone_Number_P07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String phonesNumbers = reader.readLine();
        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(phonesNumbers);

        ArrayList<String> phonebook = new ArrayList<>();

        while (phoneMatcher.find()) {
            phonebook.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", phonebook));
    }
}