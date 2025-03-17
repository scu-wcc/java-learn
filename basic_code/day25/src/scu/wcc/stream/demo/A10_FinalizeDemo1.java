package scu.wcc.stream.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class A10_FinalizeDemo1 {
    public static void main(String[] args) {
        //终结方法：终止某一个stream流
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("小昭");
        list.add("殷离");
        list.add("张三");
        list.add("张三丰");

        //遍历
        list.stream().forEach(System.out::println);

        System.out.println("=============================");
        //统计个数
        long count = list.stream().count();
        System.out.println(count);

        System.out.println("===============================");
        //转换成数组
        //1.空参创建
        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));

        System.out.println("===================================");
        //2.带参构造
        String[] arr2 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr2));
        System.out.println("========================================");

        String[] arr3 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr3));



    }
}
