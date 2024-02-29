import java.util.Scanner;

public class TheDaysBetweenYears {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        long littleYear, bigYear, smallToTheYearOfConvenience, bigToTheYearOfConvenience, littleCurrentYear, bigCurrentYear,daysBetweenYears;
        smallToTheYearOfConvenience = 0;
        bigToTheYearOfConvenience = 0;
        System.out.print("Give me the smaller year: ");
        littleYear = fetch.nextLong();
        System.out.print("Give me the bigger year: ");
        bigYear = fetch.nextLong();
        littleCurrentYear = littleYear;
        bigCurrentYear = bigYear;
        while (littleCurrentYear % 13 != 1){
            littleCurrentYear --;
            smallToTheYearOfConvenience ++;
        }
        while (bigCurrentYear % 13 != 1){
            bigCurrentYear --;
            bigToTheYearOfConvenience ++;
        }
        daysBetweenYears = (bigCurrentYear - littleCurrentYear)/13* 11909-smallToTheYearOfConvenience*916+bigToTheYearOfConvenience*916;
        System.out.print("The number of days between these two years are " + daysBetweenYears);
    }
}
