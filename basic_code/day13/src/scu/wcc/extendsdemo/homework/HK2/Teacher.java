package scu.wcc.extendsdemo.homework.HK2;

public class Teacher extends People{
    private String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public Teacher() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void lookClassTable() {
        System.out.println("老师正在查看课表。");
    }

    public void publishForm(){
        System.out.println("老师正在发布问题。");
    }

}
