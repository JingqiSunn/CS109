import java.util.Scanner;

public class WhetherTheStringHasUniqueLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Show me your String: ");
        String targetString = scanner.nextLine();
        System.out.println(ExamineWhetherUnique(targetString));
    }
    public static boolean ExamineWhetherUnique(String targetString){
        char[] arrayVersionOfTheOriginalString = targetString.toCharArray();
        for(int i=0;i<arrayVersionOfTheOriginalString.length-1;i++){
            for(int j=i+1;j<arrayVersionOfTheOriginalString.length;j++){
                if(arrayVersionOfTheOriginalString[i]==arrayVersionOfTheOriginalString[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
