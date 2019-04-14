import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Concert_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> bandAndMembersMap = new LinkedHashMap<>();
        Map<String, Integer> bandAndTimeMap = new LinkedHashMap<>();

        int totalTime = 0;

        String command = "";
        while (!"start of concert".equals(command = reader.readLine())) {
            String[] bandAndMembersInput = command.split("[;,]");

            String keyCommand = bandAndMembersInput[0].trim();
            String band = bandAndMembersInput[1].trim();

            switch (keyCommand) {
                case "Add":
                    if (!bandAndMembersMap.containsKey(band)) {
                        bandAndMembersMap.putIfAbsent(band, new ArrayList<>());
                    }
                    for (int i = 2; i < bandAndMembersInput.length; i++) {
                        if (!(bandAndMembersMap.get(band).contains(bandAndMembersInput[i]))) {
                            bandAndMembersMap.get(band).add(bandAndMembersInput[i]);
                        }
                    }
                    break;
                case "Play":
                    int bandPlayTime = Integer.parseInt(bandAndMembersInput[2].trim());

                    totalTime += bandPlayTime;

                    if (!bandAndTimeMap.containsKey(band)) {
                        bandAndTimeMap.putIfAbsent(band, bandPlayTime);
                    } else {
                        bandAndTimeMap.put(band, bandAndTimeMap.get(band) + bandPlayTime);
                    }
                    break;
            }
        }
        System.out.println(String.format("Total time: %d", totalTime));
        bandAndTimeMap.entrySet().stream().sorted((band1, band2) -> {
            int sort = Integer.compare(band2.getValue(), band1.getValue());
            if (sort == 0) {
                return band1.getKey().compareTo(band2.getKey());
            }
            return sort;
        }).forEach(kvp -> System.out.println(String.format("%s -> %d", kvp.getKey(), kvp.getValue())));

        String outputBrand = reader.readLine();
        System.out.println(outputBrand);

        for (String name : bandAndMembersMap.get(outputBrand)) {
            System.out.println(String.format("=>%s", name));
        }
    }
}