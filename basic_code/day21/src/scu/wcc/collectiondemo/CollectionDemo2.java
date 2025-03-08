package scu.wcc.collectiondemo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> coll = new HashSet<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("abc");
        coll.add("abc"); //返回false，元素重复

        Iterator<String> it = coll.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            /*出现的结果其一：
            aaa
            ccc
            bbb
            abc*/
        }
        it.next();

    }
}
