package scu.wcc.mythread.threaddemo.demo5;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
            Thread.yield();
        }
    }
}
