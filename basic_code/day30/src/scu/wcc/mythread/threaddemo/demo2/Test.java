package scu.wcc.mythread.threaddemo.demo2;

public class Test {
    public static void main(String[] args) {
        //第二种方法实现多线程

        MyRun my= new MyRun();


        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
