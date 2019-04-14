import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Song_Encryption_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^[A-Z][a-z'\\s]+:[A-Z\\s]+$");

        String command = "";
        while (!"end".equals(command = reader.readLine())) {

            String output = "";

            String[] splitTheInput = command.split(":");
            int key = splitTheInput[0].length();

            Matcher matcher = pattern.matcher(command);

            if (matcher.matches()) {
                for (int i = 0; i < command.length(); i++) {

                    char letter = command.charAt(i);
                    int newKey = key;

                    if (letter != ' ' && letter != '\'' && letter != ':') {
                        if (letter + key > 'z' && Character.isLowerCase(letter)) {
                            newKey = (letter + key) - 'z';
                            letter = 96;

                            output += (char) (letter + newKey);
                        } else if (letter + key > 'Z' && Character.isUpperCase(letter)) {
                            newKey = letter + key - 'Z';
                            letter = 64;

                            output += (char) (letter + newKey);
                        } else {
                            output += (char) (letter + key);
                        }
                    } else if (letter == ' ') {
                        output += (char) ' ';
                    } else if (letter == '\'') {
                        output += (char) '\'';
                    } else {
                        output += (char) '@';
                    }
                }
            } else {
                System.out.println("Invalid input!");
            }
            if (matcher.matches()) {
                System.out.println("Successful encryption: " + output);
            }
        }
    }
}