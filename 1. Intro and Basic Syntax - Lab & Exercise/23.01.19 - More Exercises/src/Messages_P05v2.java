import java.util.Scanner;

public class Messages_P05v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messageLength = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 0; i < messageLength; i++) {
            String num = scanner.nextLine();
            int numLength = num.length();
            char oneNum = num.charAt(0);
            int mainNum = Character.getNumericValue(oneNum);
            int offset = (mainNum - 2) * 3;
            if (mainNum == 8 || mainNum == 9) {
                offset = (mainNum - 2) * 3 + 1;
            }
            int letterIndex = offset + numLength - 1;
            int letterCode = letterIndex + 97;
            char letter = (char) letterCode;
            if (mainNum == 0) {
                letter = (char) (mainNum + 32);
            }
            message += letter;
        }
        System.out.println(message);
    }
}