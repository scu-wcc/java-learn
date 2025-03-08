package scu.wcc.collectiondemo;

import java.util.Collection;
import java.util.HashSet;

public class EnforceForDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new HashSet<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("abc");

        for (String s : coll) {
            System.out.println(s);
            /*
            aaa
            ccc
            bbb
            abc
             */
        }
    }
}
