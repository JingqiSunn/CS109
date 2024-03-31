public class ClassroomInformation {
    private String classroomType;
    private int classroomCapacity;

    public ClassroomInformation(String classroomType, int classroomCapacity) {
        this.classroomType = classroomType;
        this.classroomCapacity = classroomCapacity;
    }

    public String getClassroomType() {
        return classroomType;
    }

    public int getClassroomCapacity() {
        return classroomCapacity;
    }

    public void setClassroomType(String classroomType) {
        this.classroomType = classroomType;
    }

    public void setClassroomCapacity(int classroomCapacity) {
        this.classroomCapacity = classroomCapacity;
    }
}
