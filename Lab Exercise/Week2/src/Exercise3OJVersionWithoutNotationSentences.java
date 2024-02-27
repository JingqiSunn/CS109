import java.util.Scanner;

public class Exercise3OJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, T, M, sum, s, difference, n;
        N = input.nextInt();
        T = input.nextInt();
        M = input.nextInt();
        while (T-- > 0) {
            n = N;
            sum = 0;
            while (n-- > 0) {
                s = input.nextInt();
                sum += s;
            }
            difference = sum - M;
            System.out.printf("\n%d",difference);
        }
    }
}