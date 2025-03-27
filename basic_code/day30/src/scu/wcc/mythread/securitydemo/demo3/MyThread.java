package scu.wcc.mythread.securitydemo.demo3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int ticket = 0;

    //static Object obj =new Object();
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            //执行这个语句的线程获得锁
            lock.lock();

            try {
                if(ticket<100){
                    Thread.sleep(50);
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票");
                }else{
                    break;
                }
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                //即使break出循环，也会执行unlock()
                lock.unlock();
            }
        }
    }
}
