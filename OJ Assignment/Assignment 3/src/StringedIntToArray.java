import java.util.Arrays;
import java.util.Scanner;

public class StringedIntToArray {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        String theInitialInteger = fetch.next();
        int segmentLength = fetch.nextInt();
        String theInitialIntegerToComputeWith = theInitialInteger;
        int lengthOfInitialNumber = theInitialInteger.length();
        int lengthOfTheArray = (int) Math.ceil((double) lengthOfInitialNumber/(double) segmentLength);
        int errorInLength = lengthOfTheArray * segmentLength - lengthOfInitialNumber;
        int[] outputArray = new int[lengthOfTheArray];
        for (int computationTime = 0; computationTime < lengthOfTheArray; computationTime++) {
            if(computationTime != lengthOfTheArray-1){
                outputArray[computationTime]= Integer.parseInt(theInitialInteger.substring(computationTime*segmentLength,computationTime*segmentLength+segmentLength));
            } else{
                outputArray[computationTime]= Integer.parseInt(theInitialInteger.substring(computationTime*segmentLength,lengthOfInitialNumber));
            }
        }
        System.out.println(Arrays.toString(outputArray));
    }
}
