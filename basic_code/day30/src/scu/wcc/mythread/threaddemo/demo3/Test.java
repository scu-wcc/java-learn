package scu.wcc.mythread.threaddemo.demo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //使用第三方式实现多线程。
        //call()方法有返回值
        MyCall mc = new MyCall();

        //创建Future的实现类对象
        FutureTask<Integer> ft  = new FutureTask<>(mc);

        Thread t = new Thread(ft);

        t.start();

        System.out.println(ft.get());


    }
}
