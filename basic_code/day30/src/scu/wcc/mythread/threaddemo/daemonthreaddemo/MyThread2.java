package scu.wcc.mythread.threaddemo.daemonthreaddemo;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"@"+i);
        }
    }
}
