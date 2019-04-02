import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Data_Types_P01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String first = reader.readLine();
        String second = reader.readLine();
        switch (first) {
            case "int":
                int intValue = Integer.parseInt(second);
                integerNumber(intValue);
                break;
            case "real":
                double doubleValue = Double.parseDouble(second);
                realNumber(doubleValue);
                break;
            case "string":
                textWithDollars(second);
                break;
        }
    }

    private static void textWithDollars(String text) {
        String result = String.format("$%s$", text);
        System.out.println(result);
    }


    private static void realNumber(double number) {
        double result = number * 1.50;
        System.out.printf("%.2f", result);
    }

    private static void integerNumber(int number) {
        int result = number * 2;
        System.out.println(result);
    }
}
