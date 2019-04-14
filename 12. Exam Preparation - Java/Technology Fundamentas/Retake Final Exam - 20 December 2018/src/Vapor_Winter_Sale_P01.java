import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Vapor_Winter_Sale_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> gameNameAndDLC = new LinkedHashMap<>();
        Map<String, Double> gameNameAndPrice = new LinkedHashMap<>();

        List<String> dlcList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        String[] inputArray = reader.readLine().split(",\\s+");

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].contains(":")) {
                dlcList.add(inputArray[i]);
            } else if (inputArray[i].contains("-")) {
                priceList.add(inputArray[i]);
            }
        }

        List<String> checkGame = new ArrayList<>();

        for (int i = 0; i < priceList.size(); i++) {
            String[] cutInfo = priceList.get(i).split("-");
            String gameName = cutInfo[0];
            double gamePrice = Double.parseDouble(cutInfo[1]);

            checkGame.add(gameName);

            if (!gameNameAndPrice.containsKey(gameName)) {
                gameNameAndPrice.putIfAbsent(gameName, gamePrice);
            }
        }

        for (int i = 0; i < dlcList.size(); i++) {
            String[] cutInfo = dlcList.get(i).split(":");
            String gameName = cutInfo[0];
            String gameDLC = cutInfo[1];

            if (gameNameAndPrice.containsKey(gameName)) {
                gameNameAndDLC.putIfAbsent(gameName, gameDLC);

                gameNameAndPrice.put(gameName, gameNameAndPrice.get(gameName) + (gameNameAndPrice.get(gameName) * 0.20));
            }
        }
        for (int i = 0; i < checkGame.size(); i++) {
            if (!gameNameAndDLC.containsKey(checkGame.get(i))) {
                gameNameAndPrice.put(checkGame.get(i), gameNameAndPrice.get(checkGame.get(i)) - (gameNameAndPrice.get(checkGame.get(i)) * 0.20));
            } else {
                gameNameAndPrice.put(checkGame.get(i), gameNameAndPrice.get(checkGame.get(i)) - (gameNameAndPrice.get(checkGame.get(i)) * 0.50));
            }
        }
        LinkedHashMap<String, Double> save = new LinkedHashMap<>();
        save = gameNameAndPrice.entrySet().stream().sorted((price1, price2) -> Double.compare(price1.getValue(), price2.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        List<String> checkDLC = new ArrayList<String>(save.keySet());

        String outputPatternDLC = "%s - %s - %.2f";
        for (int i = 0; i < save.size(); i++) {
            String current = checkDLC.get(i);

            if (save.containsKey(current) && gameNameAndDLC.containsKey(current)) {
                System.out.println(String.format(outputPatternDLC, current, gameNameAndDLC.get(current), save.get(current)));

                save.remove(current);
            }
        }
        save.entrySet().stream().sorted((price1, price2) -> Double.compare(price2.getValue(), price1.getValue())).
                forEach(e -> System.out.println(String.format("%s - %.2f", e.getKey(), e.getValue())));
    }
}