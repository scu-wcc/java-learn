package scu.wcc.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        list.add(1,"QQQ");
        System.out.println(list);

        list.add(4,"BBB");
        System.out.println(list);


    }
}
