package scu.wcc.polymorphismdemo.polymorphismdemo1;

public class Student extends People{
    String id = "学生";
    @Override
    public void show() {
        System.out.println("学生的姓名是："+getName()+", 年龄是："+getAge());
    }
}
