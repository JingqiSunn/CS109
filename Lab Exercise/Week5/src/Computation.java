public class Computation {
    public static int[][] MatrixMultiplication(int[][] matrixA, int[][] matrixB, String[] args) {
        int numberOfRowsOfA = matrixA.length;
        int numberOfColumnsOfA = matrixA[0].length;
        int numberOfRowOfB = matrixB.length;
        int numberOfColumnOfB = matrixB[0].length;
        int numberOfRowOfOutputMatrix = numberOfRowsOfA;
        int numberOfColumnsOfOutputMatrix = numberOfColumnOfB;
        int[][] matrixOutput = new int[numberOfRowOfOutputMatrix][numberOfColumnsOfOutputMatrix];
        if(numberOfColumnsOfA!=numberOfRowOfB) {
            args[0] = "Invalid";
        } else {
            for (int rowOfTheOutputMatrix = 0; rowOfTheOutputMatrix < numberOfRowOfOutputMatrix; rowOfTheOutputMatrix++) {
                for (int columnOfTheOutputMatrix = 0; columnOfTheOutputMatrix < numberOfColumnsOfOutputMatrix; columnOfTheOutputMatrix++) {
                    for (int markerOfThePosition = 0; markerOfThePosition < numberOfColumnsOfA; markerOfThePosition++) {
                        matrixOutput[rowOfTheOutputMatrix][columnOfTheOutputMatrix] += matrixA[rowOfTheOutputMatrix][markerOfThePosition]*matrixB[markerOfThePosition][columnOfTheOutputMatrix];
                    }
                }
            }
        }
        return matrixOutput;
    }
}
