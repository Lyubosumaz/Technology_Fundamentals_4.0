import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Orders_P04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, ArrayList<String>> productInformation = new LinkedHashMap<>();

        String inputLine = "";

        while (!"buy".equalsIgnoreCase(inputLine = reader.readLine())) {
            ArrayList<String> inputList = Arrays.stream(inputLine.split("\\s+")).
                    collect(Collectors.toCollection(ArrayList::new));

            String key = inputList.get(0);

            if (!productInformation.containsKey(key)) {
                productInformation.putIfAbsent(key, new ArrayList<>());
                productInformation.get(key).add(inputList.get(1));
                productInformation.get(key).add(inputList.get(2));
            } else {
                ArrayList<String> magic = productInformation.get(key);
                magic.set(0, inputList.get(1));
                magic.set(1, String.valueOf(Integer.parseInt(magic.get(1)) + Integer.parseInt(inputList.get(2))));
                productInformation.put(key, magic);
            }
        }
//        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(k,v)->{throw new AssertionError();},LinkedHashMap::new));

        String pattern = "%s -> %.2f";
        for (Map.Entry<String, ArrayList<String>> element : productInformation.entrySet()) {

//            ArrayList<String> performsArrayList = new ArrayList<>();
//
//            performsArrayList = element.getValue();
//
//            double price = Double.parseDouble(performsArrayList.get(0));
//            int quantity = Integer.parseInt(performsArrayList.get(1));

            double price = Double.parseDouble(productInformation.get(element.getKey()).get(0));
            int quantity = Integer.parseInt(productInformation.get(element.getKey()).get(1));

//            double price = Double.parseDouble(element.getValue().get(0));
//            int quantity = Integer.parseInt(element.getValue().get(1));

            double totalPrice = price * quantity;
            System.out.println(String.format(pattern, element.getKey(), totalPrice));
        }
    }
}