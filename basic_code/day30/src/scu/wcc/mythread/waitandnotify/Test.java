package scu.wcc.mythread.waitandnotify;

public class Test {
    public static void main(String[] args) {
        Producer producer=new Producer();
        Consumer consumer =new Consumer();

        producer.start();
        consumer.start();
    }
}
