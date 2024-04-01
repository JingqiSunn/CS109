import java.math.BigInteger;
import java.util.Scanner;

public class ProblemFive {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        String theInitialInteger = fetch.next();
        int segmentLength = fetch.nextInt();
        String[] theSeperateVersionOfTheInteger = SingleStringToSeperatedString(theInitialInteger,segmentLength);
        String[] TheReversedSeperatedVersionOfTheInteger = ReverseEveryIntegersInTheString(theSeperateVersionOfTheInteger);
        BigInteger sumOfNumber = SumUpEveryPartsOfTheStringinString(TheReversedSeperatedVersionOfTheInteger);
        System.out.println(sumOfNumber);
    }
    public static String[] SingleStringToSeperatedString(String theInitialInteger, int segmentLength) {
        int lengthOfInitialNumber = theInitialInteger.length();
        int lengthOfTheArray = (int) Math.ceil((double) lengthOfInitialNumber / (double) segmentLength);
        int errorInLength = lengthOfTheArray * segmentLength - lengthOfInitialNumber;
        String[] outputArray = new String[lengthOfTheArray];
        for (int computationTime = 0; computationTime < lengthOfTheArray; computationTime++) {
            if (computationTime != lengthOfTheArray - 1) {
                outputArray[computationTime] = theInitialInteger.substring(computationTime * segmentLength, computationTime * segmentLength + segmentLength);
            } else {
                outputArray[computationTime] = theInitialInteger.substring(computationTime * segmentLength, lengthOfInitialNumber);
            }
        }
        return outputArray;
    }

    public static BigInteger SumUpEveryPartsOfTheStringinString(String[] inputArray){
        BigInteger sumOfTheString = BigInteger.ZERO;
        int lengthOfTheInputArray = inputArray.length;
        for (int LocationAtTheString = 0; LocationAtTheString < lengthOfTheInputArray; LocationAtTheString++) {
            BigInteger newNumberToBeSumedUp = new BigInteger(inputArray[LocationAtTheString]);
            sumOfTheString = sumOfTheString.add(newNumberToBeSumedUp);
        }
        return sumOfTheString;
    }
    public static String ReverseAString(String inputString){
        char[] inputInteger = inputString.toCharArray();
        int lengthOfTheInteger = inputInteger.length;
        char[] outputInteger = new char[lengthOfTheInteger];
        for (int locationAtTheInputInteger = 0; locationAtTheInputInteger <lengthOfTheInteger ; locationAtTheInputInteger++) {
            int locationAtTheOutputInteger = lengthOfTheInteger - 1 - locationAtTheInputInteger;
            outputInteger[locationAtTheOutputInteger]=inputInteger[locationAtTheInputInteger];
        }
        String outputString = new String(outputInteger);
        return outputString;
    }

    public static String[] ReverseEveryIntegersInTheString(String[] inputString){
        int lengthOfTheString = inputString.length;
        String[] outputString = new String[lengthOfTheString];
        for (int locationAtTheString = 0; locationAtTheString < lengthOfTheString; locationAtTheString++) {
            outputString[locationAtTheString]= ReverseAString(inputString[locationAtTheString]);
        }
        return outputString;
    }
}
