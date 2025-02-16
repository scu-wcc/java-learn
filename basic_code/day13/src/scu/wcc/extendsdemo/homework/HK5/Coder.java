package scu.wcc.extendsdemo.homework.HK5;

public class Coder extends Employee{
    public Coder(String name, String workID, int salary) {
        super(name, workID, salary);
    }

    public Coder() {
    }

    @Override
    public void work() {
        System.out.println("程序员正在写代码。");
    }
}
