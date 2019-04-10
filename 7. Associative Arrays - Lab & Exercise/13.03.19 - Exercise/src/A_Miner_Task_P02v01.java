import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class A_Miner_Task_P02v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equalsIgnoreCase(input = reader.readLine())) {
            String resource = input;
            int quantity = Integer.parseInt(reader.readLine());

            if (!resources.containsKey(resource)) {
                resources.putIfAbsent(resource, quantity);
            } else {
                resources.put(resource, resources.get(resource) + quantity);
            }
        }
        resources.entrySet().forEach(e -> {
            System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
        });
    }
}