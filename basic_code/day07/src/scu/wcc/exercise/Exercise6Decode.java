package scu.wcc.exercise;

import java.util.Scanner;

public class Exercise6Decode {
    public static void main(String[] args){

        int[]arr = DecodePwd();
        int pwd =0;
        for (int i = 0; i < arr.length; i++) {
            pwd = pwd *10;
            pwd+=arr[i];
        }
        System.out.println("解密后密码："+pwd);
    }

    public static int[] DecodePwd(){
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
            if(number<5){
                number = number +5 ;
            }else{
                number =number -5;
            }
            arr[i] = number;

        }
        return arr;
    }
}
