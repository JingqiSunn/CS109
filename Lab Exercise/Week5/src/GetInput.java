import java.util.Scanner;

public class GetInput {
    public static int[][] Matrix(int row, int column, Scanner fetch){
        int[][] matrix = new int[row][column];
        for (int rowSpace = 0; rowSpace < row; rowSpace++) {
            for (int columnSpace = 0; columnSpace < column; columnSpace++) {
                matrix[rowSpace][columnSpace] = fetch.nextInt();
            }
        }
        return matrix;
    }
}
