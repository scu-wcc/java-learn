package scu.wcc.mythread.exercise.exercise5;

import java.util.ArrayList;
import java.util.Random;
import java.util.StringJoiner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LotteryBox extends Thread{

    private final ArrayList<Integer> totalBox;
    private static int totalMax=0;



    private ArrayList<Integer> ownBox = new ArrayList<>();
    private int max = 0;
    private int  sum=0;

    static Lock lock = new ReentrantLock();


    public LotteryBox(ArrayList<Integer> box, String name) {
        super(name);
        this.totalBox = box;
    }

    @Override
    public void run() {
        while (true){
            synchronized (LotteryBox.class){
                int len = totalBox.size();
                if(len==0){
                    System.out.println(getName()+"本次一共抽取到"+ownBox.size()+"个奖项。");
                    StringJoiner sj =new StringJoiner(", ","[","]");
                    for (Integer money : ownBox) {
                        sj.add(money+"");
                    }
                    System.out.println("分别为："+sj.toString()+"最高奖项为"+max+"元, 共计"+sum+"元。");
                    break;
                }else{
                    Random r= new Random();
                    int index = r.nextInt(len);
                    int money = totalBox.remove(index);
                    ownBox.add(money);
                    sum+=money;
                    if(money>max){
                        max=money;
                    }
                    if(money>totalMax){
                        totalMax = money;
                    }

                }
            }
            //避免某个抽奖箱抽取太快，导致另一个抽奖箱没有奖项
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < ownBox.size(); i++) {
            if(ownBox.get(i) == totalMax){
                System.out.println("在此次抽奖过程中"+getName()+"产生了最大奖项，奖金为："+totalMax+"元。");
                break;
            }
        }

    }
}
