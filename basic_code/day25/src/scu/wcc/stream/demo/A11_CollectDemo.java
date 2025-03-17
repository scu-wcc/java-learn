package scu.wcc.stream.demo;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A11_CollectDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌-男-23");
        list.add("周芷若-女-60");
        list.add("赵敏-女-44");
        list.add("小昭-男-21");
        list.add("殷离-男-18");
        list.add("张三-女-32");
        list.add("张三丰-男-44");


        //collect将流中的数据放到集合中(List、Set、Map)

        //List
        List<String> newList = list.stream()
                .filter(s-> s.split("-")[1].equals("男"))
                .collect(Collectors.toList());
        System.out.println(newList);

        //Set:底层是HashSet,会自动去重
        Set<String> newSet = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newSet);

        //Map
        Map<String, Integer> newMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        new Function<String, String>() {
                            @Override
                            public String apply(String s) {
                                return s.split("-")[0];
                            }
                        },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));

        System.out.println(newMap);
        //lambda方法
        Map<String, Integer> newMap2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(newMap2);

    }

}
