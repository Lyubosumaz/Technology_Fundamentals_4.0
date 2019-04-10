import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Count_Chars_in_a_String_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = reader.readLine().split("\\s+");

        Map<Character, Integer> countCharacters = new LinkedHashMap<>();

        for (int i = 0; i < inputLine.length; i++) {
            String decomposeWord = inputLine[i];

            for (int j = 0; j < decomposeWord.length(); j++) {
                char characterizing = decomposeWord.charAt(j);

                if (!countCharacters.containsKey(characterizing)) {
                    countCharacters.putIfAbsent(characterizing, 0);
                }

                int oldValue = countCharacters.get(characterizing);
                countCharacters.put(characterizing, oldValue + 1);
            }
        }
        String pattern = "%c -> %d";
        for (Map.Entry<Character, Integer> element : countCharacters.entrySet()) {
            System.out.println(String.format(pattern, element.getKey(), element.getValue()));
        }
    }
}