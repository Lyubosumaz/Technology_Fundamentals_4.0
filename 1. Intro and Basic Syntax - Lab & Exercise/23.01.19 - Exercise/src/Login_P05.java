import java.util.Scanner;

public class Login_P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = new StringBuffer(username).reverse().toString();
        int counter = 1;

        while (true) {
            String currentTry = scanner.nextLine();
            if (password.equalsIgnoreCase(currentTry)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            counter++;
        }
    }
}