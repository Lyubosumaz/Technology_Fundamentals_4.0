import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Extract_File_P03v01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();

        String name = inputText.substring(inputText.lastIndexOf('\\') + 1, inputText.lastIndexOf('.'));
        String extension = inputText.substring(inputText.lastIndexOf('.') + 1);

        System.out.printf("File name: %s\nFile extension: %s\n", name, extension);
    }
}