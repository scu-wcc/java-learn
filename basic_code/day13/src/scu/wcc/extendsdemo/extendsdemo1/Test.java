package scu.wcc.extendsdemo.extendsdemo1;

public class Test {
    public static void main(String[] args) {
        LihuaCat lh = new LihuaCat();
        lh.eat();
        lh.drink();
        lh.catchMouse();
        //lh.speak();无法访问父类的私有成员；其实即使能访问，由于private的修饰也无法直接调用，只能重写

        System.out.println("-------------------------------------------");

        Husky hs = new Husky();
        hs.eat();
        hs.drink();
        hs.breakHouse();
    }
}
