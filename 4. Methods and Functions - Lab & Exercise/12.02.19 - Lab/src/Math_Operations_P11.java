import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.text.DecimalFormat;

public class Math_Operations_P11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(reader.readLine());
        String operator = reader.readLine();
        int secondNum = Integer.parseInt(reader.readLine());
        DecimalFormat format = new DecimalFormat("#.#####");
        System.out.println(format.format(calculate(firstNum, operator, secondNum)));

    }

    private static double calculate(int a, String command, int b) {
        double result = 0;

        switch (command) {
            case "/":
                result = (a * 1.0) / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
