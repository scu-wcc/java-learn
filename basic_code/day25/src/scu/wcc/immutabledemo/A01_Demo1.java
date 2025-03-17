package scu.wcc.immutabledemo;

import java.util.*;

public class A01_Demo1 {
    public static void main(String[] args) {
        //使用集合.of就可以创建出不可变集合
        System.out.println("-----------------------List----------------------------");
        List<String> list = List.of("111", "zhangsan", "lisi", "scu", "New York", "shanghai", "beijing");
        Iterator<String> it1 = list.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        //尝试修改
        //list.add("aaa");//报错

        System.out.println("-----------------------Set----------------------------");
        //添加重复的元素会直接报错
        Set<String> sets = Set.of("纽约", "伦敦", "新加坡", "巴黎", "东京", "洛杉矶", "香港", "上海", "北京", "首尔");
        for (String set : sets) {
            System.out.println(set);
        }

        System.out.println("-----------------------Map----------------------------");
        //Map.of至多添加10个键值对，因为编写代码时无法传入两个可变参数
        Map<String, String> map1 = Map.of("成都", "天府之国", "维也纳", "音乐之城", "巴黎", "花都", "新加坡", "狮城",
                "底特律", "汽车城", "拉萨", "日光城", "牛津", "大学城", "惠灵顿", "风城",
                "伦敦", "金融城", "洛杉矶", "鸡蛋城");
        Set<Map.Entry<String, String>> entries = map1.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }

        System.out.println("--------------------Map使用可变参数创建不可变集合----------------------");
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"aaa");
        hm.put(2,"bbb");
        hm.put(3,"ccc");
        hm.put(4,"ddd");
        hm.put(5,"eee");
        //将集合转换成数组
        Set<Map.Entry<Integer, String>> entries1 = hm.entrySet();
        Map.Entry[] array = entries1.toArray(new Map.Entry[0]); //指定转换类型的数组
        //调用Map.ofEntries
        Map map = Map.ofEntries(array);

        //JDK10：copyOf()
        Map<Integer, String> integerStringMap = Map.copyOf(hm);


    }
}
