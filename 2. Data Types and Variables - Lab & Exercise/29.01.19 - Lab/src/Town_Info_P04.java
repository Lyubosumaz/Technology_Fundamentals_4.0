import java.util.Scanner;

public class Town_Info_P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.", cityName, population, area);
    }
}