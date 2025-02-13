package scu.wcc.arraylist.homework.HK2;

public class Teacher {
    private String name;
    private String course;

    public Teacher() {
    }

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
