import java.util.Scanner;

public class FindNumberOfCriticalNumbersUnderABound {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int bound, currentNumber, lastNumber, remainer, totalCritcalNumber;
        boolean whetherCriticalNumber;
        whetherCriticalNumber = false;
        totalCritcalNumber = 0;
        System.out.print("Enter the bound: ");
        bound = fetch.nextInt();
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
        System.out.println("The number of critical numbers are " + totalCritcalNumber);
    }
}

