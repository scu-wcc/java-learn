package scu.wcc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //向集合中添加元素
        Collections.addAll(list,"aaa","ax5sx","sjnjcw69","smx20 x.5.x5","sjnxj33","s5989x522x","www.123.com");
        System.out.println(list);

        //打乱元素的顺序
        Collections.shuffle(list);
        System.out.println(list);

        //排序
        System.out.println("------------------------默认规则排序---------------------------");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("------------------------指定规则排序----------------------------");
        Collections.sort(list,(o1, o2) -> {
                int i = o1.length()-o2.length();
                i=i==0?o1.compareTo(o2):i;
                return i;
            });
        System.out.println(list);

        //二分法查找元素
        System.out.println("---------------------------二分法查找元素---------------------------");
        System.out.println(Collections.binarySearch(list,"aaa"));
        System.out.println(Collections.binarySearch(list,"www.123.com"));
        System.out.println(Collections.binarySearch(list,"www"));//对于不存在的元素：应该插入的位置索引取反，再-1

        System.out.println("其他功能......");
    }
}
