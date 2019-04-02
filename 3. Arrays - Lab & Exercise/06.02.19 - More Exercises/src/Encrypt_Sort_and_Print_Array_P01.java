import java.util.Scanner;

public class Encrypt_Sort_and_Print_Array_P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String[] inputNames = new String[input];
        for (int i = 0; i < input; i++) {
            inputNames[i] = scanner.nextLine();
        }
        int[] orderTheEncrypt = new int[inputNames.length];
        for (int i = 0; i < inputNames.length; i++) {
            int temp = 0;
            int sum = 0;
            for (int j = 0; j < inputNames[i].length(); j++) {
                temp = inputNames[i].charAt(j);
                if (temp == 65 || temp == 97 ||
                        temp == 69 || temp == 101 ||
                        temp == 73 || temp == 105 ||
                        temp == 79 || temp == 111 ||
                        temp == 85 || temp == 117) {
                    sum += temp * inputNames[i].length();
                } else {
                    sum += temp / inputNames[i].length();
                }
            }
            orderTheEncrypt[i] = sum;
        }
        for (int i = 0; i < orderTheEncrypt.length - 1; i++) {
            int tempIndex = orderTheEncrypt[i];
            if (orderTheEncrypt[i] > orderTheEncrypt[i + 1]) {
                orderTheEncrypt[i] = orderTheEncrypt[i + 1];
                orderTheEncrypt[i + 1] = tempIndex;
                i = -1;
            }
        }
        for (int sum : orderTheEncrypt) {
            System.out.println(sum);
        }
    }
}