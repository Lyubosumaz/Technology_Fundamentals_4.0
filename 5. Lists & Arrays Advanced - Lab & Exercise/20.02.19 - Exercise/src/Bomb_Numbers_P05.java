import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb_Numbers_P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bombFieldList = Arrays.stream(scanner.nextLine().split("\\s+")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        String[] bombNumberAndPower = scanner.nextLine().split("\\s+");
        int bombNumber = Integer.parseInt(bombNumberAndPower[0]);
        int bombPower = Integer.parseInt(bombNumberAndPower[1]);

        while (bombFieldList.contains(bombNumber)) {
            int bombIndex = bombFieldList.indexOf(bombNumber);

            int left = Math.max(0, bombIndex - bombPower);
            int right = Math.min(bombIndex + bombPower, bombFieldList.size() - 1);

            for (int i = right; i >= left; i--) {
                bombFieldList.remove(i);
            }
        }
        int output = 0;
        for (int i = 0; i < bombFieldList.size(); i++) {
            output += bombFieldList.get(i);
        }
        System.out.print(output);
    }
}