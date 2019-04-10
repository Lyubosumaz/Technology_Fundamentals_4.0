package Advertisement_Message_P01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        Massage massageOutput = new Massage();

        for (int i = 0; i < inputNum; i++) {
            System.out.println(massageOutput.randomMessage());
        }
    }
}