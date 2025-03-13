package scu.wcc.mapdemo.hashmapdemo;


import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        //定义数组用来存储地点
        String[] arr = {"A","B","C","D"};
        int len = arr.length;

        //投票并存储投票记录
        HashMap<String, Integer> hm = new HashMap<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(len);
            String address= arr[index];
            if(hm.containsKey(address)){
                //该景点存在，则票数自增一次
               int count = hm.get(address);
               count++;
               hm.put(address,count);
            }else{
                //该景点第一次被投票，将票数置为1
                hm.put(address,1);
            }
        }

        System.out.println(hm);
        int max =0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry: entries){
            int value = entry.getValue();
            if(value>max){
                max=value;
            }

        }
        System.out.println(max);

        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String address =  entry.getKey();
            int count = entry.getValue();
            if(count == max){
                System.out.println(address);
            }
        }
    }
}
