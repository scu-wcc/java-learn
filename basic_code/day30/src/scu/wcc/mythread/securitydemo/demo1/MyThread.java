package scu.wcc.mythread.securitydemo.demo1;

public class MyThread extends Thread {
    static int ticket = 0;

    //static Object obj =new Object();

    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(ticket<100){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票");
                }else{
                    break;
                }

            }

        }
    }
}
