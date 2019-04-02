import java.util.Scanner;

public class Login_P05v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String reverseUsername = "";
        for (int i = 0; i < username.length(); i++) {
            reverseUsername += username.charAt(username.length() - i - 1);

            int counter = 1;
            String currentTry = scanner.nextLine();
            while (!currentTry.equals(reverseUsername)) {
                if (counter++ == 4) {
                    System.out.printf("User %s blocked!", username);
                    return;
                }
                System.out.println("Incorrect password. Try again.");
                currentTry = scanner.nextLine();
            }
        }
        System.out.printf("User %s logged in.", username);
    }
}