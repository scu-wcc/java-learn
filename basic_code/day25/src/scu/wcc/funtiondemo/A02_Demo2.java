package scu.wcc.funtiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class A02_Demo2 {
    public static void main(String[] args) {
        //将字符串转换成数字并相加
        int sum = 0;
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","9","8","4","6","5");

/*        list.stream().map(new Function<String, Integer>() {
            @Override
            public  Integer apply(String s) {
                return Integer.parseInt(s);
            }
        })*/
        //使用方法引用
        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
