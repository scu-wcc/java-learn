package scu.wcc.mythread.waitandnotify;

public class Consumer extends Thread{

    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count<1){
                    break;
                }else{
                    if(Desk.signal==0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                    }else{
                        Desk.count--;
                        System.out.println("消费者正在第"+(10-Desk.count)+"次消费商品...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("消费者消费完毕.");
                        Desk.signal=0;
                        Desk.lock.notifyAll();
                    }
                }

            }


        }
    }
}
