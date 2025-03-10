package scu.wcc.genericsdemo.genericsclassdemo;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1,"aaa","bbb","ccc");
        System.out.println(list1);//[aaa, bbb, ccc]

        ArrayList<Integer> list2 = new ArrayList<>();
        //使用 E...e 传入参数
        ListUtil.addAll(list2,123,456,789,111,222,333);
        System.out.println(list2);//[123, 456, 789]
    }
}
