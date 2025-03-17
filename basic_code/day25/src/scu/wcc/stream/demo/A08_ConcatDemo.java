package scu.wcc.stream.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class A08_ConcatDemo {
    public static void main(String[] args) {
        //合并
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,2,3,4,5,6);
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,6,9,4,1,4,1,0,258,1,41,2,10);

        Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println); //按顺序合并。

    }
}
