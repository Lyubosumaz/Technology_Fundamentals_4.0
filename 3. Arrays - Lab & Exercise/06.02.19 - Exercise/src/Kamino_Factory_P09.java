import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kamino_Factory_P09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int theLenght = Integer.parseInt(reader.readLine());
        String input = reader.readLine();

        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestSequenceIndexCounter = 0;
        int bestSequenceOutput = 0;
        String sequenceOutput = "";

        while (!"Clone them!".equals(input)) {
            ++bestSequenceIndexCounter;

            String[] data = input.split("!+");

            int[] sequenceDNA = new int[theLenght];
            int index = 0;
            for (int i = 0; i < theLenght; i++) {
                sequenceDNA[i] = Integer.parseInt(data[i]);
            }
            int sequenceIndex = 0;
            int maxCounter = 0;
            for (int i = 0; i < sequenceDNA.length; i++) {

                int currentCounter = 0;
                for (int j = i; j < sequenceDNA.length; j++) {
                    if (sequenceDNA[i] == sequenceDNA[j]) {
                        currentCounter++;
                        if (currentCounter > maxCounter) {
                            maxCounter = currentCounter;
                            sequenceIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            int sequenceSum = 0;
            for (int i = 0; i < sequenceDNA.length; i++) {
                if (sequenceDNA[i] == 1) {
                    sequenceSum += sequenceDNA[i];
                }
            }
            if (sequenceIndex < bestSequenceIndex || sequenceSum > bestSequenceSum) {
                sequenceOutput = "";
                bestSequenceIndex = sequenceIndex;
                bestSequenceSum = sequenceSum;
                bestSequenceOutput = bestSequenceIndexCounter;
                for (int i = 0; i < sequenceDNA.length; i++) {
                    sequenceOutput += sequenceDNA[i] + " ";
                }
            }
            input = reader.readLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n%s", bestSequenceOutput, bestSequenceSum, sequenceOutput);
    }
}