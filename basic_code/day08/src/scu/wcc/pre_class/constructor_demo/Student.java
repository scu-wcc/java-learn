package scu.wcc.pre_class.constructor_demo;

public class Student {
    //构造方法：创建对象时虚拟机自动调用，用于初始化成员变量
    //虚拟机会自动加一个默认的空参构造，但是一旦我们自己定义了构造方法，虚拟机就不会帮我们加上，此时需要我们手动加上
    private int age ;
    private String name;

    public Student(){
        System.out.println("看看我执行了吗？");
    }
    public Student(String name, int age){
        this.age = age;
        this.name =name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
