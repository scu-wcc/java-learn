package scu.wcc.mythread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread{

    ArrayBlockingQueue<String> queue ;

    public Producer(ArrayBlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {

        while(true){

            try {
                queue.put("面条");
                System.out.println("生产者放入面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
