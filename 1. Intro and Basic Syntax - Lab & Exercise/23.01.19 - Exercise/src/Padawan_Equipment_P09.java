import java.util.Scanner;

public class Padawan_Equipment_P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightsabers = lightsaberPrice * (students + Math.ceil((double) students * 10 / 100));
        double robes = robePrice * students;
        double belts = beltPrice * (students - Math.floor((double) students / 6));

        double total = lightsabers + robes + belts;
        if (budget >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", total - budget);
        }
    }
}