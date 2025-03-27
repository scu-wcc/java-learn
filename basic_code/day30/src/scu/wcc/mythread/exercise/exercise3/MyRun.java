package scu.wcc.mythread.exercise.exercise3;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRun implements Runnable{

    int number=1;

    Lock lock =new ReentrantLock();

    ArrayList<Integer> list;

    public MyRun(ArrayList<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {

        while(true){
            lock.lock();
            try {
                if(number>100){
                    break;
                }else{
                    if(number%2==1){
                        //System.out.println(number);
                        list.add(number);
                        number++;
                    }else{
                        number++;
                    }
                }
            }finally {
                lock.unlock();
            }
        }

    }
}
