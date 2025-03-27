package scu.wcc.mythreadpool.demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService pool1 = Executors.newFixedThreadPool(3);


        pool1.submit(new MyRunnable());

        pool1.submit(new MyRunnable());

        pool1.submit(new MyRunnable());

        pool1.submit(new MyRunnable());

        pool1.submit(new MyRunnable());


        pool1.shutdown();

    }
}
