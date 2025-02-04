package scu.wcc.homework;

import java.util.Random;
import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
         String str = sc.next();

         char[] arr = str.toCharArray();
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
