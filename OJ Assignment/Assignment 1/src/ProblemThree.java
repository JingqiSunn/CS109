import java.util.Scanner;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        long smallerYear, biggerYear, smallerMonth, biggerMonth, smallerDay, biggerDay, differenceInDays;
        System.out.print("Give me the smaller year: ");
        smallerYear = fetch.nextLong();
        System.out.print("Give me the smaller month: ");
        smallerMonth = fetch.nextLong();
        System.out.print("Give me the smaller day: ");
        smallerDay = fetch.nextLong();
        System.out.print("Give me the bigger year: ");
        biggerYear = fetch.nextLong();
        System.out.print("Give me the bigger month: ");
        biggerMonth = fetch.nextLong();
        System.out.print("Give me the bigger day: ");
        biggerDay = fetch.nextLong();
        differenceInDays = daysBetweenYears(smallerYear, biggerYear) + daysInNeedToReachTheIntegralYears(biggerDay, biggerMonth, biggerYear) - daysInNeedToReachTheIntegralYears(smallerDay, smallerMonth, smallerYear);
        System.out.print("The difference in days are " + differenceInDays);
    }


    public static long daysBetweenYears(long littleYear, long bigYear) {
        Scanner fetch = new Scanner(System.in);
        long smallToTheYearOfConvenience, bigToTheYearOfConvenience, littleCurrentYear, bigCurrentYear, daysBetweenYears;
        smallToTheYearOfConvenience = 0;
        bigToTheYearOfConvenience = 0;
        littleCurrentYear = littleYear;
        bigCurrentYear = bigYear;
        while (littleCurrentYear % 13 != 1) {
            littleCurrentYear--;
            smallToTheYearOfConvenience++;
        }
        while (bigCurrentYear % 13 != 1) {
            bigCurrentYear--;
            bigToTheYearOfConvenience++;
        }
        daysBetweenYears = (bigCurrentYear - littleCurrentYear) / 13 * 11909 - smallToTheYearOfConvenience * 916 + bigToTheYearOfConvenience * 916;
        return daysBetweenYears;
    }


    public static long daysInNeedToReachTheIntegralYears(long day, long month, long year) {
        Scanner fetch = new Scanner(System.in);
        long daysInNeed;
        daysInNeed = 0;
        if (year % 13 == 0) {
            daysInNeed = (month - 1) * 61 + day;
            if (month > 5) {
                daysInNeed += 2;
            } else if (month > 3) {
                daysInNeed++;
            }
        }
        if (year % 13 != 0) {
            daysInNeed = (month - 1) * 61 + day;
            if (month > 5) {
                daysInNeed++;
            }
        }
        return daysInNeed;
    }
}
