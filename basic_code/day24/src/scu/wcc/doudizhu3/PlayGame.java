package scu.wcc.doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PlayGame {

    static ArrayList<String> poker = new ArrayList<>();

    //定义集合记录数组的价值
    static HashMap<String, Integer> valueMap = new HashMap<>();

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

        poker.add(" 大王");
        poker.add(" 小王");

        valueMap.put("J",11);
        valueMap.put("Q",12);
        valueMap.put("K",13);
        valueMap.put("A",14);
        valueMap.put("2",15);
        valueMap.put("小王",16);
        valueMap.put("大王",17);

    }

    public PlayGame(boolean isLook){
        //静态代码块生成牌后打乱顺序
        Collections.shuffle(poker);
        //System.out.println(poker);
        //发牌
        dealPoker();

        //将牌排序
        orderCard(lord);
        orderCard(player1);
        orderCard(player2);
        orderCard(player3);

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

    //将玩家的牌传入，进行排序
    public void orderCard(ArrayList<String> poker){
        Collections.sort(poker, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0,1);
                int value1 = getValue(o1);

                String color2 = o2.substring(0,1);
                int value2 = getValue(o2);

                int result = value1-value2;

                return result==0?color1.compareTo(color2):result;
            }
        });

    }

    private int getValue(String o) {
        String subStr = o.substring(1);

        if(valueMap.containsKey(subStr)){
            return valueMap.get(subStr);
        }else{
            return Integer.parseInt(subStr);
        }


    }


}
