package scu.wcc.homework;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        int[] arr1 = {12,14,23,45,66,68,70,77,90,91};
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number =sc.nextInt();

        int[] arr2 =new int[11];
        int index=-1;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>number){
                index = i;
                break;
            }
            if(i==arr1.length-1){
                index = arr2.length-1;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(i<index){
                arr2[i] = arr1[i];
            }else if(i == index){
                arr2[i] = number;
            }else if(i>index){
                arr2[i] = arr1[i-1];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
