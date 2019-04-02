import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_P09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex = "^>{2}(?<name>[A-Z{0,}a-z]+)+<{2}(?<price>\\d+\\.?\\d+)+!(?<quantity>[\\d+]+)\\b";
        Pattern pattern = Pattern.compile(regex);

        double sum = 0;
        String input = "";

        System.out.println("Bought furniture:");

        while (!"Purchase".equals(input = reader.readLine())) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                System.out.println(name);
                sum += price * quantity;
            }
        }
        System.out.println(String.format("Total money spend: %.2f", sum));
    }
}