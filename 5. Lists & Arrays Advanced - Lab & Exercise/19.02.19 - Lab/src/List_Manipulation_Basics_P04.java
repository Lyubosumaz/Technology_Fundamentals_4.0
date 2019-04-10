import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class List_Manipulation_Basics_P04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> inputList = Arrays.stream(reader.readLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        String commandsInput = "";
        while (!"end".equalsIgnoreCase(commandsInput = reader.readLine())) {

            String[] keyCommands = commandsInput.split("\\s+");

            switch (keyCommands[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(keyCommands[1]);
                    inputList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(keyCommands[1]);
                    inputList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(keyCommands[1]);
                    inputList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(keyCommands[1]);
                    int indexToInsert = Integer.parseInt(keyCommands[2]);
                    inputList.add(indexToInsert, numberToInsert);
                    break;
            }
        }
        System.out.println(inputList.toString().replaceAll("\\[|,|\\]", ""));
    }
}