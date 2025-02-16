package scu.wcc.extendsdemo.homework.HK2;

public class Student extends People{
    private String className;

    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    public Student() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void lookClassTable() {
        System.out.println("学生正在查看课表。");
    }
    public void fillForm(){
        System.out.println("学生正在填写听课反馈。");
    }
}
