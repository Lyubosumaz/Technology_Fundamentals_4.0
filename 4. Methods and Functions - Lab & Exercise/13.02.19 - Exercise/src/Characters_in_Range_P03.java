import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Characters_in_Range_P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char a = reader.readLine().charAt(0);
        char b = reader.readLine().charAt(0);
        printBetween(a, b);
    }

    private static void printBetween(char first, char second) {
        char bigger = 0;
        char smaller = 0;
        if (first > second) {
            bigger = first;
            smaller = second;
        } else {
            bigger = second;
            smaller = first;
        }
        String allCharactersBetween = "";
        for (int i = smaller + 1; i < bigger; i++) {
            allCharactersBetween += ((char) (i) + " ");
        }
        System.out.println(allCharactersBetween);
    }
}