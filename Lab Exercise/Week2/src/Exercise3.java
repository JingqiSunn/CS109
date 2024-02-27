import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, M, sum, s, difference;
        sum = 0;
        System.out.print("The number of the numbers you are going to put in: ");
        N = input.nextInt();
        System.out.print("The number you want to compared with: ");
        M = input.nextInt();
        while(N -- > 0 ) {
            System.out.print("Please give me a number to add in: ");
            s = input.nextInt();
            sum += s;
        }
        difference = sum - M;
        System.out.printf("The difference between the sum is %d ", difference);
    }
}
