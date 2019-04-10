import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum_Adjacent_Equal_Numbers_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//  <Short List Input>
//        List<Double> numbers = Arrays.stream(reader.readLine().split("\\s+")).map(e -> Double.parseDouble(e)).collect(Collectors.toList());

//  <Array>
//        String[] input = reader.readLine().split("\\s+");
//        double[] resultArray = new double[input.length];
//        for (int i = 0; i < input.length; i++) {
//            resultArray[i] = Double.parseDouble(input[i]);
//        }

//  <List True Way>
        String[] input = reader.readLine().split("\\s+");
        List<Double> inputList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            inputList.add(Double.parseDouble(input[i]));
        }
        for (int i = 0; i < inputList.size() - 1; i++) {
            if (inputList.get(i).equals(inputList.get(i + 1))) {
                inputList.set(i, (inputList.get(i) + inputList.get(i + 1)));
                inputList.remove(i + 1);
                i = -1;
            }
        }
        String output = joinElementsByDelimiter(inputList, " ");
        System.out.println(output);

    }

    static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        DecimalFormat format = new DecimalFormat("0.#");

        for (Double item : items) {
            output += format.format(item) + delimiter;
        }
        return output;
    }
}
