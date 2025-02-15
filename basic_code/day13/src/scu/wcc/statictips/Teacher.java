package scu.wcc.statictips;

public class Teacher {
    private String name;
    private String major;
    private int age;

    //静态方法能够直接调用只有本类的静态方法和静态变量
    //非静态方法可以调用本类全部方法和变量。

    //在静态方法中可以通过实例化对象调用类方法
    public static Teacher show(String name,int age){
        Student s = new Student(name,age);
        System.out.println("学生年龄："+s.getAge());

        Teacher t = new Teacher();
        t.setName("王老师");
        System.out.println("老师姓名："+t.getName());

        return t;

    }

    public static String schoolName;

    public Teacher() {
    }

    public Teacher(String name, String major, int age) {
        this.name = name;
        this.major = major;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
