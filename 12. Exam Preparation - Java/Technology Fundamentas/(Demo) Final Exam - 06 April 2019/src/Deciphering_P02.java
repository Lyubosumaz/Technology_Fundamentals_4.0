import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputLine = reader.readLine();

        Pattern pattern = Pattern.compile("^[d-z\\{\\|\\}\\#]+$");
        Matcher matcher = pattern.matcher(inputLine);

        String outputLine = "";
        if (matcher.matches()) {
            for (int i = 0; i < inputLine.length(); i++) {
                char currentChar = (char) (inputLine.charAt(i));

                outputLine += (char) ((int) currentChar - 3);
            }
        } else {
            System.out.println("This is not the book you are looking for.");
        }
        String[] replaceArray = reader.readLine().split("\\s+");
        String findThis = replaceArray[0];
        String putThis = replaceArray[1];

        System.out.println(outputLine.replaceAll(findThis, putThis));
    }
}