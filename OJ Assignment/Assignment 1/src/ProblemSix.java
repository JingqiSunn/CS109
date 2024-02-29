import java.util.Scanner;

public class ProblemSix {
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
        long bigCurrentYear,daysBetweenYears;
        daysBetweenYears = 0;
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