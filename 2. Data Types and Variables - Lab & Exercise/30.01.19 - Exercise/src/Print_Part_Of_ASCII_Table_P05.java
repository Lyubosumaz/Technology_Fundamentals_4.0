import java.util.Scanner;

public class Print_Part_Of_ASCII_Table_P05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        for (; startNum <= endNum; startNum++) {
            System.out.printf("%c ",(char)startNum);
        }
    }
}