import java.util.Scanner;

public class FindNumberOfCriticalNumbersBetweenABound {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int upperBound, currentNumber, lastNumber, remainer, totalCritcalNumber, lowerBound;
        boolean whetherCriticalNumber;
        whetherCriticalNumber = false;
        totalCritcalNumber = 0;
        System.out.print("Enter the lower bound: ");
        lowerBound = fetch.nextInt();
        System.out.print("Enter the upper bound: ");
        upperBound = fetch.nextInt();
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
                totalCritcalNumber += 1;
            } else {
                totalCritcalNumber += 0;
            }
            currentNumber -= 1;
            whetherCriticalNumber = false;
        }
        System.out.println("The number of critical numbers are " + totalCritcalNumber);
    }
}

