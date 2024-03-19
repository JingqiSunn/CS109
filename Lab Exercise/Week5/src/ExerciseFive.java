import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        boolean whetherSudoku = true;
        int wholeSudoku[][] = FetchTheWholeSudoku(fetch);
        if ((ExamineTheSubSudoku(wholeSudoku) == true) && (ExamineTheRow(wholeSudoku) == true) && (ExamineTheColumn(wholeSudoku) == true)) {
            whetherSudoku = true;
        } else {
            whetherSudoku = false;
        }
        System.out.println(whetherSudoku);
    }

    public static int[][] FetchTheWholeSudoku(Scanner fetch) {
        int[][] wholeSudoku = new int[9][9];
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                wholeSudoku[row][column] = fetch.nextInt();
            }
        }
        return wholeSudoku;
    }

    public static boolean ExamineTheSubSudoku(int[][] wholeSudoku) {
        boolean whetherValid = true;
        for (int rowPlace = 0; rowPlace < 3; rowPlace++) {
            for (int columnPlace = 0; columnPlace < 3; columnPlace++) {
                int[][] SingleSubSudoku = new int[3][3];
                for (int rowInSubSudoku = 0; rowInSubSudoku < 3; rowInSubSudoku++) {
                    for (int columnSubSudoku = 0; columnSubSudoku < 3; columnSubSudoku++) {
                        SingleSubSudoku[rowInSubSudoku][columnSubSudoku] = wholeSudoku[3 * rowPlace + rowInSubSudoku][3 * columnPlace + columnSubSudoku];
                    }
                }
                if (JudgingTheSingleSudoku(SingleSubSudoku) == false) {
                    whetherValid = false;
                }
            }
        }
        return whetherValid;
    }


    public static boolean ExamineTheRow(int[][] wholeSudoku) {
        boolean whetherValid = true;
        for (int row = 0; row < 9; row++) {
            int[] subRow = wholeSudoku[row];
            int[] recorder = new int[9];
            for (int column = 0; column < 9; column++) {
                recorder[subRow[column] - 1] += 1;
                if (recorder[subRow[column] - 1] == 2) {
                    whetherValid = false;
                }
            }
        }
        return whetherValid;
    }

    public static boolean ExamineTheColumn(int[][] wholeSudoku) {
        boolean whetherValid = true;
        for (int column = 0; column < 9; column++) {
            int[] subColumn = new int[9];
            for (int row = 0; row < 9; row++) {
                subColumn[row] = wholeSudoku[row][column];
            }
            int[] recorder = new int[9];
            for (int i = 0; i < 9; i++) {
                recorder[subColumn[i] - 1] += 1;
                if (recorder[subColumn[i] - 1] == 2) {
                    whetherValid = false;
                }
            }
        }
        return whetherValid;
    }


    public static boolean JudgingTheSingleSudoku(int[][] subSudoku) {
        boolean whetherValid = true;
        int[] recorder = new int[9];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                recorder[subSudoku[row][column] - 1] += 1;
                if (recorder[subSudoku[row][column] - 1] == 2) {
                    whetherValid = false;
                }
            }
        }
        return whetherValid;
    }
}
