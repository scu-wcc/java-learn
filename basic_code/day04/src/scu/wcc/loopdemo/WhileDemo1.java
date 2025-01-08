package scu.wcc.loopdemo;

import java.util.Scanner;

public class WhileDemo1 {
    public static void main(String[] args) {
//        int i=1;
//        while(i<=100){
//            System.out.println(i);
//            i++;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = sc.nextInt();
        int temp = number;
        int reversal=0;
        //回文数
        while(0!=temp){
            reversal*=10;
            reversal+= temp%10;
            temp = temp/10;
        }
        if(reversal == number){
            System.out.println(number+"是回文数。");
        }else{
            System.out.println(number+"不是回文数。");
        }
        //不使用/ * % 求得两数的商和余数
        System.out.println("输入被除数：");
        int num1 = sc.nextInt();
        System.out.println("输入除数：");
        int num2 = sc.nextInt();
        int count = 0;
        while(num1>=num2){
            count++;
            num1 = num1-num2;
        }
        System.out.println("商是："+count);
        System.out.println("余数是"+num1);
    }
}
