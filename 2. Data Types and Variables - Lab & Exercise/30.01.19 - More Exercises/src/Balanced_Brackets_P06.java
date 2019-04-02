import java.util.Scanner;

public class Balanced_Brackets_P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String input = "";
        int openingBracket = 0;
        int closingBracket = 0;
        boolean isBalanced = false;

        for (int i = 1; i <= num; i++) {
            input = scanner.nextLine();
            if (input.equals("(")) {
                openingBracket++;
            } else if (input.equals(")")) {
                closingBracket++;
                if (openingBracket == closingBracket) {
                    isBalanced = true;
                    openingBracket = 0;
                    closingBracket = 0;
                } else {
                    isBalanced = false;
                    openingBracket = 0;
                    closingBracket = 0;
                }
            }
        }
        if (openingBracket != closingBracket) {
            isBalanced = false;
        }
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}