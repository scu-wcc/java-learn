package scu.wcc.listdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        //列表迭代器：遍历时可以添加元素
        ListIterator<String> it=  list.listIterator();
        while(it.hasNext()){
            String str= it.next();
            if(str == "bbb"){
                it.add("QQQ");
            }

            System.out.println(str);
        }

        System.out.println(list); //[aaa, bbb, QQQ, ccc]

        //普通for遍历
        for(int i=0;i<list.size();i++){
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
