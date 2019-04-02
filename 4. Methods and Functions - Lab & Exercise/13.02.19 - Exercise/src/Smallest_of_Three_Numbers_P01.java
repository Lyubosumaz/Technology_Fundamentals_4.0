import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Smallest_of_Three_Numbers_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        System.out.println(smallestNum(a, b, c));
    }

    private static int smallestNum(int numOne, int numTwo, int numThree) {
        int result = Integer.MAX_VALUE;
        if (numOne < result) {
            result = numOne;
        }
        if (numTwo < result) {
            result = numTwo;
        }
        if (numThree < result) {
            result = numThree;
        }
        return result;
    }
}