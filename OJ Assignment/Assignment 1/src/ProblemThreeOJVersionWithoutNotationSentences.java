import java.util.Scanner;

public class ProblemThreeOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        long smallerYear, biggerYear, smallerMonth, biggerMonth, smallerDay, biggerDay, differenceInDays, testTimes;
        testTimes = fetch.nextLong();
        while (testTimes-- > 0) {
            smallerYear = fetch.nextLong();
            smallerMonth = fetch.nextLong();
            smallerDay = fetch.nextLong();
            biggerYear = fetch.nextLong();
            biggerMonth = fetch.nextLong();
            biggerDay = fetch.nextLong();
            differenceInDays = daysBetweenYears(smallerYear, biggerYear) + daysInNeedToReachTheIntegralYears(biggerDay, biggerMonth, biggerYear) - daysInNeedToReachTheIntegralYears(smallerDay, smallerMonth, smallerYear);
            System.out.println(differenceInDays);
        }
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
