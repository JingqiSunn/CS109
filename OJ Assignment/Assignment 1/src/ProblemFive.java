import java.util.Scanner;

public class ProblemFive {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int upBound, lowBound, numberOfCriticalNumberBetween;
        System.out.print("Please give me the low bound: ");
        lowBound = fetch.nextInt();
        System.out.print("Please give me the up bound: ");
        upBound = fetch.nextInt();
        numberOfCriticalNumberBetween = FindNumberOfCriticalNumbersBetweenABound(lowBound, upBound);
        System.out.println(numberOfCriticalNumberBetween);
    }

    public static int FindNumberOfCriticalNumbersBetweenABound(int lowerBound,int upperBound) {
        int currentNumber, lastNumber, remainer, totalCritcalNumbers;
        boolean whetherCriticalNumber;
        whetherCriticalNumber = false;
        totalCritcalNumbers = 0;
        currentNumber = upperBound;
        while (currentNumber >= lowerBound) {
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
                totalCritcalNumbers += 1;
            } else {
                totalCritcalNumbers += 0;
            }
            currentNumber -= 1;
            whetherCriticalNumber = false;
        }
        return totalCritcalNumbers;
    }
}
