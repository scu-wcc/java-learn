package scu.wcc.mythread.exercise.exercise2;

public class Test {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("圣诞老人");
        t2.setName("财神");

        t1.start();
        t2.start();
    }
}
