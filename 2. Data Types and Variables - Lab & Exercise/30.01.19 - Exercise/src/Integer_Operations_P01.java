import java.util.Scanner;

public class Integer_Operations_P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineOne = Integer.parseInt(scanner.nextLine());
        int lineTwo = Integer.parseInt(scanner.nextLine());
        int lineThree = Integer.parseInt(scanner.nextLine());
        int lineFour = Integer.parseInt(scanner.nextLine());

        int sum = ((lineOne + lineTwo) / lineThree) * lineFour;
        System.out.println(sum);
    }
}