import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upperBound, lastNumber, remaining, subTotal;
        Boolean whetherCriticalPoint;
        whetherCriticalPoint = false;
        System.out.print("Please give us the upperbound: ");
        upperBound = input.nextInt();
        if (upperBound % 7 == 0) {
            whetherCriticalPoint = true;
        } else {
            remaining = upperBound;
            while (remaining > 0) {
                lastNumber = remaining % 10;
                remaining = remaining / 10;
                if (lastNumber == 7) {
                    whetherCriticalPoint = true;
                }
            }
        }
        if (whetherCriticalPoint == true) {
            subTotal = 1;
        } else {
            subTotal = 0;
        }
        System.out.printf("The total number of critical numbers are %d", subTotal);
    }
}
