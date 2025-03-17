package scu.wcc.stream.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A07_DistinctDemo {
    public static void main(String[] args) {
        //distinct：去重
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("小昭");
        list.add("殷离");
        list.add("张三");
        list.add("张三丰");
        Collections.addAll(list,"张三丰","小昭");

        list.stream().distinct().forEach(System.out::println);
        /*
        张无忌
        周芷若
        赵敏
        小昭
        殷离
        张三
        张三丰
         */

    }
}
