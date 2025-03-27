package scu.wcc.mythread.threaddemo.demo5;

public class Test {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("土豆");
        mt2.setName("西红柿");

        mt1.start();
        mt2.start();
    }
}
