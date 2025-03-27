package scu.wcc.mythread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Producer producer = new Producer(queue);
        Consumer consumer =new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
