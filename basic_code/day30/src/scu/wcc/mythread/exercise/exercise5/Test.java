package scu.wcc.mythread.exercise.exercise5;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);


        LotteryBox lo1 = new LotteryBox(list,"抽奖箱1");
        LotteryBox lo2 = new LotteryBox(list,"抽奖箱2");

        lo1.start();
        lo2.start();

    }
}
