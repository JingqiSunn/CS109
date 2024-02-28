import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total, upperBound, lastNumber, remaining;
        total = 0;
        System.out.print("Please give us the upperbound: ");
        upperBound = input.nextInt();
        if(upperBound % 7 == 0) {
            total += 1;
        } else {
            remaining = upperBound;
            while(remaining > 0) {
                lastNumber = remaining % 10;
                remaining = remaining / 10;
                if (lastNumber == 7){
                    total += 1;
                } else {
                    total = total;
                }
            }
        }
        System.out.printf("The total number of critical numbers are %d", total);
    }
}
