package scu.wcc.stream.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo {
    public static void main(String[] args) {
        //双列集合的转换调用
        HashMap<Integer,String > hm = new HashMap<>();
        hm.put(1,"aaa");
        hm.put(2,"bbb");
        hm.put(3,"ccc");
        hm.put(4,"ddd");
        hm.put(5,"eee");
        Set<Integer> keys = hm.keySet();
        keys.stream().forEach(i-> System.out.println(i));
        System.out.println("===============================================");
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        entries.stream().forEach(entry-> {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+ " = "+value);

        });
    }
}
