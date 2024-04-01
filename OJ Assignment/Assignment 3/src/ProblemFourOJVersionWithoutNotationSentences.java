
import java.util.Arrays;
import java.util.Scanner;

public class ProblemFourOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        String initialIntegerInString = fetch.next();
        int segmentLength = fetch.nextInt();
        int[] theCorrespondingArray = StringIntToArray(initialIntegerInString, segmentLength);
        int[] theCorrespondingArrayAfterReverse = ReverseAllTheIntegersInTheArray(theCorrespondingArray);
        int sumOfThePartsOfTheArray = SumUpTheArray(theCorrespondingArrayAfterReverse);
        System.out.println(sumOfThePartsOfTheArray);
    }

    public static int[] StringIntToArray(String theInitialInteger, int segmentLength) {
        int lengthOfInitialNumber = theInitialInteger.length();
        int lengthOfTheArray = (int) Math.ceil((double) lengthOfInitialNumber / (double) segmentLength);
        int errorInLength = lengthOfTheArray * segmentLength - lengthOfInitialNumber;
        int[] outputArray = new int[lengthOfTheArray];
        for (int computationTime = 0; computationTime < lengthOfTheArray; computationTime++) {
            if (computationTime != lengthOfTheArray - 1) {
                outputArray[computationTime] = Integer.parseInt(theInitialInteger.substring(computationTime * segmentLength, computationTime * segmentLength + segmentLength));
            } else {
                outputArray[computationTime] = Integer.parseInt(theInitialInteger.substring(computationTime * segmentLength, lengthOfInitialNumber));
            }
        }
        return outputArray;
    }

    public static int SumUpTheArray(int[] inputArray) {
        int sumOfTheArray = 0;
        for (int sequenceOfTheOperationLocation = 0; sequenceOfTheOperationLocation < inputArray.length; sequenceOfTheOperationLocation++) {
            sumOfTheArray += inputArray[sequenceOfTheOperationLocation];
        }
        return sumOfTheArray;
    }

    public static int ReverseAnInteger(int initialInteger) {
        int lengthOfTheInteger = 0;
        int remainedInteger = initialInteger;
        int numberToTestLength = initialInteger;
        int outputInteger = 0;
        while (true) {
            numberToTestLength = numberToTestLength / 10;
            lengthOfTheInteger += 1;
            if (numberToTestLength == 0) {
                break;
            }
        }
        for (int timeOfComputation = 0; timeOfComputation < lengthOfTheInteger; timeOfComputation++) {
            int computationPart = remainedInteger % 10;
            outputInteger = outputInteger * 10 + computationPart;
            remainedInteger = remainedInteger / 10;
        }
        return outputInteger;
    }

    public static int[] ReverseAllTheIntegersInTheArray(int[] initialArray) {
        int lengthOfTheArray = initialArray.length;
        for (int locationOnTheArray = 0; locationOnTheArray < lengthOfTheArray; locationOnTheArray++) {
            initialArray[locationOnTheArray] = ReverseAnInteger(initialArray[locationOnTheArray]);
        }
        int[] outputArray = initialArray;
        return outputArray;
    }
}

