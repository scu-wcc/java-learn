package scu.wcc.stream.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class A01_Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("小昭");
        list.add("殷离");
        list.add("张三");
        list.add("张三丰");

        //使用stream流遍历集合
        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length()==3).forEach(name-> System.out.println(name));

    }
}
