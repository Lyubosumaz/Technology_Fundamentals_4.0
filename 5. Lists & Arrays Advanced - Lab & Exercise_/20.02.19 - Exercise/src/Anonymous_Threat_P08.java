import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anonymous_Threat_P08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> elements = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

        String input = "";
        while (!"3:1".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");

            String command = data[0];

            switch (command) {
                case "merge":
                    int firstIndex = Integer.parseInt(data[1]);
                    int secondIndex = Integer.parseInt(data[2]);
                    firstIndex = validateIndex(firstIndex, elements.size());
                    secondIndex = validateIndex(secondIndex, elements.size());

                    String concatElements = String.join("", elements.subList(firstIndex, secondIndex + 1));
//                            .stream().filter(e -> !e.equals("")).collect(Collectors.joining("")));
                    elements.subList(firstIndex, secondIndex + 1).clear();
                    elements.add(firstIndex, concatElements);
                    break;
                case "divide":
                    int index = Integer.parseInt(data[1]);
                    int partitions = Integer.parseInt(data[2]);

                    List<String> result = dividedEqually(elements.get(index), partitions);
                    elements.remove(index);
                    elements.addAll(index, result);
                    break;
            }
        }
        System.out.println(String.join(" ", elements));
    }

    private static List<String> dividedEqually(String element, int partitions) {
        int part = element.length() / partitions;
        ArrayList<String> result = new ArrayList<>();
        while (element.length() >= part) {
            result.add(element.substring(0, part));
            element = element.substring(part);
        }
        if (!element.equals("")){
            result.add(element);
        }
        if (result.size() == partitions) {
            return result;
        } else {
            String concatLastTwoElements = result.get(result.size() - 2).concat(result.get(result.size() - 1));
            result.subList(result.size() - 2, result.size()).clear();
            result.add(concatLastTwoElements);
            return result;
        }
    }

    private static int validateIndex(int index, int length) {
        if (index < 0) {
            index = 0;
        }
        if (index > length - 1) {
            index = length - 1;
        }
        return index;
    }
}
