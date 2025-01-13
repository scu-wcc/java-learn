package scu.wcc.exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){

        int[]arr = encryptPwd();
        int newPwd =0;
        for (int i = 0; i < arr.length; i++) {
            newPwd = newPwd *10;
            newPwd+=arr[i];
        }
        System.out.println("加密后密码："+newPwd);
    }

    public static int[] encryptPwd(){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入密码：");
        int pwd = sc.nextInt();
        int count=0;
        int temp = pwd;
        while(temp!=0){
            count++;
            temp/=10;
        }
        int[] arr = new int[count];
        for (int i = 0; i <arr.length; i++) {
            int number = pwd%10;
            pwd/=10;
            number =(number+5)%10;
            arr[i] =number;
        }
        return arr;
    }
}
