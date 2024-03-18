import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemThreeOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int totalInNeed, totalAvailable, numberOfTheRows, numberOfTheColumns, numberOfDataPoints;
        totalInNeed = fetch.nextInt();
        totalAvailable = 0;
        numberOfTheRows = fetch.nextInt();
        numberOfTheColumns = fetch.nextInt();
        numberOfDataPoints = numberOfTheRows * numberOfTheColumns;
        int[] dataPointInformationArray = new int[numberOfDataPoints];
        for (int i = 0; i < numberOfDataPoints; i++) {
            dataPointInformationArray[i] = fetch.nextInt();
        }
        for (int j = 0; j < numberOfTheColumns; j++) {
            int[] currentColumn = new int[numberOfTheRows];
            for (int i = 0; i < numberOfTheRows; i++) {
                int locationOfTheInformation = i * numberOfTheColumns + j;
                currentColumn[i] = dataPointInformationArray[locationOfTheInformation];
            }
            totalAvailable += AnalyzingTheAvailableSpaceColumns(currentColumn);
        }
        if (totalAvailable >= totalInNeed) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }


    public static int AnalyzingTheAvailableSpaceColumns(int[] array) {
        int lengthOfTheColumn = array.length;
        int availableSpaceInThisColumn = 0;
        if (array[0] == 0 && array[1] == 0) {
            availableSpaceInThisColumn += 1;
            array[0] = 1;
        }
        for (int i = 1; i < lengthOfTheColumn - 1; i++) {
            if (array[i - 1] == 0 && array[i] == 0 && array[i + 1] == 0) {
                availableSpaceInThisColumn += 1;
                array[i] = 1;
            }
        }
        if (array[lengthOfTheColumn - 1] == 0 && array[lengthOfTheColumn - 2] == 0) {
            availableSpaceInThisColumn += 1;
            array[lengthOfTheColumn - 1] = 1;
        }
        return availableSpaceInThisColumn;
    }
}