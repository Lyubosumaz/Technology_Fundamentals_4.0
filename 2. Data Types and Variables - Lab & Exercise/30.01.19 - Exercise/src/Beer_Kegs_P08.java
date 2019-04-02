import java.util.Scanner;

public class Beer_Kegs_P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String biggestKeg = "";
        double previousKeg = 0;
        while (counter < input) {
            double kegVolume = 0;
            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            long kegHeight = Long.parseLong(scanner.nextLine());
            kegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;

            if (kegVolume > previousKeg) {
                biggestKeg = kegModel;
                previousKeg = kegVolume;
            }
            counter++;
        }
        System.out.println(biggestKeg);
    }
}