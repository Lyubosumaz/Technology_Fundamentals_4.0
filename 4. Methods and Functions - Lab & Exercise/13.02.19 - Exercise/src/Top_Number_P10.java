import java.util.Scanner;

public class Top_Number_P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        System.out.println(topNumber(input));
    }

    private static String topNumber(int number) {
        String everyTopNumber = "";
        String temp = "";
        for (int i = 1; i <= number; i++) {
            temp = String.valueOf(i);
            int digitsSum = 0;
            if (temp.length() >= 2) {

                boolean oneOdd = false;
                for (int j = 0; j < temp.length(); j++) {
                    digitsSum += Integer.parseInt(String.valueOf(temp.charAt(j)));

                    if (Integer.parseInt(String.valueOf(temp.charAt(j))) % 2 != 0) {
                        oneOdd = true;
                    }
                }
                if (digitsSum % 8 == 0 && oneOdd) {
                    everyTopNumber += temp + "\n";
                }
            }
        }
        return everyTopNumber;
    }
}
