import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Train_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] currentPassengersArray = reader.readLine().split("\\s+");
        List<Integer> currentPassengersList = new ArrayList<>();
        for (int i = 0; i < currentPassengersArray.length; i++) {
            currentPassengersList.add(Integer.parseInt(currentPassengersArray[i]));
        }
        int maxCapacityPerWagon = Integer.parseInt(reader.readLine());
        String commands = "";
        while (!"END".equalsIgnoreCase(commands = reader.readLine())) {
            String[] keyCommand = commands.split("\\s+");
            switch (keyCommand[0]) {
                case "Add":
                    int passengersAddInEnd = Integer.parseInt(keyCommand[1]);
                    currentPassengersList.add(passengersAddInEnd);
                    break;
                default:
                    int boardingPassengers = Integer.parseInt(keyCommand[0]);
                    for (int i = 0; i < currentPassengersList.size(); i++) {
                        if (currentPassengersList.get(i) + boardingPassengers <= maxCapacityPerWagon) {
                            currentPassengersList.set(i, currentPassengersList.get(i) + boardingPassengers);
                            break;
                        }
                    }
                    break;
            }
        }
        String output = "";
        for (Integer passenger : currentPassengersList) {
            output += passenger + " ";
        }
        System.out.println(output.trim());
    }
}