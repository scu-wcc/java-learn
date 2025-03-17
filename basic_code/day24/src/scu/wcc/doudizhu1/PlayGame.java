package scu.wcc.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PlayGame {

    static ArrayList<String> poker = new ArrayList<>();

    //三个玩家牌，以及一个底牌
    ArrayList<String> lord = new ArrayList<>();
    ArrayList<String> player1 = new ArrayList<>();
    ArrayList<String> player2 = new ArrayList<>();
    ArrayList<String> player3 = new ArrayList<>();




    //使用静态代码块生成牌,调用PlayGame时只会生成一副牌
    static {
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        for (String color : colors) {

            for (String number : numbers) {
                poker.add(color+number);
            }

        }

        poker.add("大王");
        poker.add("小王");

    }

    public PlayGame(boolean isLook){
        //静态代码块生成牌后打乱顺序
        Collections.shuffle(poker);
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
    private void lookPoker(String name, ArrayList<String> player) {
        System.out.print(name+ ": ");
        for (String s : player) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

    //发牌
    public void dealPoker(){
        int len = poker.size();
        for (int i = 0; i < len; i++) {
            if(i<=2){
                lord.add(poker.get(i));
                continue;
            }

            if(i%3 == 0){
                //给第一个玩家发牌
                player1.add(poker.get(i));
            }else if(i%3 == 1){
                //给第二个玩家发牌
                player2.add(poker.get(i));
            }else{
                //给第三个玩家发牌
                player3.add(poker.get(i));
            }
        }
    }



}
