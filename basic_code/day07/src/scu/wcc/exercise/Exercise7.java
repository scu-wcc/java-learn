package scu.wcc.exercise;

import java.util.Random;

public class Exercise7 {
    //day06HW11:避免当多次抽奖后少数奖项需要多次循环才能抽到，导致程序运行次数增多
    public static void main(String[] args) {
        int[] arr = new int[]{2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] =temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
