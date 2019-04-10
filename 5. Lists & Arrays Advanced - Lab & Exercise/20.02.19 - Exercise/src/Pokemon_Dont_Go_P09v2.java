import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pokemon_Dont_Go_P09v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> elements = Arrays.stream(reader.readLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int sum = 0;
        while (elements.size() > 0) {
            int index = Integer.parseInt(reader.readLine());
            int element = 0;

            if (index < 0) {
                element = elements.get(0);
                elements.set(0, elements.get(elements.size() - 1));
            } else if (index >= elements.size()) {
                element = elements.get(elements.size() - 1);
                elements.set(elements.size() - 1, elements.get(0));
            } else {
                element = elements.get(index);
                elements.remove(index);
            }
            sum += element;
            increaseOrDecreaseElement(elements, element);
        }
        System.out.println(sum);
    }

    private static void increaseOrDecreaseElement(List<Integer> elements, int element) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) <= element) {
                elements.set(i, elements.get(i) + element);
            } else {
                elements.set(i, elements.get(i) - element);
            }
        }
    }
}