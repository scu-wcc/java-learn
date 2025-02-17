package scu.wcc.polymorphismdemo.polymorphismdemo1;

public class Teacher extends People{
    String id = "老师";
    @Override
    public void show() {
        System.out.println("老师的姓名是："+getName()+", 年龄是："+getAge());
    }
}
