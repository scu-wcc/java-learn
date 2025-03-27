package scu.wcc.mythread.threaddemo.daemonthreaddemo;

public class Test {

    public static void main(String[] args) {
        //守护线程
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2=new MyThread2();

        mt1.setName("美女");
        mt2.setName("舔狗");

        mt2.setDaemon(true);

        mt1.start();
        mt2.start();

    }
}
