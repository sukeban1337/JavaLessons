package Lesson30.Lesson30_5;

public class Student {
    private String name;
    private String group;
    private int course;
    private long[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public long[] getGrades() {
        return grades;
    }

    public void setGrades(long[] grades) {
        this.grades = grades;
    }

    public Student(String name, String group, int course, long[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
}
