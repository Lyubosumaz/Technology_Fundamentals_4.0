import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Gauss_Trick_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        List<Integer> input = Arrays.stream(reader.readLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String[] input = reader.readLine().split("\\s+");
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbersList.add(Integer.parseInt(input[i]));
        }
        int listLength = numbersList.size();
        for (int i = 0; i < listLength / 2; i++) {
            numbersList.set(i, numbersList.get(i) + numbersList.get(numbersList.size() - 1));
            numbersList.remove(numbersList.size() - 1);
        }
        System.out.println(output(numbersList, " "));
    }

    static String output(List<Integer> numbers, String delimiter) {
        String output = "";
        for (int i = 0; i < numbers.size(); i++) {
            output += numbers.get(i) + delimiter;
        }
        return output;
    }
}