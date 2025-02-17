package scu.wcc.polymorphismdemo.polymorphismdemo1;

public class Administrator extends People{
    String id = "管理员";
    @Override
    public void show() {
        System.out.println("管理员的姓名是："+getName()+", 年龄是："+getAge());
    }

}
