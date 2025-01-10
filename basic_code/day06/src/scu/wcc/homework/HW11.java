package scu.wcc.homework;

import java.util.Random;

public class HW11 {
    public static void main(String[] args) {
        getAward();
    }
    public static void getAward(){
        Random r=new Random();
        String[] arr = {
                "888元的奖金被抽出",
                "588元的奖金被抽出",
                "10000元的奖金被抽出",
                "1000元的奖金被抽出",
                "2元的奖金被抽出"};
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            String temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] =temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
