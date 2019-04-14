import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dictionary_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> dictionaryMap = new LinkedHashMap<>();

        String[] inputArrayLines = reader.readLine().split("\\s+\\|\\s+");

        for (int i = 0; i < inputArrayLines.length; i++) {
            String[] data = inputArrayLines[i].split("\\:\\s+");
            String word = data[0];
            String definition = data[1];

            if (!dictionaryMap.containsKey(word)) {
                dictionaryMap.putIfAbsent(word, new ArrayList<>());
            }
            dictionaryMap.get(word).add(definition);
        }
        Map<String, List<String>> outputMap = new LinkedHashMap<>();

        String[] secondInputArray = reader.readLine().split("\\s+\\|\\s+");
        for (int i = 0; i < secondInputArray.length; i++) {
            if (dictionaryMap.containsKey(secondInputArray[i])) {
                if (!outputMap.containsKey(secondInputArray[i])) {
                    outputMap.putIfAbsent(secondInputArray[i], new ArrayList<>());
                }
                outputMap.get(secondInputArray[i]).addAll(dictionaryMap.get(secondInputArray[i]));
            }
        }
        String endCommand = reader.readLine();
        switch (endCommand) {
            case "List":
                dictionaryMap.entrySet().stream().sorted((k1, k2) -> k1.getKey().compareTo(k2.getKey())).
                        forEach(key -> System.out.printf("%s ", key.getKey()));
                break;
            case "End":
                outputMap.entrySet().stream().sorted((v1, v2) -> {
                    int sort = Integer.compare(v2.getValue().size(), v1.getValue().size());
                    return sort;
                }).sorted((k1, k2) -> {
                    int sort = Integer.compare(k1.getKey().length(), k2.getKey().length());
                    return sort;
                }).forEach(kvp -> {
                    System.out.println(kvp.getKey());
                    kvp.getValue().stream().sorted((v1, v2) -> {
                        int sort = Integer.compare(v2.length(), v1.length());
                        return sort;
                    }).forEach(e -> System.out.println(" -" + e));
//                    for (int i = 0; i < kvp.getValue().size(); i++) {
//                        System.out.println(" -" + kvp.getValue().get(i));
//                    }
                });
                break;
        }
    }
}