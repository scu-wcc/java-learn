package scu.wcc.pre_class.private_demo;

public class GirlFriend {
    //private修饰的私有成员变量和成员方法无法被非本类以外的类使用
    //需要为private修饰的成员提供set和get方法

    private String name;
    private int age;
    private String gender;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String g) {
        gender = g;
    }

    public String getGender() {
        return gender;
    }

    public void sleep() {
        System.out.println("女朋友在睡觉。");
    }

    public void eat() {
        System.out.println("女朋友在吃饭。");
    }

}
