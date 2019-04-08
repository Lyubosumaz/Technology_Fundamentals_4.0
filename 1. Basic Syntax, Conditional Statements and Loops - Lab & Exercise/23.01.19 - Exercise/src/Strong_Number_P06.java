import java.util.Scanner;

public class Strong_Number_P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = (scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int num = Integer.parseInt(String.valueOf(input.charAt(i)));

            int factorial = 1;
            for (int j = 1; j <= num; j++) {
                factorial *= j;
            }
                sum += factorial;
        }
        if (input.equals(String.valueOf(sum))){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}