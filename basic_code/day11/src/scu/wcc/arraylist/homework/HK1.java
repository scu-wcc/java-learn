package scu.wcc.arraylist.homework;

import java.util.ArrayList;

public class HK1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        int len = list.size();
        for (int i = 0; i < len; i++) {
            System.out.println(list.get(i));
        }
    }
}
