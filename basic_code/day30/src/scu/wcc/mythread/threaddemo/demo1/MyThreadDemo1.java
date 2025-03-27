package scu.wcc.mythread.threaddemo.demo1;

public class MyThreadDemo1 {
    public static void main(String[] args) {
        //创建线程的第一种方法: 类继承Thread();
        MyThread t1 = new MyThread();
        t1.setName("1");
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("2");
        t2.start();
    }
}

