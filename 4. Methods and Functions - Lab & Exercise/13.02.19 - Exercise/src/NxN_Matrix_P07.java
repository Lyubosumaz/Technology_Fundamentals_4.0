import java.util.Scanner;

public class NxN_Matrix_P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(matrix(number));
    }

    private static String matrix(int num) {
        String resultMatrix = "";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                resultMatrix += num + " ";
            }
            resultMatrix += "\n";
        }
        return resultMatrix;
    }
}