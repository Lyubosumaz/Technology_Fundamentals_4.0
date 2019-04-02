import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Change_List_P02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = reader.readLine().split("\\s+");
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            inputList.add(Integer.parseInt(inputArray[i]));
        }
        String command = "";
        while (!"END".equalsIgnoreCase(command = reader.readLine())) {
            String[] keyCommands = command.split("\\s+");

            switch (keyCommands[0]) {
                case "Delete":
                    int removeAllValuesOf = Integer.parseInt(keyCommands[1]);
                    for (int i = 0; i < inputList.size(); i++) {
                        if (inputList.get(i) == removeAllValuesOf) {
                            inputList.remove(Integer.valueOf(removeAllValuesOf));
                            i--;
                        }
                        if (inputList.size() == 0) {
                            inputList.add(0);
                        }
                    }
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(keyCommands[1]);
                    int indexOfInsertion = Integer.parseInt(keyCommands[2]);
                    if (indexOfInsertion >= 0 && indexOfInsertion < inputList.size()) {
                        inputList.add(indexOfInsertion, numberToInsert);
                    }
                    break;
            }
        }
        String output = "";
        for (Integer element : inputList) {
            output += element + " ";
        }
        System.out.println(output.trim());
    }
}