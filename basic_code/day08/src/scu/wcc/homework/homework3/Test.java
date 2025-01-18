package scu.wcc.homework.homework3;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("张三","123",15000,6000);
        Coder c = new Coder("李四","135",10000);
        m.work();
        c.work();
    }
}
