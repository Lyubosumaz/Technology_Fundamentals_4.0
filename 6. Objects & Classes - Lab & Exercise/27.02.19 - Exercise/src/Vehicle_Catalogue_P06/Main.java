package Vehicle_Catalogue_P06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<VehicleCatalogue> catalogue = new ArrayList<>();

        String readInputLine = reader.readLine();
        while (!"END".equalsIgnoreCase(readInputLine)) {
            String[] inputArray = readInputLine.split("\\s+");
            String type = inputArray[0];
            String model = inputArray[1];
            String color = inputArray[2];
            double horsepower = Double.parseDouble(inputArray[3]);
            VehicleCatalogue vehicle = new VehicleCatalogue(type, model, color, horsepower);

            catalogue.add(vehicle);
            readInputLine = reader.readLine();
        }
        String scanInputLine = reader.readLine();
        while (!"Close the Catalogue".equalsIgnoreCase(scanInputLine)) {
            String finalScanInputLine = scanInputLine;
            catalogue.stream().filter(e -> e.getModel().equalsIgnoreCase(finalScanInputLine)).forEach(x -> System.out.println(x));
            scanInputLine = reader.readLine();
        }
        System.out.println(String.format("Cars have average horsepower of: %.2f.", average(catalogue.stream().filter(c -> c.getType().equalsIgnoreCase("car")).collect(Collectors.toList()))));
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", average(catalogue.stream().filter(t -> t.getType().equalsIgnoreCase("truck")).collect(Collectors.toList()))));
    }

    public static double average(List<VehicleCatalogue> catalogue) {
        if (catalogue.size() == 0) {
            return 0.0;
        }

        double sum = 0;
        for (VehicleCatalogue vehicle : catalogue) {
            sum += vehicle.getHorsepower();
        }
        return sum / catalogue.size();
    }
}