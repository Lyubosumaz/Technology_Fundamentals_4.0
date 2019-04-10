import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//80/100

public class Extract_File_P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputText = reader.readLine().split("\\\\");

        String[] file = inputText[inputText.length - 1].split("[.+]");
        String name = file[0].trim();
        String extension = file[1].trim();

        System.out.printf("File name: %s\nFile extension: %s\n", name, extension);
    }
}