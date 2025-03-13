package scu.wcc.mapdemo.TreeMap;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test3 {
    public static void main(String[] args) {
        String str = "axjnknvninwnncjknklnscinnixiwkknxszlopwmodpcs";
        TreeMap<Character,Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if(tm.containsKey(result)){
                //result在集合中
                int count = tm.get(result);
                count++;
                tm.put(result,count);
            }else{
                //result不在集合中
                tm.put(result,1);
            }
        }
        System.out.println(tm);

        StringJoiner sj = new StringJoiner(" ", "{","}");

        tm.forEach((key, count) -> sj.add(key+"("+count+")"));
        System.out.println(sj);
    }
}
