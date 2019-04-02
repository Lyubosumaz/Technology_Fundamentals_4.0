import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Race_P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> participantsArray = Arrays.stream(reader.readLine().split(", ")).collect(Collectors.toCollection(ArrayList::new));
        LinkedHashMap<String, Integer> winners = new LinkedHashMap<>();

        String input = "";
        while (!"end of race".equals(input = reader.readLine())) {

            String name = "";
            int distance = 0;

            for (int i = 0; i < input.length(); i++) {
                char test = input.charAt(i);
                if (Character.isLetter(test)) {
                    name += test;
                } else if (Character.isDigit(test)) {
                    distance += Integer.parseInt(Character.toString(test));
                }
            }
            if (participantsArray.contains(name)) {
                if (!winners.containsKey(name)) {
                    winners.putIfAbsent(name, distance);
                } else {
                    winners.put(name, winners.get(name) + distance);
                }
            }
        }
        LinkedHashMap<String, Integer> save = new LinkedHashMap<>();

//        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//        .sorted((v1, v2) -> v2.getValue().compareTo(v1.getValue()))

        save = winners.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        for (int i = 0; i < 3; i++) {
            Map.Entry<String, Integer> output = save.entrySet().iterator().next();
            String key = output.getKey();
            if (i == 0) {
                System.out.println(String.format("1st place: %s", key));
                save.remove(key);
            } else if (i == 1) {
                System.out.println(String.format("2nd place: %s", key));
                save.remove(key);
            } else {
                System.out.println(String.format("3rd place: %s", key));
            }
        }
    }
}