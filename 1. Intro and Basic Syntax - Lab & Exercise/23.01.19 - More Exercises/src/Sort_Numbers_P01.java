import java.util.Scanner;

public class Sort_Numbers_P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        if (numberTwo > numberOne) {
            int temp = numberTwo;
            numberTwo = numberOne;
            numberOne = temp;
        }
        if (numberThree > numberTwo) {
            int temp = numberThree;
            numberThree = numberTwo;
            numberTwo = temp;
        }
        if (numberTwo > numberOne) {
            int temp = numberTwo;
            numberTwo = numberOne;
            numberOne = temp;
        }
        System.out.printf("%d\n%d\n%d", numberOne, numberTwo, numberThree);
    }
}