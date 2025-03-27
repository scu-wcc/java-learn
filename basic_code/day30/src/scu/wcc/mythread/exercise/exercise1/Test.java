package scu.wcc.mythread.exercise.exercise1;

public class Test {
    public static void main(String[] args) {

        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr,"窗口1");
        Thread t2 = new Thread(mr,"窗口2");


        t1.start();
        t2.start();
    }
}
