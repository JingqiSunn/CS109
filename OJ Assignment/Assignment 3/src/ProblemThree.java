import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int yWidth = fetch.nextInt();
        int xWidth = fetch.nextInt();
        int startXCoordinate = 0;
        int startYCoordinate = 0;
        int operatingLayer = 1;
        int numberOfGridsPassed = 0;
        Grid[][] map = new Grid[yWidth][xWidth];
        for (int yComponent = 0; yComponent < yWidth; yComponent++) {
            for (int xComponent = 0; xComponent < xWidth; xComponent++) {
                map[yComponent][xComponent] = new Grid(fetch.nextInt());
            }
        }
        boolean whetherStopThisLoop = false;
        int startPoint = fetch.nextInt();
        int yComponent = 0;
        while (whetherStopThisLoop == false && yComponent < yWidth) {

            for (int xComponent = 0; xComponent < xWidth; xComponent++) {
                if (map[yComponent][xComponent].getSequence() == startPoint) {
                    startXCoordinate = xComponent;
                    startYCoordinate = yComponent;
                    whetherStopThisLoop = true;
                    break;
                }

            }
            yComponent += 1;
        }
        int totalPassedGrids = fetch.nextInt();
        int xCoordinate = startXCoordinate;
        int yCoordinate = startYCoordinate;
        int operatingCeil;
        boolean whetherStopTheLoop = false;
        while (whetherStopTheLoop == false) {
            if (operatingLayer % 2 == 1) {
                operatingCeil = (operatingLayer + 1) / 2;
            } else {
                operatingCeil = operatingLayer / 2;
            }
            for (int operatingSubSequence = 0; operatingSubSequence < operatingCeil; operatingSubSequence++) {
                int remainer = operatingLayer % 4;
                if (remainer == 1) {
                    xCoordinate += 1;
                } else if (remainer == 2) {
                    yCoordinate += 1;
                } else if (remainer == 3) {
                    xCoordinate -= 1;
                } else {
                    yCoordinate -= 1;
                }
                if (-1 < xCoordinate && xCoordinate < xWidth && -1 < yCoordinate && yCoordinate < yWidth) {
                    numberOfGridsPassed += 1;
                }
                if (numberOfGridsPassed == totalPassedGrids) {
                    System.out.println(map[yCoordinate][xCoordinate].getSequence());
                    whetherStopTheLoop = true;
                    break;
                }
            }
            operatingLayer += 1;


        }
    }

}