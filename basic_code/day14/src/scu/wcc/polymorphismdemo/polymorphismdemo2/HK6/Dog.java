package scu.wcc.polymorphismdemo.polymorphismdemo2.HK6;

public class Dog extends Animal {
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.println("颜色为"+getColor()+"的"+getAge()+"岁的狗，在吃"+something);
    }

    public void lookHome() {
        System.out.println("狗在看家。");
    }
}
