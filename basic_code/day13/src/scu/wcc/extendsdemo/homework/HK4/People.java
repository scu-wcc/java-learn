package scu.wcc.extendsdemo.homework.HK4;

public class People {
    private String name;
    private char gender;
    private int age;
    private String nationality;

    public People(String name, char gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void work(){
        System.out.println("工作");
    }
}

