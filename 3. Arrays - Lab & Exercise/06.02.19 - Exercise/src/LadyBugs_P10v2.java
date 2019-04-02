import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LadyBugs_P10v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int fieldSize = Integer.parseInt(reader.readLine());

        int[] ladybugs = new int[fieldSize];

        int[] ladybugIndex = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).filter(e -> e >= 0 && e < fieldSize).toArray();

        for (int i = 0; i < ladybugIndex.length; i++) {
            ladybugs[ladybugIndex[i]] = 1;
        }

        String input = "";

        while (!"end".equalsIgnoreCase(input = reader.readLine())) {
            String[] data = input.split("\\s+");

            int index = Integer.parseInt(data[0]);
            String direction = data[1];
            int length = Integer.parseInt(data[2]);

            if (index >= 0 && index < ladybugs.length && ladybugs[index] == 1) {
                ladybugs[index] = 0;

                while (true) {
                    switch (direction) {
                        case "left":
                            index -= length;
                            break;
                        case "right":
                            index += length;
                            break;
                    }
                    if (index < 0 || index >= fieldSize) {
                        break;
                    }
                    if (ladybugs[index] == 1) {
                        continue;
                    }
                    if (ladybugs[index] == 0) {
                        ladybugs[index] = 1;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.stream(ladybugs).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}