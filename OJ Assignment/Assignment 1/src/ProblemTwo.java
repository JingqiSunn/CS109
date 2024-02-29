import java.util.Scanner;


public class ProblemTwo {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        long decimalInput, septenaryOutput, numberLeft, currentSeptenaryOutput, layer, series;
        currentSeptenaryOutput = 0;
        layer = 0;
        series = 1;
        System.out.print("Please give me the initial number: ");
        decimalInput = fetch.nextInt();
        numberLeft = decimalInput;
        while (numberLeft > 0) {
            series = powerOfTen(layer);
            currentSeptenaryOutput = currentSeptenaryOutput + (numberLeft % 7)*series;
            numberLeft = numberLeft / 7;
            layer +=1;
        }
        septenaryOutput = currentSeptenaryOutput;
        System.out.println("The corresponding deptenary number is " + septenaryOutput);
    }
    public static long powerOfTen(long power) {
        Scanner fetch = new Scanner(System.in);
        long outPut;
        outPut = 1;
        while (power --> 0) {
            outPut *= 10;
        }
        return outPut;
    }
}
