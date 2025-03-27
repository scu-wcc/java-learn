package scu.wcc.mythread.threaddemo.demo4;

public class Test2 {
    public static void main(String[] args) {
        //获取优先级
        MyRunnable mr1=new MyRunnable();
        MyRunnable mr2=new MyRunnable();

        Thread t1 =new Thread(mr1,"飞机");
        Thread t2=new Thread(mr2,"坦克");

        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5
        System.out.println(Thread.currentThread().getPriority());//5

        //改变优先级
        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();


    }
}
