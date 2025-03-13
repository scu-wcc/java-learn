package scu.wcc.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_Traversal01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("瑞星咖啡", "圣夜拿铁");
        map.put("酷迪咖啡", "橙C美式");
        map.put("茶白道", "清体小麦茶");

        Set<String> keys=  map.keySet();
        //增强for
        for(String key:keys){
            String value = map.get(key);
            System.out.println("key="+key+", value="+value);
        }

        //迭代器
        System.out.println("-------------------------------------------------------");
        Iterator<String> it =  keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println("key="+key+", value="+value);
        }

        System.out.println("----------------------------------------------------------");
        keys.forEach((String key)-> {
                String value = map.get(key);
                System.out.println("key="+key+", value="+value);
            }
        );
    }
}
