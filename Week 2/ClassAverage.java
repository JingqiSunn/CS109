import java.util.Scanner;
public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalGrade = 0;
        int gradeCounter = 1;
        double average;
        while(gradeCounter <= 10) {
            System.out.println("The Grade: ");
            int grade = input.nextInt();
            totalGrade += grade;
            gradeCounter += 1;
        }
        average = totalGrade / 10 + totalGrade % 10;
        System.out.printf("\n The Total score of the class is %.2f", totalGrade);
        System.out.printf("\n The average grade of the class is %.2f \n", average);
    }
}