package scu.wcc.staticdemo2;

import java.util.StringJoiner;

public class ArrayUtil {
    //静态方法：用于工具类和测试类(main)
    //工具类：不用来描述事物的一种工具。
    //1.见名知意；2.构造方法私有化；3.静态方法

    private ArrayUtil(){}


    public static String printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",","[","]");
        for(int i : arr){
            sj.add(i+"");
        }
        return sj.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }

}
