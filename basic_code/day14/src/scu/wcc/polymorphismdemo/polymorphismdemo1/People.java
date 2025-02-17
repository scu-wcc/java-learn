package scu.wcc.polymorphismdemo.polymorphismdemo1;

public class People {
    private String name;
    private int age;
    String id = "人类";

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
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

    public void show(){
        System.out.println(name+", "+age);
    }
}
