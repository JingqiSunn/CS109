import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upperBound, lastNumber, remaining, uppersubTotal, upCountDown;
        Boolean whetherCriticalPoint;
        whetherCriticalPoint = false;
        uppersubTotal = 0;
        System.out.print("Please give us the upperbound: ");
        upperBound = input.nextInt();
        upCountDown = upperBound;
        while (upCountDown > 0) {
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
        System.out.printf("The total number of critical numbers are %d", uppersubTotal);
    }
}
