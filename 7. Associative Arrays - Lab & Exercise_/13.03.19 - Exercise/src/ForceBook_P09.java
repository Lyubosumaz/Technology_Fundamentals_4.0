import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class ForceBook_P09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, TreeSet<String>> forceBook = new LinkedHashMap<>();

        String input = "";

        while (!"Lumpawaroo".equalsIgnoreCase(input = reader.readLine())) {

            String[] data = Arrays.stream(input.split("\\s+\\|\\s+|\\s+->\\s+")).toArray(String[]::new);

            if (input.contains("|")) {
                String forceSide = data[0];
                String forceUser = data[1];

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.putIfAbsent(forceSide, new TreeSet<>());
                }
//                final boolean[] found = {false};
//                forceBook.forEach((kay, value) -> {
//                    if (value.contains(forceSide)) {
//                        found[0] = true;
//                        return;
//                    }
//                });
//                if (!found[0]) {
//                    forceBook.get(forceSide).add(forceUser);
//                }

                if (forceBook.entrySet().stream().noneMatch(e -> e.getValue().contains(forceUser))) {
                    forceBook.get(forceSide).add(forceUser);
                }
//                boolean found = false;
//                for (Map.Entry<String, TreeSet<String>> kvp : forceBook.entrySet()) {
//                    if (kvp.getValue().contains(forceUser)) {
//                        found = true;
//                        break;
//                    }
//                }
//                if (!found) {
//                    forceBook.get(forceSide).add(forceUser);
//                }

            } else {
                String forceSide = data[1];
                String forceUser = data[0];

                forceBook.forEach((key, value) -> {
                    value.remove(forceUser);
                });
                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }

                forceBook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!\n", forceUser, forceSide);
            }
        }
        forceBook.entrySet().stream().filter(e -> e.getValue().size() > 0).sorted((e1, e2) -> {
            int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());
            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(kvp -> {
            System.out.println(String.format("Side: %s, Members: %d", kvp.getKey(), kvp.getValue().size()));
            kvp.getValue().forEach(u -> {
                System.out.println(String.format("! %s", u));
            });
        });
    }
}