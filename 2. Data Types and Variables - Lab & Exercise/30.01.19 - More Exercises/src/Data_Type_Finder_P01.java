import java.math.BigInteger;
        import java.util.Scanner;

public class Data_Type_Finder_P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            try {
                new BigInteger(input);
                System.out.printf("%s is integer type\n", input);
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(input);
                    System.out.printf("%s is floating point type\n", input);
                } catch (NumberFormatException nfe) {
                    if (input.length() == 1) {
                        System.out.printf("%s is character type\n", input);
                    } else if (input.equals("true") || input.equals("false")) {
                        System.out.printf("%s is boolean type\n", input);
                    } else
                        System.out.printf("%s is string type\n", input);
                }
            }
            input = scanner.nextLine();
        }
    }
}