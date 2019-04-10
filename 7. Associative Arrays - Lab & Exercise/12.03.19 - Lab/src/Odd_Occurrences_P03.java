import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Odd_Occurrences_P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = reader.readLine().split("\\s+");

        Map<String, Integer> countsMap = new LinkedHashMap<>();

        for (String word : inputLine) {
            String inLowerCase = word.toLowerCase();
            if (countsMap.containsKey(inLowerCase)) {
                countsMap.put(inLowerCase, countsMap.get(inLowerCase) + 1);
            } else {
                countsMap.put(inLowerCase, 1);
            }
        }
        ArrayList<String> odd = new ArrayList<>();

        for (var entry : countsMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odd.add(entry.getKey());
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i));
            if (i < odd.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}