package scu.wcc.mythreadpool.demo2mythreadpool;

import java.util.concurrent.*;

public class MyThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, //核心线程数量
                6, //最大线程数量
                10, //临时线程最大空闲时间，超过时间就会被销毁
                TimeUnit.SECONDS, //空闲时间的单位
                new ArrayBlockingQueue<>(3), //阻塞队列
                Executors.defaultThreadFactory(), //创建线程的方式
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略
        );

        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        pool.shutdown();
    }
}
