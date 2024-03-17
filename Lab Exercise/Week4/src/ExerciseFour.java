import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int[] staticArray = new int[100];
        while (true){
            int n;
            n = fetch.nextInt() - 1;
            if(n == -1){
                break;
            }
            staticArray[n] += 1;
        }
        for (int i = 0; i < 100; i++) {
            if(staticArray[i]==0){
                continue;
            }
            System.out.printf("%3d occurs %3d times\n", i+1, staticArray[i]);
        }
    }
}
