import java.util.Scanner;

public class ProblemOneOJVersionWithoutNotationSentence {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int numberOfTheTest;
        int scoreOfQi, scoreOfCompetitor;
        numberOfTheTest = fetch.nextInt();
        int[] answer = new int[numberOfTheTest];
        int[] answerSheetOfQi = new int[numberOfTheTest];
        int[] answerSheetOfCompetitor = new int[numberOfTheTest];
        for (int i = 0; i < numberOfTheTest; i++) {
            answer[i] = fetch.nextInt()*2;
        }
        for (int i = 0; i < numberOfTheTest; i++) {
            answerSheetOfQi[i] = fetch.nextInt();
        }
        for (int i = 0; i < numberOfTheTest; i++) {
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


    public static int GiveOutTheScore(int[] answer, int[] answerSheet, int lengthOfTheAnswer) {
        int finalScore = 0;
        for (int i = 0; i < lengthOfTheAnswer; i++) {
            if (answerSheet[i] == 2) {
                finalScore += answer[i];
            } else if (answerSheet[i] == 1) {
                finalScore -= answer[i];
            } else if (answerSheet[i] == 0) {
                finalScore -= answer[i] /2;
            }
        }
        return finalScore;
    }
}