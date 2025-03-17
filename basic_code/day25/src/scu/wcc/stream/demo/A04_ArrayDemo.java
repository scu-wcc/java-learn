package scu.wcc.stream.demo;

import java.util.Arrays;

public class A04_ArrayDemo {
    public static void main(String[] args) {
        //数组调用Arrays的静态方法
        int[] arr = {1,2,3,4,5,6};
        Arrays.stream(arr).filter(i->i>1).forEach(i-> System.out.println(i));

        System.out.println("===================================================");
        String[] arr2 = new String[] {"aaa","bbb","ccc"};
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }
}
