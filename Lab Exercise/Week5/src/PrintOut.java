public class PrintOut {
    public static void Matrix(int[][] inputMatrix) {
        int numberOfRows = inputMatrix.length;
        int numberOfColumns = inputMatrix[0].length;
        for (int currentRow = 0; currentRow < numberOfRows; currentRow++) {
            for (int currentColumn = 0; currentColumn < numberOfColumns; currentColumn++) {
                System.out.printf("%4d\t", inputMatrix[currentRow][currentColumn]);
            }
            System.out.printf("%n");
        }
    }
}
