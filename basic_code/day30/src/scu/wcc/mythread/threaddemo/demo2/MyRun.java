package scu.wcc.mythread.threaddemo.demo2;

public class MyRun implements Runnable{
    //实现Runnable来实现多线程

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            //获取当前线程
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+ ": Hello World!");
        }
    }
}
