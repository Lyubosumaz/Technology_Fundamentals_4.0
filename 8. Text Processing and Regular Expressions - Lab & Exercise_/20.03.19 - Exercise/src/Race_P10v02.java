import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Race_P10v02 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List works but Set has faster search
        Set<String> participants = Arrays.stream(reader.readLine().split(", ")).collect(Collectors.toSet());
        Map<String, Integer> winners = new LinkedHashMap<>();

        String input = "";
        while (!"end of race".equals(input = reader.readLine())) {
            String name = "";
            int distance = 0;
            for (char ch : input.toCharArray()) {
                if (Character.isLetter(ch)) {
                    name += ch;
                } else if (Character.isDigit(ch)) {
                    distance += ch - '0';
                }
            }

            if (participants.contains(name)) {
                winners.putIfAbsent(name, 0);
                winners.put(name, winners.get(name) + distance);
            }
        }

        List<String> sortedNames = winners.keySet().stream()
                .sorted(Comparator.comparing(winners::get, Comparator.reverseOrder())).collect(Collectors.toList());

        System.out.println("1st place: " + sortedNames.get(0));
        System.out.println("2nd place: " + sortedNames.get(1));
        System.out.println("3rd place: " + sortedNames.get(2));
    }
}