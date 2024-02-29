import java.util.Scanner;

public class TheDaysBetweenYearsVersionTwo {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        long littleYear, bigYear, bigCurrentYear,daysBetweenYears;
        daysBetweenYears = 0;
        System.out.print("Give me the smaller year: ");
        littleYear = fetch.nextLong();
        System.out.print("Give me the bigger year: ");
        bigYear = fetch.nextLong();
        bigCurrentYear = bigYear;
        while (bigCurrentYear >(littleYear + 13)){
            bigCurrentYear-=13;
            daysBetweenYears += 11909;
        }
        while (bigCurrentYear - littleYear != 0){
            if ((bigCurrentYear-1)%13!=0){
                bigCurrentYear--;
                daysBetweenYears+= 916;
            } else {
                bigCurrentYear--;
                daysBetweenYears+=917;
            }
        }

        System.out.print("The number of days between these two years are " + daysBetweenYears);
    }
}
