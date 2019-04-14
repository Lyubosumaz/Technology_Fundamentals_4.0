import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Concert_P01v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> bandWithMembers = new LinkedHashMap<>();
        Map<String, Long> bandWithPlayedTime = new LinkedHashMap<>();

        long totalTime = 0;

        String inputLine = reader.readLine();

        while (!inputLine.equals("start of concert")) {
            String[] inputParameters = inputLine.split("\\;\\s+");

            String command = inputParameters[0];
            String bandName = inputParameters[1];

            if (command.equals("Add")) {
                if (!bandWithMembers.containsKey(bandName)) {
                    bandWithMembers.put(bandName, new ArrayList<>());
                }
                String[] bandMembers = inputParameters[2].split("\\,\\s+");

                for (int i = 0; i < bandMembers.length; i++) {
                    if (!bandWithMembers.get(bandName).contains(bandMembers[i])) {
                        bandWithMembers.get(bandName).add(bandMembers[i]);
                    }
                }
            } else if (command.equals("Play")) {
                if (!bandWithPlayedTime.containsKey(bandName)) {
                    bandWithPlayedTime.put(bandName, 0L);
                }
                int playedTime = Integer.parseInt(inputParameters[2]);
                totalTime += playedTime;
                long oldPlayedTime = bandWithPlayedTime.get(bandName);
                bandWithPlayedTime.put(bandName, oldPlayedTime + playedTime);
            }
            inputLine = reader.readLine();
        }
        System.out.println(String.format("Total time: %d", totalTime));
        bandWithPlayedTime.entrySet().stream().sorted((e1, e2) -> {
            if (e2.getValue() > e1.getValue()) {
                return 1;
            } else if (e2.getValue() < e1.getValue()) {
                return -1;
            } else {
                return e1.getKey().compareTo(e2.getKey());
            }
        }).forEach(band -> System.out.println(String.format("%s -> %d", band.getKey(), band.getValue())));

        String requestedBand = reader.readLine();
        System.out.println(requestedBand);

        bandWithMembers.get(requestedBand).forEach(member -> System.out.println("=> " + member));
    }
}