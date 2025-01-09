package scu.wcc.homework;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        int[] arr =new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"位。");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int number=0;
        for (int i = 0; i < arr.length; i++) {
            number = number*10+arr[i];
        }
        System.out.println(number);
    }
}
