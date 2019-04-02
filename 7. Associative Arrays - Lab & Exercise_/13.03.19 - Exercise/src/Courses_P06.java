import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Courses_P06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, TreeSet<String>> courseList = new LinkedHashMap<>();

        String command = "";

        while (!"end".equalsIgnoreCase(command = reader.readLine())) {
            ArrayList<String> inputLine = Arrays.stream(command.split(" : ")).
                    collect(Collectors.toCollection(ArrayList::new));

            String course = inputLine.get(0);
            String student = inputLine.get(1);
            if (!courseList.containsKey(course)) {
                courseList.putIfAbsent(course, new TreeSet<>());
            }
            courseList.get(course).add(student);
        }
        Map<String, TreeSet<String>> order = new LinkedHashMap<>();

//            for (Map.Entry<String, ArrayList<String>> element : courseList.entrySet()) {
//        }

        courseList.entrySet().stream().sorted((c1, c2) -> {
            int sort = Integer.compare(c2.getValue().size(), c1.getValue().size());
            return sort;
        }).forEach(kvp -> {
            System.out.println(String.format("%s: %d", kvp.getKey(), kvp.getValue().size()));
            kvp.getValue().forEach(name -> {
                System.out.println(String.format("-- %s", name));

            });
        });

    }
}