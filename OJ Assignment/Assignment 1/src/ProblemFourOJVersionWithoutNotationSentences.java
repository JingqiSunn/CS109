import java.util.Scanner;

public class ProblemFourOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int upperBound, lowerBound, upperNumber, lowerNumber, finalCriticalNumber, testTimes;
        testTimes = fetch.nextInt();
        while (testTimes-- > 0) {
            lowerBound = fetch.nextInt();
            upperBound = fetch.nextInt();
            upperNumber = findNumberOfCriticalNumbersUnderABound(upperBound);
            lowerNumber = findNumberOfCriticalNumbersUnderABound(lowerBound - 1);
            finalCriticalNumber = upperNumber - lowerNumber;
            System.out.println(finalCriticalNumber);
        }
    }


    public static int findNumberOfCriticalNumbersUnderABound(int bound) {
        int currentNumber, lastNumber, remainer, totalCritcalNumber;
        boolean whetherCriticalNumber;
        whetherCriticalNumber = false;
        totalCritcalNumber = 0;
        currentNumber = bound;
        while (currentNumber >= 0) {
            if (currentNumber % 7 == 0) {
                whetherCriticalNumber = true;
            } else {
                remainer = currentNumber;
                while (remainer > 0) {
                    lastNumber = remainer % 10;
                    remainer = remainer / 10;
                    if (lastNumber == 7) {
                        whetherCriticalNumber = true;
                        break;
                    }
                }
            }
            if (whetherCriticalNumber == true) {
                totalCritcalNumber += 1;
            } else {
                totalCritcalNumber += 0;
            }
            currentNumber -= 1;
            whetherCriticalNumber = false;
        }
        return totalCritcalNumber;
    }
}