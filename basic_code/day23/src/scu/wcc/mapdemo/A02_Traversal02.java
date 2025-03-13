package scu.wcc.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_Traversal02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("轮子妈", "希维尔");
        map.put("扇子妈", "卡尔玛");
        map.put("滚地婆", "薇恩");

        //使用键值对遍历:Entry是Map的内部接口，如果单独使用需要导包
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //获取键值对中的每一个键值对
        for(Map.Entry<String,String> entry: entries ){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key: "+key+", value:"+value);
        }

    }
}
