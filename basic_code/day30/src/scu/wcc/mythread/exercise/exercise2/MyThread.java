package scu.wcc.mythread.exercise.exercise2;

public class MyThread extends Thread{

    public static int gift=100;
    int count=0;

    @Override
    public void run() {
        while(true){

            synchronized (MyThread.class){
                if(gift<10){
                    System.out.println(getName()+"一共送出"+count+"份礼物。");
                    break;
                }else{
                    count++;
                    String name = getName();
                    System.out.println(name+"正在派送礼物......");

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    gift--;
                    System.out.println("还剩下"+gift+"份礼物。");

                }
            }

        }
    }
}
