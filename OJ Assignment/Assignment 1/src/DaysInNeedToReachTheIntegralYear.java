import java.util.Scanner;

public class DaysInNeedToReachTheIntegralYear {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        long day, month, year, daysInNeed;
        daysInNeed = 0;
        System.out.print("Please give me the day: ");
        day = fetch.nextLong();
        System.out.print("Please give me the month: ");
        month = fetch.nextLong();
        System.out.print("Please give me the year: ");
        year = fetch.nextLong();
        if (year % 13 == 0) {
            daysInNeed = (month-1)*61 + day;
            if (month > 5) {
                daysInNeed +=2;
            } else if (month > 3){
                daysInNeed ++;
            }
        }
        if (year % 13 != 0) {
            daysInNeed = (month-1)*61 + day;
            if (month > 5) {
                daysInNeed ++;
            }
        }
        System.out.print("The number of days needed to get the integer year is: " + daysInNeed);
    }
}
