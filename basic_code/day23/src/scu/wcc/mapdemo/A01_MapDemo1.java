package scu.wcc.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        /*V put(key, value);
          void clear();
          boolean containsKey(key);
          boolean containsValue(value);
          boolean isEmpty();
          int size();
         */
        Map<String,String> map = new HashMap<>();

        //put:添加/覆盖
        System.out.println("------------------------put-------------------------");
        System.out.println(map.put("瑞星咖啡", "圣夜拿铁")); //null
        System.out.println(map.put("酷迪咖啡", "橙C美式"));
        System.out.println(map.put("茶白道", "清体小麦茶"));
        System.out.println(map);
        //覆盖
        System.out.println(map.put("瑞星咖啡", "苹果美式"));//圣夜拿铁
        System.out.println(map);

        System.out.println("------------------------containsKey-------------------------");
        System.out.println(map.containsKey("瑞星咖啡")); //true
        System.out.println(map.containsKey("上海阿姨")); //false

        System.out.println("------------------------containsValue-------------------------");
        System.out.println(map.containsValue("圣夜拿铁")); //false
        System.out.println(map.containsValue("橙C美式")); //true

        System.out.println("------------------------isEmpty、size、clear-------------------------");
        System.out.println(map.size()); //3
        System.out.println(map.isEmpty()); //false
        map.clear();
        System.out.println(map.isEmpty()); //true



    }
}
