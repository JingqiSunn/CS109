import java.util.Arrays;
import java.util.Scanner;

public class ProblemFour {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        String initialIntegerInString = fetch.next();
        int segmentLength = fetch.nextInt();
        long[] theCorrespondingArray = StringIntToArray(initialIntegerInString, segmentLength);
        long[] theCorrespondingArrayAfterReverse = ReverseAllTheIntegersInTheArray(theCorrespondingArray);
        long sumOfThePartsOfTheArray = SumUpTheArray(theCorrespondingArrayAfterReverse);
        System.out.println(sumOfThePartsOfTheArray);
    }

    public static long[] StringIntToArray(String theInitialInteger, int segmentLength) {
        int lengthOfInitialNumber = theInitialInteger.length();
        int lengthOfTheArray = (int) Math.ceil((double) lengthOfInitialNumber / (double) segmentLength);
        int errorInLength = lengthOfTheArray * segmentLength - lengthOfInitialNumber;
        long[] outputArray = new long[lengthOfTheArray];
        for (int computationTime = 0; computationTime < lengthOfTheArray; computationTime++) {
            if (computationTime != lengthOfTheArray - 1) {
                outputArray[computationTime] = Long.parseLong(theInitialInteger.substring(computationTime * segmentLength, computationTime * segmentLength + segmentLength));
            } else {
                outputArray[computationTime] = Long.parseLong(theInitialInteger.substring(computationTime * segmentLength, lengthOfInitialNumber));
            }
        }
        return outputArray;
    }

    public static long SumUpTheArray(long[] inputArray) {
        long sumOfTheArray = 0;
        for (int sequenceOfTheOperationLocation = 0; sequenceOfTheOperationLocation < inputArray.length; sequenceOfTheOperationLocation++) {
            sumOfTheArray += inputArray[sequenceOfTheOperationLocation];
        }
        return sumOfTheArray;
    }

    public static long ReverseAnInteger(long initialInteger) {
        int lengthOfTheInteger = 0;
        long remainedInteger = initialInteger;
        long numberToTestLength = initialInteger;
        long outputInteger = 0;
        while (true) {
            numberToTestLength = numberToTestLength / 10;
            lengthOfTheInteger += 1;
            if (numberToTestLength == 0) {
                break;
            }
        }
        for (int timeOfComputation = 0; timeOfComputation < lengthOfTheInteger; timeOfComputation++) {
            long computationPart = remainedInteger % 10;
            outputInteger = outputInteger * 10 + computationPart;
            remainedInteger = remainedInteger / 10;
        }
        return outputInteger;
    }

    public static long[] ReverseAllTheIntegersInTheArray(long[] initialArray) {
        int lengthOfTheArray = initialArray.length;
        for (int locationOnTheArray = 0; locationOnTheArray < lengthOfTheArray; locationOnTheArray++) {
            initialArray[locationOnTheArray] = ReverseAnInteger(initialArray[locationOnTheArray]);
        }
        long[] outputArray = initialArray;
        return outputArray;
    }
}
