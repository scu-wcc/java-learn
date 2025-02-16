package scu.wcc.extendsdemo.homework.HK6;

public class Test {
    public static void main(String[] args) {
        Cat c =new Cat(2,"白色");
        Dog d = new Dog(2,"黑色");

        People p = new People();
        p.keepPet(c,"小鱼干");
        p.keepPet(d,"骨头");
    }
}
