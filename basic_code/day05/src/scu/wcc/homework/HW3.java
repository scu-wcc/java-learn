package scu.wcc.homework;

import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        Random r =new Random();
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("数组元素和为："+sum);
    }
}
