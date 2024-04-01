import java.util.Arrays;
import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        System.out.println("Show me your integer: ");
        int initialInteger = fetch.nextInt();
        System.out.println("Show me your segment length: ");
        int segmentLength = fetch.nextInt();
        int[] theArrayOfTheInteger = ChangeTheIntegerToTheCorrespondingArray(initialInteger,segmentLength);
        int sumOfTheArray = SumUpTheArray(ReverseAllTheIntegersInTheArray(theArrayOfTheInteger));
        System.out.printf("The sum of the segments in the integer is %d" ,sumOfTheArray);
    }


    public static int[] ChangeTheIntegerToTheCorrespondingArray(int initialNumber, int segmentLength){
        int remainedNumber = initialNumber;
        int numberToTestLength = initialNumber;
        int lengthOfInitialNumber = 0;
        while (true){
            numberToTestLength = numberToTestLength/10;
            lengthOfInitialNumber += 1;
            if (numberToTestLength == 0){
                break;
            }
        }
        int lengthOfTheArray = (int) Math.ceil((double) lengthOfInitialNumber/(double) segmentLength);
        int errorInLength = lengthOfTheArray * segmentLength - lengthOfInitialNumber;
        int[] outputArray = new int[lengthOfTheArray];
        for (int theLocationOfComputationTime = 0; theLocationOfComputationTime < lengthOfTheArray; theLocationOfComputationTime++) {
            int powerOfTheDenominator = 0;
            if (theLocationOfComputationTime == lengthOfTheArray - 1){
                powerOfTheDenominator = 0;
            }
            else{
                powerOfTheDenominator= segmentLength*((lengthOfTheArray-1-theLocationOfComputationTime))-errorInLength;
            }
            outputArray[theLocationOfComputationTime]= (int) ((int)remainedNumber/(int)Math.pow(10,powerOfTheDenominator));
            remainedNumber = (int) ((int)remainedNumber%(int)Math.pow(10,powerOfTheDenominator));
        }
        return outputArray;
    }
    public static int SumUpTheArray(int[] inputArray){
        int sumOfTheArray = 0;
        for (int sequenceOfTheOperationLocation = 0; sequenceOfTheOperationLocation < inputArray.length; sequenceOfTheOperationLocation++) {
            sumOfTheArray += inputArray[sequenceOfTheOperationLocation];
        }
        return sumOfTheArray;
    }

    public static int ReverseAnInteger(int initialInteger){
        int lengthOfTheInteger=0;
        int remainedInteger = initialInteger;
        int numberToTestLength = initialInteger;
        int outputInteger= 0;
        while (true){
            numberToTestLength = numberToTestLength/10;
            lengthOfTheInteger += 1;
            if (numberToTestLength == 0){
                break;
            }
        }
        for (int timeOfComputation = 0; timeOfComputation < lengthOfTheInteger; timeOfComputation++) {
            int computationPart = remainedInteger % 10;
            outputInteger = outputInteger*10+computationPart;
            remainedInteger = remainedInteger /10;
        }
        return outputInteger;
    }

    public static int[] ReverseAllTheIntegersInTheArray(int[] initialArray){
        int lengthOfTheArray = initialArray.length;
        for (int locationOnTheArray = 0; locationOnTheArray < lengthOfTheArray; locationOnTheArray++) {
            initialArray[locationOnTheArray]=ReverseAnInteger(initialArray[locationOnTheArray]);
        }
        int[] outputArray = initialArray;
        return outputArray;
    }
}
