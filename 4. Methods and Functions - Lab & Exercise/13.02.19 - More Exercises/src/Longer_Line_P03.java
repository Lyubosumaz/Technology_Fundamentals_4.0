import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Longer_Line_P03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] arrayAB = new double[4];
        for (int i = 0; i < arrayAB.length; i++) {
            double abParameters = Double.parseDouble(reader.readLine());
            arrayAB[i] = abParameters;
        }
        double[] arrayCD = new double[4];
        for (int i = 0; i < arrayCD.length; i++) {
            double cdParameters = Double.parseDouble(reader.readLine());
            arrayCD[i] = cdParameters;
        }
        double[] biggerLine = getBiggerLine(arrayAB, arrayCD);
        alignmentOfLinePrint(biggerLine);
    }

    private static void alignmentOfLinePrint(double[] biggerLineArray) {
        double lengthOfXY = Math.sqrt(Math.pow(biggerLineArray[0] - 0, 2) + Math.pow(biggerLineArray[1] - 0, 2));
        double lengthOfQP = Math.sqrt(Math.pow(biggerLineArray[2] - 0, 2) + Math.pow(biggerLineArray[3] - 0, 2));
        if (lengthOfXY < lengthOfQP) {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", biggerLineArray[0], biggerLineArray[1], biggerLineArray[2], biggerLineArray[3]);
        } else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", biggerLineArray[2], biggerLineArray[3], biggerLineArray[0], biggerLineArray[1]);
        }

    }

    private static double[] getBiggerLine(double[] arrayAB, double[] arrayCD) {
        double[] biggerLine = new double[4];
        if (lengthLineAB(arrayAB) >= lengthLineCD(arrayCD)) {
            biggerLine = arrayAB;
        } else {
            biggerLine = arrayCD;
        }
        return biggerLine;
    }

    private static double lengthLineAB(double[] parametersAB) {
        double lengthAB = Math.sqrt(Math.pow(parametersAB[0] - parametersAB[2], 2) + Math.pow(parametersAB[1] - parametersAB[3], 2));
        return lengthAB;
    }

    private static double lengthLineCD(double[] parametersCD) {
        double lengthCD = Math.sqrt(Math.pow(parametersCD[0] - parametersCD[2], 2) + Math.pow(parametersCD[1] - parametersCD[3], 2));
        return lengthCD;
    }
}
