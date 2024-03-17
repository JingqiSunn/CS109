import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int numberOfNumbers;
        System.out.println("How many numbers you will input: ");
        numberOfNumbers = fetch.nextInt();
        int[] numberArray = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            numberArray[i] = fetch.nextInt();
        }
        for (int i = 0; i < numberOfNumbers-1; i++) {
            if (numberArray[i] > numberArray[i + 1]) {
                int temporary;
                temporary = numberArray[i];
                numberArray[i] = numberArray[i + 1];
                numberArray[i + 1] = temporary;
                i = 0;
            }
        }
        for (int i = numberOfNumbers-1; i > 0; i--) {
            if (numberArray[i] < numberArray[i - 1]) {
                int temporary;
                temporary = numberArray[i];
                numberArray[i] = numberArray[i - 1];
                numberArray[i - 1] = temporary;
                i = numberOfNumbers-1;
            }
        }
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.printf("%d ", numberArray[i]);
        }
    }
}
