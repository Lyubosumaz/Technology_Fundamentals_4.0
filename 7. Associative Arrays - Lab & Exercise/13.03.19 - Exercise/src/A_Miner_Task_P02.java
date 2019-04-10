import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class A_Miner_Task_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> resourceList = new LinkedHashMap<>();

        String inputLine = "";

        int counter = 0;
        String placeholder = "";
        while (!"stop".equalsIgnoreCase(inputLine = reader.readLine())) {
            if (counter % 2 == 0) {
                placeholder = inputLine;
                resourceList.putIfAbsent(placeholder, 0);
            } else {
                int value = Integer.parseInt(inputLine);
                int oldValue = resourceList.get(placeholder);
                resourceList.put(placeholder, oldValue + value);
            }
            counter++;
        }
        String pattern = "%s -> %d";
        for (Map.Entry<String, Integer> element : resourceList.entrySet()) {
            System.out.println(String.format(pattern, element.getKey(), element.getValue()));
        }
    }
}