package scu.wcc.arraylist.arraylistdemo.exercise;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //基本数据类型->包装类
        //int和char比较特殊，其他的包装类均为基本数据类型首字母大写：long -> Long
        ArrayList<Integer> list = new ArrayList<>();
        //JDK5之后int和Integer可以相互转换
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int len = list.size();
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i == len-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");
    }
}
