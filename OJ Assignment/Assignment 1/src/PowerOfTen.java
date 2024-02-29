import java.util.Scanner;

public class PowerOfTen {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        long power, outPut;
        outPut = 1;
        System.out.print("Please give me the value of the power: ");
        power = fetch.nextInt();
        while (power --> 0) {
            outPut *= 10;
        }
        System.out.print("The result is " + outPut);
    }
}
