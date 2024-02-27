import java.util.Scanner;

public class Exercise3OJVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, T, M, sum, s, difference, n;
        System.out.print("The number of the numbers you are going to put in: ");
        N = input.nextInt();
        System.out.print("The number of times you want to take tests: ");
        T = input.nextInt();
        System.out.print("The number you want to compared with: ");
        M = input.nextInt();
        while (T-- > 0) {
            n = N;
            sum = 0;
            while (n-- > 0) {
                System.out.print("Please give me a number to add in: ");
                s = input.nextInt();
                sum += s;
            }
            difference = sum - M;
            System.out.printf("The difference between the sum is %d \n", difference);
        }
    }
}
