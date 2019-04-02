import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_Manipulator_P11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArray = reader.readLine().split("\\s+");
        String input = "";
        while (!"end".equals(input = reader.readLine())) {
            String[] commands = input.split("\\s+");

            if (commands[0].equals("exchange")) {
                String keyCommand = commands[0];
                int exchangeIndex = Integer.parseInt(commands[1]);

                inputArray = exchangeIndex(inputArray, keyCommand, exchangeIndex);
            }

            if (commands[0].equals("max") || commands[0].equals("min")) {
                String keyCommand = commands[0];
                String evenOrOdd = commands[1];
                if (minMaxIndex(inputArray, keyCommand, evenOrOdd) == -1) {
                    System.out.println("No matches");
                } else {
                    System.out.println(minMaxIndex(inputArray, keyCommand, evenOrOdd));
                }

            }
            if (commands[0].equals("first") || commands[0].equals("last")) {
                String keyCommand = commands[0];
                int numberOfIndexes = Integer.parseInt(commands[1]);
                String evenOrOdd = commands[2];

                if (firstLastIndex(inputArray, keyCommand, numberOfIndexes, evenOrOdd)[0] == -1) {
                    System.out.println("Invalid count");
                }
                if (firstLastIndex(inputArray, keyCommand, numberOfIndexes, evenOrOdd)[0] == -2) {
                    System.out.println("[]");
                } else {
                    for (int i = 0; i < numberOfIndexes; i++) {
                        if (i == 0) {
                            System.out.printf("[%s", (firstLastIndex(inputArray, keyCommand, numberOfIndexes, evenOrOdd)[i]));
                        }
                        if (i >= 1 && i <= numberOfIndexes - 2) {
                            System.out.printf(", %s", (firstLastIndex(inputArray, keyCommand, numberOfIndexes, evenOrOdd)[i]));
                        }
                        if (firstLastIndex(inputArray, keyCommand, numberOfIndexes, evenOrOdd)[i] == 0) {
                            System.out.println("]");
                        } else if (i == numberOfIndexes - 1) {
                            System.out.printf(", %s]\n", (firstLastIndex(inputArray, keyCommand, numberOfIndexes, evenOrOdd)[i]));

                        }
                    }
                }
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0) {
                System.out.printf("[%s, ", inputArray[i]);
            }
            if (i >= 1 && i <= inputArray.length - 2) {
                System.out.printf("%s, ", inputArray[i]);
            }
            if (i == inputArray.length - 1) {
                System.out.printf("%s]", inputArray[i]);
            }
        }
    }

    private static String[] exchangeIndex(String[] inputArray, String keyCommand, int exchangeIndex) {
        String[] exchangeArray = new String[inputArray.length];
        exchangeArray = inputArray;

        if (keyCommand.equals("exchange")) {
            String tempLastIndex = "";
            for (int i = 0; i <= exchangeIndex % exchangeArray.length; i++) {
                tempLastIndex = exchangeArray[0];

                for (int j = 0; j < exchangeArray.length - 1; j++) {
                    exchangeArray[j] = exchangeArray[j + 1];
                }
                exchangeArray[exchangeArray.length - 1] = tempLastIndex;
            }
        }
        return exchangeArray;
    }

    private static int minMaxIndex(String[] inputArray, String keyCommand, String evenOrOdd) {
        String[] MinMaxArray = new String[inputArray.length];
        MinMaxArray = inputArray;

        if (keyCommand.equals("max")) {

            int maxEvenString = -1;
            int maxOddString = -1;

            if (evenOrOdd.equals("even")) {
                int maxEven = Integer.MIN_VALUE;

                for (int i = 0; i < MinMaxArray.length; i++) {
                    if (Integer.parseInt(MinMaxArray[i]) >= maxEven && Integer.parseInt(MinMaxArray[i]) % 2 == 0) {
                        maxEvenString = i;
                        maxEven = Integer.parseInt(MinMaxArray[i]);
                    }
                }
                return maxEvenString;
            }
            if (evenOrOdd.equals("odd")) {
                int maxOdd = Integer.MIN_VALUE;

                for (int i = 0; i < MinMaxArray.length; i++) {
                    if (Integer.parseInt(MinMaxArray[i]) >= maxOdd && Integer.parseInt(MinMaxArray[i]) % 2 != 0) {
                        maxOddString = i;
                        maxOdd = Integer.parseInt(MinMaxArray[i]);
                    }
                }
                return maxOddString;
            }
        }
        if (keyCommand.equals("min")) {

            int minEvenString = -1;
            int minOddString = -1;

            if (evenOrOdd.equals("even")) {
                int minEven = Integer.MAX_VALUE;

                for (int i = 0; i < MinMaxArray.length; i++) {
                    if (Integer.parseInt(MinMaxArray[i]) <= minEven && Integer.parseInt(MinMaxArray[i]) % 2 == 0) {
                        minEvenString = i;
                        minEven = Integer.parseInt(MinMaxArray[i]);
                    }
                }
                return minEvenString;
            }
            if (evenOrOdd.equals("odd")) {
                int minOdd = Integer.MAX_VALUE;

                for (int i = 0; i < MinMaxArray.length; i++) {
                    if (Integer.parseInt(MinMaxArray[i]) <= minOdd && Integer.parseInt(MinMaxArray[i]) % 2 != 0) {
                        minOddString = i;
                        minOdd = Integer.parseInt(MinMaxArray[i]);
                    }
                }
                return minOddString;
            }

        }
        return -1;
    }

    private static int[] firstLastIndex(String[] inputArray, String keyCommand, int numberOfIndexes, String evenOrOdd) {
        int[] portionOfEvenOddArray = new int[numberOfIndexes];

        if (numberOfIndexes > inputArray.length) {
            int[] invalid = {-1};
            return invalid;
        }
        int[] zero = {-2};

        if (keyCommand.equals("first")) {
            int counterFirst = 0;
            if (evenOrOdd.equals("even")) {
                for (int i = 0; i < inputArray.length; i++) {
                    if (Integer.parseInt(inputArray[i]) % 2 == 0) {
                        portionOfEvenOddArray[counterFirst++] = Integer.parseInt(inputArray[i]);
                        if (counterFirst == numberOfIndexes) {
                            break;
                        }
                    }
                    if (counterFirst != 0) {
                        return portionOfEvenOddArray;
                    } else {
                        return zero;
                    }
                }
//                return portionOfEvenOddArray;
            }
            if (evenOrOdd.equals("odd")) {
                for (int i = 0; i < inputArray.length; i++) {
                    if (Integer.parseInt(inputArray[i]) % 2 != 0) {
                        portionOfEvenOddArray[counterFirst++] = Integer.parseInt(inputArray[i]);
                        if (counterFirst == numberOfIndexes) {
                            break;
                        }
                    }
                    if (counterFirst != 0) {
                        return portionOfEvenOddArray;
                    } else {
                        return zero;
                    }
                }
//                return portionOfEvenOddArray;
            }
        }

        int[] lastEvenOddNumbers = new int[numberOfIndexes];

        if (keyCommand.equals("last")) {
            int counterLast = 0;
            if (evenOrOdd.equals("even")) {
                for (int i = inputArray.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(inputArray[i]) % 2 == 0) {
                        lastEvenOddNumbers[counterLast++] = Integer.parseInt(inputArray[i]);
                        if (counterLast == numberOfIndexes) {
                            int counter = 0;
                            for (int j = numberOfIndexes - 1; j >= 0; j--) {
                                portionOfEvenOddArray[counter++] = lastEvenOddNumbers[j];
                            }
                            break;
                        }
                    }
                }
                if (counterLast != 0) {
                    return portionOfEvenOddArray;
                } else {
                    return zero;
                }
//                return portionOfEvenOddArray;
            }
            if (evenOrOdd.equals("odd")) {
                for (int i = inputArray.length - 1; i >= 0; i--) {
                    if (Integer.parseInt(inputArray[i]) % 2 != 0) {
                        lastEvenOddNumbers[counterLast++] = Integer.parseInt(inputArray[i]);
                        if (counterLast == numberOfIndexes) {
                            int counter = 0;
                            for (int j = numberOfIndexes - 1; j >= 0; j--) {
                                portionOfEvenOddArray[counter++] = lastEvenOddNumbers[j];
                            }
                            break;
                        } else {
                            int counter = 0;
                            for (int j = numberOfIndexes - 1; j >= 0; j--) {
                                if (lastEvenOddNumbers[j] != 0) {
                                    portionOfEvenOddArray[counter++] = lastEvenOddNumbers[j];
                                }
                            }
                        }
                    }
                }
                if (counterLast != 0) {
                    return portionOfEvenOddArray;
                } else {
                    return zero;
                }
            }
        }
        return zero;
    }
}