import java.util.Scanner;

public class ProblemOneOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long upperBound, lastNumber, upRemaining, uppersubTotal, upCountDown, lowerbound, lowCountDown, lowersubTotal,
                lowerDifference, testNumber, lowRemaining;
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
                    upRemaining = upCountDown;
                    while (upRemaining > 0) {
                        lastNumber = upRemaining % 10;
                        upRemaining = upRemaining / 10;
                        if (lastNumber == 7) {
                            whetherCriticalPoint = true;
                            break;
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
                        lowRemaining = lowCountDown;
                        while (lowRemaining > 0) {
                            lastNumber = lowRemaining % 10;
                            lowRemaining = lowRemaining / 10;
                            if (lastNumber == 7) {
                                whetherCriticalPoint = true;
                                break;
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
//There will be another version of problem one named as problem four.