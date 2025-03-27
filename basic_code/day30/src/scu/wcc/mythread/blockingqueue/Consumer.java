package scu.wcc.mythread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer extends Thread{

    ArrayBlockingQueue<String> queue;

    public Consumer(ArrayBlockingQueue<String> queue){
        this.queue = queue;
    }


    @Override
    public void run() {
        while(true){

            try {
                String food = queue.take();
                System.out.println("消费者拿到了"+food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
