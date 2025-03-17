package scu.wcc.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PlayGame {

    //使用序号来锁定牌，给牌排序
    //定义序号与牌的关系
    static HashMap<Integer,String> hm = new HashMap<>();
    //记录序号
    static ArrayList<Integer> serialNumberList = new ArrayList<>();

    //三个玩家牌，以及一个底牌
    //使用TreeSet:自动排序，得到的牌就展示的时候就需要在排一次。
    TreeSet<Integer> lord = new TreeSet<>();
    TreeSet<Integer> player1 = new TreeSet<>();
    TreeSet<Integer> player2 = new TreeSet<>();
    TreeSet<Integer> player3 = new TreeSet<>();




    //使用静态代码块生成牌,调用PlayGame时只会生成一副牌
    static {
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int serialNumber = 1;

        for(String number: numbers){
            for (String color : colors) {
                hm.put(serialNumber,color+number);
                serialNumberList.add(serialNumber++);
            }
        }

        hm.put(serialNumber,"小王");
        serialNumberList.add(serialNumber++);
        hm.put(serialNumber,"大王");
        serialNumberList.add(serialNumber);

    }

    public PlayGame(boolean isLook){

        //将序号打乱
        Collections.shuffle(serialNumberList);
        //System.out.println(poker);
        //发牌
        dealPoker();
        //看牌
        if(isLook){
            lookPoker("底牌",lord);
            lookPoker("刚脑壳",player1);
            lookPoker("大帅哥",player2);
            lookPoker("大美女",player3);
        }



    }

    //看牌
    private void lookPoker(String name, TreeSet<Integer> player) {
        System.out.print(name+ ": ");
        for (Integer i : player) {
            String card = hm.get(i);
            System.out.print(card+", ");
        }
        System.out.println();
    }

    //发牌
    public void dealPoker(){
        int len = serialNumberList.size();
        for (int i = 0; i < len; i++) {
            int serialNumber = serialNumberList.get(i);

            if(i<=2){
                lord.add(serialNumber);
                continue;
            }

            if(i%3 == 0){
                //给第一个玩家分配序号，TreeSet自动排序
                player1.add(serialNumber);
            }else if(i%3 == 1){
                //给第二个玩家发牌
                player2.add(serialNumber);
            }else{
                //给第三个玩家发牌
                player3.add(serialNumber);
            }
        }

    }



}
