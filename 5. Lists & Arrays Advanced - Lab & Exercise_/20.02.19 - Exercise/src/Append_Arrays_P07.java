import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Append_Arrays_P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputData = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(inputData);
        String output = inputData.toString().replaceAll("[\\]\\[,]", "").trim();
        output = output.replaceAll("\\s+", " ");
        System.out.println(output);
    }
}