package scu.wcc.homework;

import java.util.Scanner;

public class HW7 {
    //根据奇偶改变位置
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("输入数字的长度：");
        int length = sc.nextInt();

        int[] arr =new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"位。");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int[] arr2=new int[length];
        int left = 0;
        int right = length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr2[right] = arr[i];
                right--;
            }else{
                arr2[left] = arr[i];
                left++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
