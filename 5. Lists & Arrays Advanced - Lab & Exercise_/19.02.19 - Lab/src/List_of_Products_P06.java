import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_of_Products_P06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        List<String> productsList = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            productsList.add(reader.readLine());
        }
        Collections.sort(productsList);
        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s\n", i + 1, productsList.get(i));
        }
    }
}