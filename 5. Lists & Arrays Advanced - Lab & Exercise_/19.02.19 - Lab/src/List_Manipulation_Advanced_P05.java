import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class List_Manipulation_Advanced_P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String commandInput = "";
        while (!"end".equalsIgnoreCase(commandInput = scanner.nextLine())) {
            String[] keyCommands = commandInput.split("\\s+");

            switch (keyCommands[0]) {
                case "Contains":
                    int searchNumber = Integer.parseInt(keyCommands[1]);
                    if (inputList.contains(Integer.valueOf(searchNumber))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    int evenOrOdd = keyCommands[1].equals("even") ? 0 : 1;
                    List<Integer> evenOrOddList = new ArrayList<>();
                    for (int i = 0; i < inputList.size(); i++) {
                        if (inputList.get(i) % 2 == evenOrOdd) {
                            evenOrOddList.add(inputList.get(i));
                        }
                    }
                    System.out.println(evenOrOddList.toString().replaceAll("\\[|,|\\]", ""));
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < inputList.size(); i++) {
                        sum += inputList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int numberThatCut = Integer.parseInt(keyCommands[2]);
                    List<Integer> filterList = new ArrayList<>();
                    switch (keyCommands[1]) {
                        case ">":
                            for (int i = 0; i < inputList.size(); i++) {
                                if (inputList.get(i) > numberThatCut) {
                                    filterList.add(inputList.get(i));
                                }
                            }
                            System.out.println(filterList.toString().replaceAll("\\[|,|\\]", ""));
                            break;
                        case ">=":
                            for (int i = 0; i < inputList.size(); i++) {
                                if (inputList.get(i) >= numberThatCut) {
                                    filterList.add(inputList.get(i));
                                }
                            }
                            System.out.println(filterList.toString().replaceAll("\\[|,|\\]", ""));
                            break;
                        case "<":
                            for (int i = 0; i < inputList.size(); i++) {
                                if (inputList.get(i) < numberThatCut) {
                                    filterList.add(inputList.get(i));
                                }
                            }
                            System.out.println(filterList.toString().replaceAll("\\[|,|\\]", ""));
                            break;
                        case "<=":
                            for (int i = 0; i < inputList.size(); i++) {
                                if (inputList.get(i) <= numberThatCut) {
                                    filterList.add(inputList.get(i));
                                }
                            }
                            System.out.println(filterList.toString().replaceAll("\\[|,|\\]", ""));
                            break;
                    }
                    break;
            }
        }
    }
}