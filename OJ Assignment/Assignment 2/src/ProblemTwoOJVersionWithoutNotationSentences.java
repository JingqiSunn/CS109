import java.util.Scanner;

public class ProblemTwoOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int numberInListA, numberInListB, numberInListC, numberOfTheCommon;
        numberOfTheCommon = 0;
        numberInListA = fetch.nextInt();
        int[] ListA = new int[numberInListA];
        for (int i = 0; i < numberInListA; i++) {
            ListA[i] = fetch.nextInt();
        }
        numberInListB = fetch.nextInt();
        int[] ListB = new int[numberInListB];
        for (int i = 0; i < numberInListB; i++) {
            ListB[i] = fetch.nextInt();
        }
        numberInListC = fetch.nextInt();
        int[] ListC = new int[numberInListC];
        for (int i = 0; i < numberInListC; i++) {
            ListC[i] = fetch.nextInt();
        }
        for (int i = 0; i < numberInListA; i++) {
            for (int j = 0; j < numberInListB; j++) {
                if (ListA[i] == ListB[j]) {
                    for (int k = 0; k < numberInListC; k++) {
                        if (ListA[i] == ListC[k]) {
                            numberOfTheCommon += 1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(numberOfTheCommon);
    }
}
