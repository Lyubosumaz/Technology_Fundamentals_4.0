import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nether_Realms_P13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, List<Double>> nameHealthDamage = new TreeMap<>();

        String[] inputArray = reader.readLine().split("[,\\s]+");

        for (int i = 0; i < inputArray.length; i++) {
            String demon = inputArray[i].trim();
            Pattern pattern = Pattern.compile("(?<number>[-+]?\\d*\\.?\\d+)");

            double allHealth = 0;
            double allPower = 0.0;
            int countMultiplying = 0;
            int countDividing = 0;

            for (int j = 0; j < demon.length(); j++) {
                char demonValue = demon.charAt(j);
                if (Character.isLetter(demonValue)) {
                    allHealth += demonValue;
                } else if (demonValue == '*') {
                    countMultiplying += 2;
                } else if (demonValue == '/') {
                    countDividing += 2;
                }
            }
            Matcher matcher = pattern.matcher(demon);
            while (matcher.find()) {
                allPower += Double.parseDouble(matcher.group("number"));
            }
            if (countMultiplying != 0) {
                allPower *= countMultiplying;
            }
            if (countDividing != 0) {
                allPower /= countDividing;
            }

            if (!nameHealthDamage.containsKey(demon)) {
                nameHealthDamage.putIfAbsent(demon, new ArrayList<>());
            }
            nameHealthDamage.get(demon).add(allHealth);
            nameHealthDamage.get(demon).add(allPower);
        }
        String pattern = "%s - %.0f health, %.2f damage";
        nameHealthDamage.forEach((key, doubles) -> System.out.println(String.format(pattern, key, doubles.get(0), doubles.get(1))));
    }
}