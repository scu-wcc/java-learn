package scu.wcc.mapdemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        //有序存储和读取
        lhm.put("ccc",789);
        lhm.put("abc",111);
        lhm.put("abc",123);
        lhm.put("bbb",456);


        System.out.println(lhm);
    }
}
