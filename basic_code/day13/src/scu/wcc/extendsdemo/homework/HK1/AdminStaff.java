package scu.wcc.extendsdemo.homework.HK1;

public class AdminStaff extends Employee{
    public AdminStaff(String id, String name) {
        super(id, name);
    }

    public AdminStaff() {
    }

    @Override
    public void work() {
        System.out.println("行政部员工正在工作。");
    }
}
