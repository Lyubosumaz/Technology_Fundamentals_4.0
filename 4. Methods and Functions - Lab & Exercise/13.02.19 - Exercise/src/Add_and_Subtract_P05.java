import java.util.Scanner;

public class Add_and_Subtract_P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(subtractSumAndThird(a, b, c));
    }

    private static int addFirstSecond(int first, int second) {
        int sumFirstSecond = 0;
        return sumFirstSecond = first + second;
    }

    private static int subtractSumAndThird(int first, int second, int third) {
        int result = 0;
        return result = addFirstSecond(first, second) - third;

    }
}