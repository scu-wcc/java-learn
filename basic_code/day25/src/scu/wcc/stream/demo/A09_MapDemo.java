package scu.wcc.stream.demo;

import java.util.ArrayList;
import java.util.function.Function;

public class A09_MapDemo {
    public static void main(String[] args) {
        //数据类型转换
        ArrayList<String> list = new ArrayList<>();
        list.add("张三-23");
        list.add("李四-24");
        list.add("王五-25");
        list.add("老六-26");
        list.add("田七-27");
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] user = s.split("-");
                int age = Integer.parseInt(user[1]);
                return age;
            }
        }).forEach(System.out::println);

        //使用lambda
        System.out.println("===========================================================");
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);

    }
}
