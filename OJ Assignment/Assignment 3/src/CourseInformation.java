public class CourseInformation {
    private String courseType;
    private int courseCapacity;

    public CourseInformation(String courseType, int courseCapacity) {
        this.courseType = courseType;
        this.courseCapacity = courseCapacity;
    }

    public String getCourseType() {
        return courseType;
    }

    public int getCourseCapacity() {
        return courseCapacity;
    }
}
