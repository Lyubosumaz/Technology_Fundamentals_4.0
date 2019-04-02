import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Explosion_P07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();
        String output = "";

        int strength = 0;
        for (int i = 0; i < inputText.length(); i++) {

            output += inputText.charAt(i);

            if (inputText.charAt(i) == '>') {

                strength += Integer.parseInt(String.valueOf(inputText.charAt(i + 1)));
            }

            while (strength > 0) {
                strength--;
                i++;
                if (i + 1 == inputText.length() || inputText.charAt(i + 1) == '>') {
                    break;
                }
            }
        }
        System.out.println(output);
    }
}