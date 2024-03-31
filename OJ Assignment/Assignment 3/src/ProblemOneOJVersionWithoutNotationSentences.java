import java.util.Scanner;

public class ProblemOneOJVersionWithoutNotationSentences {
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        fetch.useDelimiter("[,\\s]+");
        int numberOfLinesOfInformation, numberOfCoursesRecorded, numberOfClassroomRecorded;
        boolean whetherValid = true;
        numberOfCoursesRecorded = 0;
        numberOfClassroomRecorded = 0;
        numberOfLinesOfInformation = fetch.nextInt();
        ClassroomInformation[] classroomList = new ClassroomInformation[numberOfLinesOfInformation];
        CourseInformation[] courseList = new CourseInformation[numberOfLinesOfInformation];
        for (int locationAtLinesOfInformation = 0; locationAtLinesOfInformation < numberOfLinesOfInformation; locationAtLinesOfInformation++) {
            if (fetch.next().equals("R")) {
                classroomList[numberOfClassroomRecorded] = new ClassroomInformation(fetch.next(), fetch.nextInt());
                numberOfClassroomRecorded += 1;
            } else {
                courseList[numberOfCoursesRecorded] = new CourseInformation(fetch.next(), fetch.nextInt());
                numberOfCoursesRecorded += 1;
            }
        }
        for (int examinedNumberOfTheCourse = 0; examinedNumberOfTheCourse < numberOfCoursesRecorded; examinedNumberOfTheCourse++) {
            int courseCapacity = courseList[examinedNumberOfTheCourse].getCourseCapacity();
            int availableClassroomsequence = -1;
            int overPeopleNumber = 300;
            if (courseList[examinedNumberOfTheCourse].getCourseType().equals("theory")) {
                for (int checkInTheClassroomList = 0; checkInTheClassroomList < numberOfClassroomRecorded; checkInTheClassroomList++) {
                    if (classroomList[checkInTheClassroomList].getClassroomType().equals("theory")) {
                        if (classroomList[checkInTheClassroomList].getClassroomCapacity() >= courseCapacity && classroomList[checkInTheClassroomList].getClassroomCapacity() - courseCapacity <= overPeopleNumber) {
                            availableClassroomsequence = checkInTheClassroomList;
                            overPeopleNumber = classroomList[checkInTheClassroomList].getClassroomCapacity() - courseCapacity;
                        }
                    }
                }
                if (availableClassroomsequence == -1) {
                    whetherValid = false;
                    break;
                } else {
                    classroomList[availableClassroomsequence].setClassroomCapacity(0);
                    continue;
                }
            }
            if (courseList[examinedNumberOfTheCourse].getCourseType().equals("lab")) {
                for (int checkInTheClassroomList = 0; checkInTheClassroomList < numberOfClassroomRecorded; checkInTheClassroomList++) {
                    if (classroomList[checkInTheClassroomList].getClassroomType().equals("lab")) {
                        if (classroomList[checkInTheClassroomList].getClassroomCapacity() >= courseCapacity && classroomList[checkInTheClassroomList].getClassroomCapacity() - courseCapacity <= overPeopleNumber) {
                            availableClassroomsequence = checkInTheClassroomList;
                            overPeopleNumber = classroomList[checkInTheClassroomList].getClassroomCapacity() - courseCapacity;
                        }
                    }
                }
                if (availableClassroomsequence == -1) {
                    whetherValid = false;
                    break;
                } else {
                    classroomList[availableClassroomsequence].setClassroomCapacity(0);
                    continue;
                }
            }
            if (courseList[examinedNumberOfTheCourse].getCourseType().equals("art")) {
                for (int checkInTheClassroomList = 0; checkInTheClassroomList < numberOfClassroomRecorded; checkInTheClassroomList++) {
                    if (classroomList[checkInTheClassroomList].getClassroomType().equals("art")) {
                        if (classroomList[checkInTheClassroomList].getClassroomCapacity() >= courseCapacity && classroomList[checkInTheClassroomList].getClassroomCapacity() - courseCapacity <= overPeopleNumber) {
                            availableClassroomsequence = checkInTheClassroomList;
                            overPeopleNumber = classroomList[checkInTheClassroomList].getClassroomCapacity() - courseCapacity;
                        }
                    }
                }
                if (availableClassroomsequence == -1) {
                    whetherValid = false;
                    break;
                } else {
                    classroomList[availableClassroomsequence].setClassroomCapacity(0);
                    continue;
                }
            }
        }
        if (whetherValid == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
