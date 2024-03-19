import java.util.Arrays;
import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        args = new String[1];
        Scanner fetch = new Scanner(System.in);
        System.out.println("Give me the number of the matrix: ");
        int numberOfTheMatrix = fetch.nextInt();
        System.out.println("Give me the number of the rows: ");
        int numberOfTheRows = fetch.nextInt();
        System.out.println("Give me the number of the columns: ");
        int numberOfTheColumns = fetch.nextInt();
        int[][] currentMatrix = GetInput.Matrix(numberOfTheRows, numberOfTheColumns, fetch);
        for (int sequence = 1; sequence < numberOfTheMatrix; sequence++) {
            System.out.println("Give me the number of the rows: ");
            numberOfTheRows = fetch.nextInt();
            System.out.println("Give me the number of the columns: ");
            numberOfTheColumns = fetch.nextInt();
            int[][] nextMatrix = GetInput.Matrix(numberOfTheRows, numberOfTheColumns, fetch);
            currentMatrix = Computation.MatrixMultiplication(currentMatrix, nextMatrix, args);
        }
        if (args[0] == "Invalid"){
            System.out.println("The process of the matrix multiplication is invalid!");
        } else {
            System.out.println("The multiplication of all the matrix is: ");
            PrintOut.Matrix(currentMatrix);
        }
    }
}
