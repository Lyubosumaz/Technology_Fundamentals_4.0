import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate_Rectangle_Area_P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = getRectangleArea(width, height);

        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println(format.format(area));
    }

    private static double getRectangleArea(double width, double height) {
        return width * height;
    }
}