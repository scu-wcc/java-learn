package scu.wcc.arraylist.arraylistdemo.exercise;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<>();
        list.add("你好");
        list.add("黑马程序员");
        list.add("学IT来黑马");
        list.add("月薪过万就在黑马程序员！！！");

        int len = list.size();
        System.out.print("[");
        for (int i = 0; i <len ; i++) {
            if(i == len-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");
    }
}
