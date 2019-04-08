import java.util.Scanner;

public class English_Name_Last_Digit_P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String toText = String.valueOf(num);
        String lastDigit = "";
        String digitName = "";

        lastDigit += toText.charAt(toText.length() - 1);
        switch (lastDigit) {
            case "0":
                digitName = "zero";
                break;
            case "1":
                digitName = "one";
                break;
            case "2":
                digitName = "two";
                break;
            case "3":
                digitName = "three";
                break;
            case "4":
                digitName = "four";
                break;
            case "5":
                digitName = "five";
                break;
            case "6":
                digitName = "six";
                break;
            case "7":
                digitName = "seven";
                break;
            case "8":
                digitName = "eight";
                break;
            case "9":
                digitName = "nine";
                break;
        }
        System.out.println(digitName);
    }
}