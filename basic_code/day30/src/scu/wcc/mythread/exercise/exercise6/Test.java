package scu.wcc.mythread.exercise.exercise6;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCall m1 =new MyCall();

        FutureTask<Student> f1 = new FutureTask<>(m1);
        FutureTask<Student> f2 = new FutureTask<>(m1);

        Thread t1 = new Thread(f1,"线程2");
        Thread t2 = new Thread(f2,"线程1");

        t1.start();
        t2.start();


        // 返回的时同一个对象
        System.out.println(f1.get());// Student@214c265e
        System.out.println(f2.get());// Student@214c265e
    }
}
