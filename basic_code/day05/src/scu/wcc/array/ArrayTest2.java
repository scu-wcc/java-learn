package scu.wcc.array;

import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr=new int[10];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }
        double sum=0;
        double avg;
        int minCount=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }


        avg = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                minCount++;
            }
        }
        System.out.println("和："+sum);
        System.out.println("平均值："+avg);
        System.out.println("比平均值小的数据有："+minCount+"个");

    }
}
