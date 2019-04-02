import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Center_Point_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x1 = Double.parseDouble(reader.readLine());
        double y1 = Double.parseDouble(reader.readLine());
        double x2 = Double.parseDouble(reader.readLine());
        double y2 = Double.parseDouble(reader.readLine());
        closestToCenter(x1, y1, x2, y2);
    }

    public static void closestToCenter(double x1, double y1, double x2, double y2) {
        double pointOne = Math.sqrt(Math.pow(x1 - 0, 2) + Math.pow(y1 - 0, 2));
        double pointTwo = Math.sqrt(Math.pow(x2 - 0, 2) + Math.pow(y2 - 0, 2));
        if (pointOne <= pointTwo) {
            System.out.printf("(%.0f, %.0f)", x1, y1);
        } else {
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }
    }
}