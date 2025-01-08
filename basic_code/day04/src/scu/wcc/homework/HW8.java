package scu.wcc.homework;

import java.util.Scanner;

public class HW8 {
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
        int count=0;
        for (int i = num1; i <=num2 ; i++) {
            if(i%5==0 && i%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
