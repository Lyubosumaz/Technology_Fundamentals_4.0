import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greater_of_Two_Values_P09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String type = reader.readLine();
        switch (type) {
            case "int":
                int aNum = Integer.parseInt(reader.readLine());
                int bNum = Integer.parseInt(reader.readLine());
                System.out.println(getMax(aNum, bNum));
                break;
            case "char":
                char aChar = reader.readLine().charAt(0);
                char bChar = reader.readLine().charAt(0);
                System.out.println(getMax(aChar, bChar));
                break;
            case "String":
                String aSrting = reader.readLine();
                String bSrting = reader.readLine();
                System.out.println(getMax(aSrting, bSrting));
                break;
            default:
                break;
        }

    }

    static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else
            return secondNum;
    }

    static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        } else {
            return secondChar;
        }
    }

    static String getMax(String firstStr, String secondStr) {
        if (firstStr.compareTo(secondStr) >= 0) {
            return firstStr;
        } else {
            return secondStr;
        }
    }
}