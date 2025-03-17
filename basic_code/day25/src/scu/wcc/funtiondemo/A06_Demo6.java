package scu.wcc.funtiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class A06_Demo6 {
    public static void main(String[] args) {
        //使用类名::成员方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");

/*        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);*/

        //String对应抽象方法的第一个参数的数据类型，toUpperCase对应引用方法，其返回值对应返回值
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
