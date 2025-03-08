package scu.wcc.lambdademo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] arr={"a","aaa","aa","aaaaaaa","aaa"};
        Arrays.sort(arr,((o1, o2) -> o1.length()-o2.length()));
        System.out.println(Arrays.toString(arr));
    }
}
