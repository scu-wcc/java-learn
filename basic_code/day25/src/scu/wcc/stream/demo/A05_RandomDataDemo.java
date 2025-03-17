package scu.wcc.stream.demo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class A05_RandomDataDemo {
    public static void main(String[] args) {
        Stream.of("aaa","bbb","ccc").forEach(str -> System.out.println(str));

        System.out.println("--------------------------------------------");
        int [] arr = {1,2,3,4,5,6};
        Stream.of(arr).forEach(i -> System.out.println(i)); //[I@6d311334

        System.out.println("--------------------------------------------");
        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(2);
        list2.add(2);
        list2.add(2);

        ArrayList<Integer> list3 =new ArrayList<>();
        list3.add(3);
        list3.add(3);
        list3.add(3);

        Stream.of(list1,list2,list3).forEach(list -> System.out.println(list));
    }
}
