package scu.wcc.staticdemo.staticdemo1;

public class Student {
    private String name;
    private int age;

    //静态变量：被该类所有对象共享，不属于对象，属于类
    //随着类的加载而加载到堆内存的静态区，优先于对象存在
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void study(){
        System.out.println(name+"正在学习");
    }
    public void show(){
        System.out.println("姓名："+name+"，年龄："+age+"，老师："+teacherName);
    }
}
