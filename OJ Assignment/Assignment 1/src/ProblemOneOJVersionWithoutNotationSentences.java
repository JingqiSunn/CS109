import java.util.Scanner;

public class ProblemOneOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upperBound, lastNumber, remaining, uppersubTotal, upCountDown, lowerbound, lowCountDown, lowersubTotal,
                lowerDifference, testNumber;
        Boolean whetherCriticalPoint;
        whetherCriticalPoint = false;
        testNumber = input.nextInt();
        while (testNumber-- > 0) {
            uppersubTotal = 0;
            lowersubTotal = 0;
            lowerbound = input.nextInt();
            upperBound = input.nextInt();
            upCountDown = upperBound;
            lowCountDown = lowerbound - 1;
            while (upCountDown > -1) {
                if (upCountDown % 7 == 0) {
                    whetherCriticalPoint = true;
                } else {
                    remaining = upCountDown;
                    while (remaining > 0) {
                        lastNumber = remaining % 10;
                        remaining = remaining / 10;
                        if (lastNumber == 7) {
                            whetherCriticalPoint = true;
                        }
                    }
                }
                if (whetherCriticalPoint == true) {
                    uppersubTotal += 1;
                } else {
                    uppersubTotal += 0;
                }
                upCountDown -= 1;
                whetherCriticalPoint = false;
            }
            whetherCriticalPoint = false;

                while (lowCountDown > -2) {
                    if (lowCountDown % 7 == 0) {
                        whetherCriticalPoint = true;
                    } else {
                        remaining = lowCountDown;
                        while (remaining > 0) {
                            lastNumber = remaining % 10;
                            remaining = remaining / 10;
                            if (lastNumber == 7) {
                                whetherCriticalPoint = true;
                            }
                        }
                    }
                    if (whetherCriticalPoint == true) {
                        lowersubTotal += 1;
                    } else {
                        lowersubTotal += 0;
                    }
                    lowCountDown -= 1;
                    whetherCriticalPoint = false;
                }

            lowerDifference = uppersubTotal - lowersubTotal;
            System.out.println(lowerDifference);
        }
    }
}
