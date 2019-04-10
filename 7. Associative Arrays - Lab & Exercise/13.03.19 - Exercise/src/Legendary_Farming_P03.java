import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Legendary_Farming_P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        Shadowmourne win 250 Shards
//        Valanyr win 250 Fragments
//        Dragonwrath win 250 Motes

        Map<String, Integer> materialsMap = new LinkedHashMap<>();

        while (true) {
            List<String> inputLine = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

            int counter = 0;
            for (int i = 0; i < inputLine.size() / 2; i++) {

                String key = inputLine.get(counter + 1).toLowerCase();
                int value = Integer.parseInt(inputLine.get(counter));

                if (!materialsMap.containsKey(key)) {
                    materialsMap.putIfAbsent(key, value);
                } else {
                    materialsMap.put(key, materialsMap.get(key) + value);
                }

                if (materialsMap.containsKey("shards")) {
                    if (materialsMap.get("shards") >= 250) {
                        break;
                    }
                }
                if (materialsMap.containsKey("fragments")) {
                    if (materialsMap.get("fragments") >= 250) {
                        break;
                    }
                }
                if (materialsMap.containsKey("motes")) {
                    if (materialsMap.get("motes") >= 250) {
                        break;
                    }
                }
                counter += 2;
            }
            if (materialsMap.containsKey("shards")) {
                if (materialsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materialsMap.put("shards", materialsMap.get("shards") - 250);
                    break;
                }
            }
            if (materialsMap.containsKey("fragments")) {
                if (materialsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materialsMap.put("fragments", materialsMap.get("fragments") - 250);
                    break;
                }
            }
            if (materialsMap.containsKey("motes")) {
                if (materialsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materialsMap.put("motes", materialsMap.get("motes") - 250);
                    break;
                }
            }
        }

        Map<String, Integer> descendingOrder = new LinkedHashMap<>();

        if (materialsMap.containsKey("shards")) {
            descendingOrder.put("shards", materialsMap.get("shards"));
            materialsMap.remove("shards");
        } else {
            descendingOrder.put("shards", 0);
        }
        if (materialsMap.containsKey("fragments")) {
            descendingOrder.put("fragments", materialsMap.get("fragments"));
            materialsMap.remove("fragments");
        } else {
            descendingOrder.put("fragments", 0);
        }
        if (materialsMap.containsKey("motes")) {
            descendingOrder.put("motes", materialsMap.get("motes"));
            materialsMap.remove("motes");
        } else {
            descendingOrder.put("motes", 0);
        }
        descendingOrder.entrySet().stream().sorted((v1, v2) -> {
            int sort = Integer.compare(v2.getValue(), v1.getValue());
            if (sort == 0) {
                sort = v1.getKey().compareTo(v2.getKey());
            }
            return sort;
        }).forEach(e -> System.out.println(String.format("%s: %d", e.getKey(), e.getValue())));

        materialsMap.entrySet().stream().sorted((k1, k2) -> k1.getKey().compareTo(k2.getKey())).collect(Collectors.
                toCollection(LinkedHashSet::new)).forEach(e -> System.out.println(String.format("%s: %d", e.getKey(), e.getValue())));

//        String output = "";
//        for (Map.Entry<String, Integer> material : descendingOrder.entrySet()) {
//            output += material.getKey() + ": " + material.getValue() + "\n";
//        }
//        for (Map.Entry<String, Integer> junk : materialsMap.entrySet()) {
//            output += junk.getKey() + ": " + junk.getValue() + "\n";
//        }
//        System.out.println(output);
    }
}