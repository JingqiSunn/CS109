import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class CourseManager {
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private boolean ifOpen;

    public CourseManager() {
    }

    public void setIfOpen(boolean ifOpen) {
        this.ifOpen = ifOpen;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public boolean getIfOpen() {
        return ifOpen;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setCourseManager(this);
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setCourseManager(this);
    }

    public boolean enrollStudentInCourse(Student student, String courseId, int credits) {
        boolean whetherValid = true;
        int numberOfTheTotalCourse = courses.size();
        int positionInTheCourseList = 0;
        if (ifOpen == false) {
            whetherValid = false;
        }
        if (whetherValid == true) {
            boolean whetherTrueHere = false;
            for (positionInTheCourseList = 0; positionInTheCourseList < numberOfTheTotalCourse; positionInTheCourseList++) {
                if (courseId.equals(courses.get(positionInTheCourseList).getCourseID())) {
                    whetherTrueHere = true;
                    break;
                }
            }
            whetherValid = whetherTrueHere;
        }
        if (whetherValid == true) {
            int numberOfTheStudentsEnrolledInThisCourse = courses.get(positionInTheCourseList).getEnrollStudent().size();
            for (int positionInTheEnrolledStudentList = 0; positionInTheEnrolledStudentList < numberOfTheStudentsEnrolledInThisCourse; positionInTheEnrolledStudentList++) {
                if (student.getStudentID().equals(courses.get(positionInTheCourseList).getEnrollStudent().get(positionInTheEnrolledStudentList).getStudentID())) {
                    whetherValid = false;
                    break;
                }
            }
        }
        if (whetherValid == true) {
            if (credits <= 0 || credits > student.getCredits()) {
                whetherValid = false;
            }
        }
        if (whetherValid == true) {
            int originalCredit = student.getCredits();
            student.setCredits(originalCredit - credits);
            ArrayList<Course> orinalCourseList = new ArrayList<>(student.getEnrollCourses());
            orinalCourseList.add(courses.get(positionInTheCourseList));
            student.setEnrollCourses(orinalCourseList);
            ArrayList<Student> originalEnrollStudent = new ArrayList<>(courses.get(positionInTheCourseList).getEnrollStudent());
            originalEnrollStudent.add(student);
            courses.get(positionInTheCourseList).setEnrollStudent(originalEnrollStudent);
            ArrayList<Integer> originalCredits = new ArrayList<>(courses.get(positionInTheCourseList).getCredits());
            originalCredits.add(credits);
            courses.get(positionInTheCourseList).setCredits(originalCredits);
        }
        return whetherValid;
    }

    public boolean modifyStudentEnrollmentCredits(Student student, String courseId, int credits) {
        boolean whetherValid = true;
        int numberOfTheTotalCourse = courses.size();
        int positionInTheCourseList = 0;
        int sequenceInTheEnrollingCourse = 0;
        int sequenceInTheEnrollingStudent = 0;
        if (ifOpen == false) {
            whetherValid = false;
        }
        if (whetherValid == true) {
            boolean whetherTrueHere = false;
            for (positionInTheCourseList = 0; positionInTheCourseList < numberOfTheTotalCourse; positionInTheCourseList++) {
                if (courseId.equals(courses.get(positionInTheCourseList).getCourseID())) {
                    whetherTrueHere = true;
                    break;
                }
            }
            whetherValid = whetherTrueHere;
        }
        if (whetherValid == true) {
            boolean whetherTrueHere = false;
            int numberOfTheStudentsEnrolledInThisCourse = courses.get(positionInTheCourseList).getEnrollStudent().size();
            for (int positionInTheEnrolledStudentList = 0; positionInTheEnrolledStudentList < numberOfTheStudentsEnrolledInThisCourse; positionInTheEnrolledStudentList++) {
                if (student.getStudentID().equals(courses.get(positionInTheCourseList).getEnrollStudent().get(positionInTheEnrolledStudentList).getStudentID())) {
                    whetherTrueHere = true;
                    sequenceInTheEnrollingStudent = positionInTheCourseList;
                    break;
                }
            }
            whetherValid = whetherTrueHere;
        }
        if (whetherValid == true) {
            String specificCourseID = courses.get(positionInTheCourseList).getCourseID();
            int lengthOfTheEnrollingCourse = student.getEnrollCourses().size();
            for (sequenceInTheEnrollingCourse = 0; sequenceInTheEnrollingCourse < lengthOfTheEnrollingCourse; sequenceInTheEnrollingCourse++) {
                if (student.getEnrollCourses().get(sequenceInTheEnrollingCourse).equals(specificCourseID)) {
                    break;
                }
            }
            int oldCreditInput = courses.get(positionInTheCourseList).getCredits().get(sequenceInTheEnrollingStudent);
            int upperLimit = oldCreditInput + student.getCredits();
            if (credits > upperLimit) {
                whetherValid = false;
            }
            if (whetherValid = true) {
                int newCreditsLeft = upperLimit - credits;
                student.setCredits(newCreditsLeft);
                ArrayList<Integer> oldCreditsList = new ArrayList<>(courses.get(positionInTheCourseList).getCredits());
                oldCreditsList.set(sequenceInTheEnrollingStudent, credits);
                courses.get(positionInTheCourseList).setCredits(oldCreditsList);
                ArrayList<Student> oldStudentList = new ArrayList<>(courses.get(positionInTheCourseList).getEnrollStudent());
                oldStudentList.set(sequenceInTheEnrollingStudent, student);
                courses.get(positionInTheCourseList).setEnrollStudent(oldStudentList);
            }
        }
        return whetherValid;
    }

    public boolean dropStudentEnrollmentCourse(Student student, String courseId) {
        boolean whetherValid = true;
        int numberOfTheTotalCourse = courses.size();
        int positionInTheCourseList = 0;
        int sequenceInTheEnrollingStudent = 0;
        int sequenceInTheEnrollingCourse = 0;
        if (ifOpen == false) {
            whetherValid = false;
        }
        if (whetherValid == true) {
            boolean whetherTrueHere = false;
            for (positionInTheCourseList = 0; positionInTheCourseList < numberOfTheTotalCourse; positionInTheCourseList++) {
                if (courseId.equals(courses.get(positionInTheCourseList).getCourseID())) {
                    whetherTrueHere = true;
                    break;
                }
            }
            whetherValid = whetherTrueHere;
        }
        if (whetherValid == true) {
            boolean whetherTrueHere = false;
            int numberOfTheStudentsEnrolledInThisCourse = courses.get(positionInTheCourseList).getEnrollStudent().size();
            for (int positionInTheEnrolledStudentList = 0; positionInTheEnrolledStudentList < numberOfTheStudentsEnrolledInThisCourse; positionInTheEnrolledStudentList++) {
                if (student.getStudentID().equals(courses.get(positionInTheCourseList).getEnrollStudent().get(positionInTheEnrolledStudentList).getStudentID())) {
                    whetherTrueHere = true;
                    sequenceInTheEnrollingStudent = positionInTheCourseList;
                    break;
                }
            }
            whetherValid = whetherTrueHere;
        }
        if (whetherValid == true) {
            String specificCourseID = courses.get(positionInTheCourseList).getCourseID();
            int lengthOfTheEnrollingCourse = student.getEnrollCourses().size();
            for (sequenceInTheEnrollingCourse = 0; sequenceInTheEnrollingCourse < lengthOfTheEnrollingCourse; sequenceInTheEnrollingCourse++) {
                if (student.getEnrollCourses().get(sequenceInTheEnrollingCourse).equals(specificCourseID)) {
                    break;
                }
            }
            int olderCreditOnThisCourse = courses.get(positionInTheCourseList).getCredits().get(sequenceInTheEnrollingStudent);
            int currentUpperLimit=student.getCredits();
            currentUpperLimit +=olderCreditOnThisCourse;
            student.setCredits(currentUpperLimit);
            ArrayList<Course> currentEnrollingCourseList = new ArrayList<>( student.getEnrollCourses());
            currentEnrollingCourseList.remove(sequenceInTheEnrollingCourse);
            student.setEnrollCourses(currentEnrollingCourseList);
            ArrayList<Student> currentEnrollingStudentsList = new ArrayList<>(courses.get(positionInTheCourseList).getEnrollStudent());
            currentEnrollingStudentsList.remove(sequenceInTheEnrollingStudent);
            courses.get(positionInTheCourseList).setEnrollStudent(currentEnrollingStudentsList);
            ArrayList<Integer> currentCreditsList = new ArrayList<>(courses.get(positionInTheCourseList).getCredits());
            currentCreditsList.remove(sequenceInTheEnrollingStudent);
        }
        return whetherValid;
    }
    public void finalizeEnrollments(){
        ifOpen=false;
        int numberOfTheTotalCourse = courses.size();
        for (int courseSequence = 0; courseSequence < numberOfTheTotalCourse; courseSequence++) {
        ArrayList<Integer> whichOneIsSelected = new ArrayList<>(courses.get(courseSequence).getCredits().size());
        
        }
    }
}


