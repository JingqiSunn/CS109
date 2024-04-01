import java.util.Arrays;

public class TestTheIntToArray {
    public static void main(String args[]){
        int initialNumber = 12345678;
        int segmentLength = 3;
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
        System.out.println(Arrays.toString(outputArray));
    }
}
