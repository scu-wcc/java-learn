package scu.wcc.mythread.waitandnotify;

public class Producer extends  Thread{

    @Override
    public void run() {

        while(true){
            synchronized (Desk.lock){
                if(Desk.count<1){
                    break;
                }else {
                    if(Desk.signal==1){
                        try {
                            //已有商品，执行等待
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        //没有商品，执行生成
                        System.out.println("生产者第"+(11-Desk.count)+"次制作商品");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("商品制作完成");
                        Desk.signal=1;
                        Desk.lock.notifyAll();


                    }
                }


            }

        }



    }
}
