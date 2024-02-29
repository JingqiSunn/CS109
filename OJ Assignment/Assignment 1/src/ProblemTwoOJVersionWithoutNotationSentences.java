import java.util.Scanner;


public class ProblemTwoOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        long decimalInput, septenaryOutput, numberLeft, currentSeptenaryOutput, layer, series, testTimes;
        testTimes = fetch.nextInt();
        while (testTimes-->0){
            currentSeptenaryOutput = 0;
            layer = 0;
            series = 1;
            decimalInput = fetch.nextInt();
            numberLeft = decimalInput;
            while (numberLeft > 0) {
                series = powerOfTen(layer);
                currentSeptenaryOutput = currentSeptenaryOutput + (numberLeft % 7)*series;
                numberLeft = numberLeft / 7;
                layer +=1;
            }
            septenaryOutput = currentSeptenaryOutput;
            System.out.println(septenaryOutput);
        }}
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
