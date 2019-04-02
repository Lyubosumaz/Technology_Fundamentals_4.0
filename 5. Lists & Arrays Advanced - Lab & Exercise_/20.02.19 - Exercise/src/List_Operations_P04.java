import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List_Operations_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String command = "";
        while (!"END".equalsIgnoreCase(command = scanner.nextLine())) {
            String[] keyCommands = command.split("\\s+");
            switch (keyCommands[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(keyCommands[1]);
                    inputNumbersList.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(keyCommands[1]);
                    int indexOfInsertion = Integer.parseInt(keyCommands[2]);
                    if (indexOfInsertion < 0 || indexOfInsertion > inputNumbersList.size() - 1) {
                        System.out.println("Invalid index");
                        break;
                    }
                    inputNumbersList.add(indexOfInsertion, numberToInsert);
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(keyCommands[1]);
                    if (removeIndex < 0 || removeIndex > inputNumbersList.size() - 1) {
                        System.out.println("Invalid index");
                        break;
                    }
                    inputNumbersList.remove(removeIndex);
                    break;
                case "Shift":
                    int countOfIndexes = Integer.parseInt(keyCommands[2]);
                    if (keyCommands[1].equalsIgnoreCase("left")) {
                        int negativeCountOfIndexes = countOfIndexes * -1;
                        Collections.rotate(inputNumbersList, negativeCountOfIndexes);
                    } else {
                        Collections.rotate(inputNumbersList, countOfIndexes);
                    }
                    break;
            }
        }
        System.out.println(inputNumbersList.toString().replaceAll("\\[|,|\\]", ""));
    }
}