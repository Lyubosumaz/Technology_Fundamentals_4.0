import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Largest_3_Numbers_P05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> sorted = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).
                sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toCollection(ArrayList::new));

        String output = "";
        if (sorted.size() <= 3) {
            for (var entry : sorted) {
                output += entry + " ";
            }
        } else {
            for (int i = 0; i < 3; i++) {
                output += sorted.get(i) + " ";
            }
        }
        System.out.println(output.trim());
    }
}