package scu.wcc.mythread.exercise.exercise1;

public class MyRun implements Runnable{

    int ticketCount=1000;

    @Override
    public void run() {
        while(true){

            synchronized (MyRun.class){
                if(ticketCount<1){
                    break;
                }else{
                    System.out.println("正在出售第"+(1001-ticketCount)+"张票...");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticketCount--;
                    System.out.println("当前还剩下："+ticketCount+"张票");


                }
            }



        }

    }
}
