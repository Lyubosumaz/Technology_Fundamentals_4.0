import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Count_Real_Numbers_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] inputArray = Arrays.stream(reader.readLine().split("\\s+")).mapToDouble(e -> Double.parseDouble(e)).toArray();

        Map<Double, Integer> countsMap = new TreeMap<>();

        for (double num : inputArray) {
            if (!countsMap.containsKey(num)) {
                countsMap.putIfAbsent(num, 0);
            }
            int oldValue = countsMap.get(num);
            countsMap.put(num, oldValue + 1);
        }
        String pattern = "%.0f -> %d";
        for (Map.Entry<Double, Integer> keyValuePattern : countsMap.entrySet()) {
            System.out.println(String.format(pattern, keyValuePattern.getKey(), keyValuePattern.getValue()));
        }
    }
}