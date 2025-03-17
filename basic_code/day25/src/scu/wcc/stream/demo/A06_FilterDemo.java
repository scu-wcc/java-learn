package scu.wcc.stream.demo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class A06_FilterDemo {
    public static void main(String[] args) {
        //filter: 过滤
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("小昭");
        list.add("殷离");
        list.add("张三");
        list.add("张三丰");

        list.stream().filter(name -> name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));

        System.out.println("=================================================");
        Stream<String> stream1 = list.stream();
        stream1.forEach(name-> System.out.println(name));
        //多次调用某个stream流会报错：stream has already been operated upon or closed
        //stream1.forEach(name-> System.out.println(name));

        //limit
        System.out.println("-------------------limit-----------------------");
        list.stream().limit(2).forEach(System.out::println);

        //skip
        System.out.println("--------------------skip-------------------------");
        list.stream().skip(2).forEach(System.out::println);
    }
}
