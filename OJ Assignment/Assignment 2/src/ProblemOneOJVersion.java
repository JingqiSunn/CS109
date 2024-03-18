import java.util.Scanner;

public class ProblemOneOJVersion {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int numberOfTheTest;
        double scoreOfQi, scoreOfCompetitor;
        System.out.println("Please give me the number of the questions: ");
        numberOfTheTest = fetch.nextInt();
        double[] answer = new double[numberOfTheTest];
        int[] answerSheetOfQi = new int[numberOfTheTest];
        int[] answerSheetOfCompetitor = new int[numberOfTheTest];
        for (int i = 0; i < numberOfTheTest; i++) {
            System.out.println("Please give me the answer of the question: ");
            answer[i] = fetch.nextDouble();
        }
        for (int i = 0; i < numberOfTheTest; i++) {
            System.out.println("Please give me the answer of the question: ");
            answerSheetOfQi[i] = fetch.nextInt();
        }
        for (int i = 0; i < numberOfTheTest; i++) {
            System.out.println("Please give me the answer of the question: ");
            answerSheetOfCompetitor[i] = fetch.nextInt();
        }
        scoreOfQi = GiveOutTheScore(answer, answerSheetOfQi, numberOfTheTest);
        scoreOfCompetitor = GiveOutTheScore(answer, answerSheetOfCompetitor, numberOfTheTest);
        if (scoreOfQi > scoreOfCompetitor) {
            System.out.println("Qi won");
        } else if (scoreOfQi < scoreOfCompetitor) {
            System.out.println("Qi lost");
        } else {
            System.out.println("Qi need another round");
        }
    }


    public static double GiveOutTheScore(double[] answer, int[] answerSheet, int lengthOfTheAnswer) {
        double finalScore = 0.0;
        for (int i = 0; i < lengthOfTheAnswer; i++) {
            if (answerSheet[i] == 2) {
                finalScore += answer[i];
            } else if (answerSheet[i] == 0) {
                finalScore -= answer[i];
            } else if (answerSheet[i] == 1) {
                finalScore -= answer[i] * 0.5;
            }
        }
        return finalScore;
    }
}