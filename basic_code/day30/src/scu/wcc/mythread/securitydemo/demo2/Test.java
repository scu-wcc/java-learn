package scu.wcc.mythread.securitydemo.demo2;

public class Test {
    public static void main(String[] args) {
        MyRun my=new MyRun();

        Thread t1 =new Thread(my,"窗口1");
        Thread t2 =new Thread(my,"窗口2");
        Thread t3 =new Thread(my,"窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
