import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Word_Synonyms_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        Map<String, List<String>> synonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String key = reader.readLine();
            String value = reader.readLine();

            synonymsMap.putIfAbsent(key, new ArrayList<>());
            synonymsMap.get(key).add(value);
        }
        String pattern = "%s - %s";
        for (Map.Entry<String, List<String>> listEntry : synonymsMap.entrySet()) {

            String key = listEntry.getKey();

            String value = String.join(", ", listEntry.getValue());

            System.out.println(String.format(pattern, key, value));
        }
    }
}