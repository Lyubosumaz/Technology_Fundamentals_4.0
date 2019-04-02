import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Star_Enigma_P12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        Pattern pattern = Pattern.compile("[star]", Pattern.CASE_INSENSITIVE);

        while (n-- > 0) {
            String encrypted = reader.readLine();

            Matcher matcher = pattern.matcher(encrypted);

            int count = 0;
            while (matcher.find()) {
                count++;
            }
            String decrypt = "";
            for (int i = 0; i < encrypted.length(); i++) {
                decrypt += String.valueOf(Character.toChars(encrypted.charAt(i) - count));
            }
            Pattern patternPlanets = Pattern.compile("@([A-Za-z]+)(?:[^@!\\-:>]*):(\\d+)(?:[^@!\\-:>]*)!([AD])!(?:[^@!\\-:>]*)(?:[^@!\\-:>]*)->(\\d+)");
            Matcher matcherPlanets = patternPlanets.matcher(decrypt);

            while (matcherPlanets.find()) {
                String planetName = matcherPlanets.group(1);
                String attackType = matcherPlanets.group(3);

                if (attackType.equals("A")) {
                    attacked.add(planetName);
                } else {
                    destroyed.add(planetName);
                }
            }
        }
        System.out.println(String.format("Attacked planets: %d", attacked.size()));
        attacked.stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(e -> System.out.println(String.format("-> %s", e)));

        System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
        destroyed.stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(e -> System.out.println(String.format("-> %s", e)));
    }
}