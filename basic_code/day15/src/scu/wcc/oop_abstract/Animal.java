package scu.wcc.oop_abstract;

public abstract class Animal {
    private String name;
    private int age;

    //抽象类的构造方法：用于给成员变量初始化
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
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

    public abstract void eat();
    public void drink(){
        System.out.println("喝水");
    }
}
