package scu.wcc.mythread.threaddemo.demo4;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //getName 和setName
        MyThread mt1= new MyThread("软件");
        MyThread mt2= new MyThread("硬件");



        mt1.start();
        mt2.start();

        //使当前线程(main线程)沉睡
        Thread.sleep(5000);

        //静态方法：currentThread()\sleep
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());


    }
}
