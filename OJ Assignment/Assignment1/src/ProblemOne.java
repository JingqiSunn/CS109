import java.util.*;
public class ProblemOne {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        int l, r, upperLimit, lowerLimit;
        System.out.print("What is the smaller boundary: ");
        l = fetch.nextInt();
        System.out.print("What is the bigger boundary: ");
        r = fetch.nextInt();
        upperLimit = r;
        lowerLimit = l - 1;
    }
}
