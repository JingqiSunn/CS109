public class JudgingSubSudoku {
    public static void main(String[] args) {
        boolean whetherValid = true;
        int[][] subSudoku = {{1,3,4},{6,7,5},{2,8,9}};
        int[] recorder = new int[9];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                recorder[subSudoku[row][column]-1] +=1;
                if (recorder[subSudoku[row][column]-1]==2){
                    whetherValid = false;
                }
            }
        }
        System.out.println(whetherValid);
    }
}
