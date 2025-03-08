package scu.wcc.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    //使用lambda来简化代码
    public static void main(String[] args) {
        Integer[] arr1 = {5,6,3,4,8,1,1};
        //使用匿名内部类
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr1));

        //使用lambda表达式(parameter1, pm2, ....) -> {方法体;}
        Integer[] arr2 = {5,3,9,3,53,6,4,21,0,2};
        Arrays.sort(arr2,(Integer o1,Integer o2 )-> {return o1-o2;});
        System.out.println(Arrays.toString(arr2));

        //lambda的简化写法：
        Integer[] arr3 = {5,3,9,3,53,6,4,21,0,2};
        Arrays.sort(arr3,(o1, o2)-> o1-o2);
        System.out.println(Arrays.toString(arr3));

    }


}
