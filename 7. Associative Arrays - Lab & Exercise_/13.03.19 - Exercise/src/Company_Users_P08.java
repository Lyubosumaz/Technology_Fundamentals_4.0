import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Company_Users_P08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, ArrayList<String>> employeeList = new TreeMap<>();

        String input = "";
        while (!"End".equalsIgnoreCase(input = reader.readLine())) {
            ArrayList<String> inputLine = Arrays.stream(input.split("\\s+->\\s+")).
                    collect(Collectors.toCollection(ArrayList::new));

            String companyName = inputLine.get(0);
            String employeeId = inputLine.get(1);
            if (!employeeList.containsKey(companyName)) {
                employeeList.putIfAbsent(companyName, new ArrayList<>());
            }
            if (!employeeList.get(companyName).contains(employeeId)) {
                employeeList.get(companyName).add(employeeId);
            }
        }
        for (Map.Entry<String, ArrayList<String>> element : employeeList.entrySet()) {
            System.out.println(element.getKey());
            for (int i = 0; i < element.getValue().size(); i++) {
                System.out.println(String.format("-- %s", element.getValue().get(i)));
            }
        }
    }
}