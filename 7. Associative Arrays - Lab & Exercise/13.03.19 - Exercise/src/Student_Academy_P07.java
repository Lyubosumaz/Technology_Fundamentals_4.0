import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student_Academy_P07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, ArrayList<Double>> studentsList = new LinkedHashMap<>();

        int num = Integer.parseInt(reader.readLine());

        int counter = 0;
        String key = "";
        for (int i = 0; i < num * 2; i++) {
            String input = reader.readLine();
            if (counter % 2 == 0) {
                key = input;
                if (!studentsList.containsKey(input)) {
                    studentsList.putIfAbsent(input, new ArrayList<>());
                }
            } else {
                double grade = Double.parseDouble(input);
                studentsList.get(key).add(grade);
            }
            counter++;
        }
        Map<String, Double> output = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Double>> element : studentsList.entrySet()) {

            ArrayList<Double> allGrades = element.getValue();
            double sum = 0;

            for (int i = 0; i < allGrades.size(); i++) {
                sum += allGrades.get(i);
            }
            sum /= allGrades.size();
            if (sum >= 4.50) {
                output.put(element.getKey(), sum);
            }
        }
        output.entrySet().stream().sorted((e1, e2) -> {
            int sort = Double.compare(e2.getValue(), e1.getValue());
            return sort;
        }).forEach(e -> System.out.println(String.format("%s -> %.2f", e.getKey(), e.getValue())));
    }
}