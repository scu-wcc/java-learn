package scu.wcc.homework;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("数字1：");
        int num1=sc.nextInt();
        System.out.println("数字2：");
        int num2=sc.nextInt();
        if(num1>num2){
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
        }
        int sum=0;
        for (int i = num1; i <=num2 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
