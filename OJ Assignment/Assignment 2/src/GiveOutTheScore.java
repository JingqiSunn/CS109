public class GiveOutTheScore {
    public static void main(String[] args) {
        double[] answer = {3.0,6.0,8.0,6.0};
        int [] answerSheet = {2,1,0,0};
        int lengthOfTheAnswer = 4;
        double finalScore = 0.0;
        for (int i = 0; i < lengthOfTheAnswer; i++) {
            if (answerSheet[i]==2){
                finalScore += answer[i];
            }
            else if (answerSheet[i]==0){
                finalScore -= answer[i];
            }
            else if (answerSheet[i]==1){
                finalScore -= answer[i] * 0.5;
            }
        }
        System.out.println(finalScore);
    }
}
