package scu.wcc.mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A02_Traversal03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("轮子妈", "希维尔");
        map.put("扇子妈", "卡尔玛");
        map.put("滚地婆", "薇恩");

        //使用匿名内部类遍历
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println("key:"+key+", value:"+value);
            }
        });

        //使用lambda遍历
        System.out.println("---------------------------lambda------------------------------");
        map.forEach((key,value)-> System.out.println("key:"+key+", value:"+value));

    }
}
