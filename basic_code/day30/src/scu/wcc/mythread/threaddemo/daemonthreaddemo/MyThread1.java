package scu.wcc.mythread.threaddemo.daemonthreaddemo;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"@"+i);
        }
    }
}
