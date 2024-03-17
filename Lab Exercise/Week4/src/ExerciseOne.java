import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int n = fetch.nextInt();
        double[] myListOne = new double[n];
        double[] myListTwo = new double[n];
        for (int i = 1; i < n; i++) {
            myListOne[i-1] = myListTwo[i];
        }
    }
}
