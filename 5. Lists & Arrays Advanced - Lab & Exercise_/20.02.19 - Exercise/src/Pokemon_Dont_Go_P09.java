import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon_Dont_Go_P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int sum = 0;
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index == 0 && numbers.size() == 1) {
                sum += numbers.get(0);
                numbers.remove(0);
                break;
            }
            if (index < 0) {
                int keyNumIndex = numbers.get(0);
                sum += keyNumIndex;

                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));

                for (int j = 0; j < numbers.size(); j++) {
                    if (keyNumIndex >= numbers.get(j)) {
                        numbers.set(j, numbers.get(j) + keyNumIndex);
                    } else {
                        numbers.set(j, numbers.get(j) - keyNumIndex);
                    }
                }

            }
            if (index >= numbers.size()) {
                int keyNumIndex = numbers.get(numbers.size() - 1);
                sum += keyNumIndex;

                numbers.remove(numbers.size() - 1);
                numbers.add(numbers.get(0));

                for (int j = 0; j < numbers.size(); j++) {
                    if (keyNumIndex >= numbers.get(j)) {
                        numbers.set(j, numbers.get(j) + keyNumIndex);
                    } else {
                        numbers.set(j, numbers.get(j) - keyNumIndex);
                    }
                }

            }
            if (index >= 0 && index < numbers.size()) {
                int keyNumIndex = numbers.get(index);
                sum += keyNumIndex;

                for (int j = 0; j < numbers.size(); j++) {
                    if (keyNumIndex >= numbers.get(j)) {
                        numbers.set(j, numbers.get(j) + keyNumIndex);
                    } else if (keyNumIndex < numbers.get(j)) {
                        numbers.set(j, numbers.get(j) - keyNumIndex);
                    }
                }
                numbers.remove(index);
            }
        }
        System.out.println(sum);
    }
}