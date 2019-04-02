import java.util.Scanner;

public class Passed_Failed_03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3) {
            System.out.printf("Passed!");
        } else {
            System.out.printf("Failed!");
        }
    }
}