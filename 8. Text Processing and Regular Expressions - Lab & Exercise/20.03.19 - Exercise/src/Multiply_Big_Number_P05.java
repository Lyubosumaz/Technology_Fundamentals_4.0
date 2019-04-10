import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Multiply_Big_Number_P05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger num = new BigInteger(reader.readLine());
        BigInteger multiplier = new BigInteger(reader.readLine());

        BigInteger output = num.multiply(multiplier);

        System.out.println(output);
    }
}