package scu.wcc.extendsdemo.homework.HK1;

public class Teacher extends Employee{
    public Teacher(String id, String name) {
        super(id, name);
    }

    public Teacher() {
    }

    @Override
    public void work() {
        System.out.println("教研部员工正在工作");
    }
}
