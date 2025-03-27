package scu.wcc.mythread.securitydemo.demo2;

public class MyRun implements Runnable{

    int ticket=0;

    @Override
    public  void run() {

        while (true){
            if(!method()){
                break;
            }
        }

    }


    public synchronized boolean method(){
        if(ticket!=100){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            ticket++;
            System.out.println(Thread.currentThread().getName()+ "正在卖第"+ticket+"张票");
            return true;
        }else{
            return false;
        }
    }

}
