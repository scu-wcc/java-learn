package scu.wcc.homework;

import java.util.Random;

public class HWImprove11 {
    //较HW11更具通用性
    public static void main(String[] args) {
        Random r =new Random();
        int[] arr =  {2,588,888,1000,10000,99999,999999};
        int[] brr=new int[arr.length];
        int index =0;
        boolean flag;
        while(index<arr.length){
            int i =r.nextInt(arr.length);
            flag = getEqual(brr,arr[i]);
            if(!flag){
                brr[index] = arr[i];
                index++;
                System.out.println(arr[i]+"元的奖金被抽出。");
            }
        }

    }
    public static boolean getEqual(int [] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }
}
