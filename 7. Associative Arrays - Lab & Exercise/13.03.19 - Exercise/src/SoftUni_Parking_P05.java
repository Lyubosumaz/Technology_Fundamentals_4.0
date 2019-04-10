import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SoftUni_Parking_P05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> parkingLotList = new LinkedHashMap<>();

        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num; i++) {
            ArrayList<String> inputLine = Arrays.stream(reader.readLine().split("\\s+")).
                    collect(Collectors.toCollection(ArrayList::new));

            String command = inputLine.get(0);

            switch (command) {
                case "register":
                    String name = inputLine.get(1);
                    String plate = inputLine.get(2);

                    if (parkingLotList.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s\n", parkingLotList.get(name));
                        break;
                    }

                    parkingLotList.putIfAbsent(name, plate);
                    System.out.printf("%s registered %s successfully\n", name, plate);
                    break;
                case "unregister":
                    String removeName = inputLine.get(1);

                    if (!parkingLotList.containsKey(removeName)) {
                        System.out.printf("ERROR: user %s not found\n", removeName);
                        break;
                    }

                    parkingLotList.remove(removeName);
                    System.out.printf("%s unregistered successfully\n", removeName);
                    break;
            }
        }
        String pattern = "%s => %s";
        for (Map.Entry<String, String> parkingValidation : parkingLotList.entrySet()) {
            System.out.println(String.format(pattern, parkingValidation.getKey(), parkingValidation.getValue()));
        }
    }
}