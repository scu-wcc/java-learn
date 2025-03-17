package scu.wcc.funtiondemo;

import java.util.ArrayList;
import java.util.List;

public class A03_Demo3 {
    public static void main(String[] args) {
        //对象调用：对象::方法名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("小昭");
        list.add("殷离");
        list.add("张三");
        list.add("张三丰");

        //名字以张开头，长度为3并打印
        //定义对象
        StringOperation so = new StringOperation();
        list.stream().filter(so::stringJungle).forEach(System.out::println);


    }
}
