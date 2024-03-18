import java.util.Scanner;

public class ProblemTwoOJVersion {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int numberInListA, numberInListB, numberInListC, numberOfTheCommon;
        numberOfTheCommon = 0;
        System.out.println("Give me the number of the movie");
        numberInListA = fetch.nextInt();
        int[] ListA= new int[numberInListA];
        for (int i = 0; i < numberInListA; i++) {
            System.out.println("Give me the next number of the sequence of the movie: ");
            ListA[i] = fetch.nextInt();
        }
        System.out.println("Give me the number of the movie");
        numberInListB = fetch.nextInt();
        int[] ListB= new int[numberInListB];
        for (int i = 0; i < numberInListB; i++) {
            System.out.println("Give me the next number of the sequence of the movie: ");
            ListB[i] = fetch.nextInt();
        }
        System.out.println("Give me the number of the movie");
        numberInListC = fetch.nextInt();
        int[] ListC= new int[numberInListC];
        for (int i = 0; i < numberInListC; i++) {
            System.out.println("Give me the next number of the sequence of the movie: ");
            ListC[i] = fetch.nextInt();
        }
        for (int i = 0; i < numberInListA; i++) {
            for (int j = 0; j < numberInListB; j++) {
                if(ListA[i]==ListB[j]){
                    for (int k = 0; k < numberInListC; k++) {
                        if(ListA[i]==ListC[k]){
                            numberOfTheCommon +=1;
                            break;}
                    }
                }
            }
        }
        System.out.println(numberOfTheCommon);
    }
}
