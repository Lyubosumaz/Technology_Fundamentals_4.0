package Randomize_Words_P01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> inputArrayList = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        Random random = new Random();
        while (!inputArrayList.isEmpty()) {
            int randomIndex = random.nextInt(inputArrayList.size());

            String output = inputArrayList.get(randomIndex);
            System.out.println(output);
            inputArrayList.remove(output);
        }

    }
}