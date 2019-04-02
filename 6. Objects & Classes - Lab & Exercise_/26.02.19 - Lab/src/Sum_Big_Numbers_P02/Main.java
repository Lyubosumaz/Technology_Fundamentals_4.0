package Sum_Big_Numbers_P02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger firstNumber = new BigInteger(reader.readLine());
        BigInteger secondNumber = new BigInteger(reader.readLine());

        BigInteger sum = firstNumber.add(secondNumber);
        System.out.println(sum);
    }
}