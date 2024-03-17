import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        double min, max, sum, average, finalSum;
        sum = 0.0;
        double [] scoreList = new double[10];
        System.out.print("Please input 10 scores of these students: ");
        scoreList[0] = fetch.nextDouble();
        min = scoreList[0];
        max = scoreList[0];
        sum = scoreList[0];
        for (int i = 1; i< 10; i++){
            scoreList[i] = fetch.nextDouble();
            if (scoreList[i]>max) {
                max = scoreList[i];
            }
            if (scoreList[i]<min) {
                min = scoreList[i];
            }
            sum += scoreList[i];
        }
        finalSum = sum - max - min;
        average = finalSum / 8.0;
        System.out.println("Average score is " + average);
    }
}
