import java.util.Scanner;

public class Common_Elements_P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputOne = scanner.nextLine().split(" ");
        String[] inputTwo = scanner.nextLine().split(" ");

        for (int i = 0; i < inputTwo.length; i++) {
            for (int j = 0; j < inputOne.length; j++) {
                if (inputTwo[i].equals(inputOne[j])) {
                    System.out.printf("%s ", inputTwo[i]);
                }
            }
        }

    }
}