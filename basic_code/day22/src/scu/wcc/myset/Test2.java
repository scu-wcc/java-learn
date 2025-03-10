package scu.wcc.myset;

import java.util.Comparator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {

        //要求：想让TreeSet按照字符串的长度排序，长度相同在按照String的默认方式排序。
        //不能修改String中重写的compareTo方法，使用比较器来指定排序规则.
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                if(i==0){
                    return o1.compareTo(o2);
                }else{
                    return i;
                }
            }
        });

        ts.add("c");
        ts.add("ab");
        ts.add("bcd");
        ts.add("bfeses");
        System.out.println(ts);


    }
}
