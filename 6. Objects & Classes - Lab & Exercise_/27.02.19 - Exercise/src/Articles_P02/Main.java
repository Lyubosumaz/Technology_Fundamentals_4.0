package Articles_P02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = reader.readLine().split(", ");
        Articles article = new Articles(inputArray[0], inputArray[1], inputArray[2]);

        int inputNum = Integer.parseInt(reader.readLine());
        while (inputNum-- > 0) {
            String[] inputCommands = reader.readLine().split(": ");
            String keyCommand = inputCommands[0];

            switch (keyCommand) {
                case "Edit":
                    article.edit(inputCommands[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(inputCommands[1]);
                    break;
                case "Rename":
                    article.rename(inputCommands[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}