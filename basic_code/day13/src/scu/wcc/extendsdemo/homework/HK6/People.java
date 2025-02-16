package scu.wcc.extendsdemo.homework.HK6;

public class People {
    private String name;
    private int age;

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

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    //多态
    public void keepPet(Animal a, String something){
        a.eat(something);
    }

    public void keepPet(Cat c, String something){
        c.eat(something);
    }

    public void keepPet(Dog d, String something){
        d.eat(something);
    }

}
