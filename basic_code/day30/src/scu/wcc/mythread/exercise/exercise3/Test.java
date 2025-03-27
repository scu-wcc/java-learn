package scu.wcc.mythread.exercise.exercise3;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> numberList = new ArrayList<>();
        MyRun mr=new MyRun(numberList);

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);


        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Iterator<Integer> it = numberList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
