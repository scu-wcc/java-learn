package scu.wcc.homework.homework4;

public class Test {
    public static void main(String[] args) {
        Cat c= new Cat("花色","波斯猫");
        Dog d =new Dog();
        d.setBreed("藏獒");
        d.setColor("黑色");

        c.eat();
        c.catchMouse();

        d.eat();
        d.lookHome();
    }
}
