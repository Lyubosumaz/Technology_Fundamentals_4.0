import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Song_Encryption_P02v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^[A-Z][a-z\\'\\s]+\\:[A-Z\\s]+$");

        String inputLine = reader.readLine();

        while (!"end".equals(inputLine)) {
            Matcher inputLineMatcher = pattern.matcher(inputLine);

            if (inputLineMatcher.find()) {
                String artistName = inputLine.split("\\:")[0];
                int encryptionKey = artistName.length();

                String encryptedString = "";

                for (int i = 0; i < inputLine.length(); i++) {
                    char currentChar = inputLine.charAt(i);

                    if (currentChar != '\'' && currentChar != ' ' && currentChar != ':') {
                        int currentCharASCII = (int) currentChar;

                        if (currentCharASCII >= 65 && currentCharASCII <= 90) {
                            currentCharASCII += encryptionKey;

                            if (currentCharASCII > 90) {
                                currentCharASCII = (currentCharASCII % 90) + 64;
                            }
                        } else {
                            currentCharASCII += encryptionKey;

                            if (currentCharASCII > 122) {
                                currentCharASCII = (currentCharASCII % 122) + 96;
                            }
                        }
                        currentChar = (char) currentCharASCII;
                    }
                    encryptedString += currentChar;
                }

                System.out.println("Successful encryption: " + encryptedString.replace(":", "@"));
            } else {
                System.out.println("Invalid input!");
            }
            inputLine = reader.readLine();
        }
    }
}