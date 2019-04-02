import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Poke_Mon_P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lineN = Integer.parseInt(reader.readLine());
        int lineM = Integer.parseInt(reader.readLine());
        int lineY = Integer.parseInt(reader.readLine());

        int targetCount = 0;
        int half = (lineN * 50) / 100;
        while (lineN >= lineM) {
            lineN -= lineM;
            if (lineN == half) {
                if (lineY > 0) {
                    lineN /= lineY;
                }
            }
            targetCount++;
        }
        System.out.printf("%d\n%d", lineN, targetCount);
    }
}