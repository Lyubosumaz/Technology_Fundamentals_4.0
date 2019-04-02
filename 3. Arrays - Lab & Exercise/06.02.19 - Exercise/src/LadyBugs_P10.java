import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LadyBugs_P10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int fieldSize = Integer.parseInt(reader.readLine());
        String[] bugIndex = reader.readLine().split(" ");

        int[] fieldArray = new int[fieldSize];
        for (int i = 0; i < bugIndex.length; i++) {
            int index = Integer.parseInt(bugIndex[i]);
            if (index>=0&&index<fieldSize){
                fieldArray[index]=1;
            }
        }
//        if (Integer.parseInt(bugIndex[0]) > 0) {
//            int indexCounter = Integer.parseInt(bugIndex[0]);
//            int bugCounter = 0;
//            for (int i = 0; i < bugIndex.length; i++) {
//                bugIndexInteger[indexCounter - 1] = Integer.parseInt(bugIndex[bugCounter++]);
//                indexCounter++;
//            }
//        } else {
//            for (int i = 0; i < bugIndex.length; i++) {
//                bugIndexInteger[i] = Integer.parseInt(bugIndex[i]) + 1;
//            }
//        }
//        int[] fieldArray = new int[fieldSize];
//        for (int i = 0; i < fieldSize; i++) {
//            if (bugIndexInteger[i] >= 1) {
//                bugIndexInteger[i] = 1;
//            } else {
//                bugIndexInteger[i] = 0;
//            }
//        }
//        //done field!!
//        fieldArray = bugIndexInteger;
        String command = reader.readLine();

        while (!"end".equals(command)) {
            String[] commands = command.split(" ");
            int position = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int length = Integer.parseInt(commands[2]);

            if (position < 0 || position > fieldSize - 1 || fieldArray[position] == 0) {
                command = reader.readLine();
                continue;
            }
            fieldArray[position] = 0;
            if ("right".equals(direction)) {
                position += length;
                while (position < fieldSize && fieldArray[position] == 1) {
                    position += length;
                }
                if (position < fieldSize) {
                    fieldArray[position] = 1;
                }
            } else {
                position -= length;
                while (position >= 0 && fieldArray[position] == 1) {
                    position -= length;
                }
                if (position >= 0) {
                    fieldArray[position] = 1;
                }
            }
            command = reader.readLine();
//            int newPosition = 0;
//            if ("right".equals(direction)) {
//                newPosition = position + length;
//            } else {
//                newPosition = position - length;
//            }
//
//            if (position >= 0 && position < fieldArray.length) {
//                if (fieldArray[position] == 1) {
//                    fieldArray[position] = 0;
//                    while (true) {
//                        if (newPosition > fieldArray.length - 1 || newPosition < 0) {
//                            break;
//                        }
//                        if (fieldArray[newPosition] == 0) {
//                            fieldArray[newPosition] = 1;
//                            break;
//                        }else {
//                            newPosition=newPosition+length;
//                        }
////                        if ("right".equals(direction)) {
////                            newPosition += newPosition + length;
////                        } else if ("left".equals(direction)) {
////                            newPosition = newPosition - length;
////                        }
//                    }
//                }
//            }
//        }
        }
        for (int i = 0; i < fieldArray.length; i++) {
            System.out.printf("%d ", fieldArray[i]);
        }
    }
}