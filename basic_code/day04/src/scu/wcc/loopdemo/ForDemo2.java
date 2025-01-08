package scu.wcc.loopdemo;

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int num1=sc.nextInt();
        System.out.println("输入第二个数：");
        int num2=sc.nextInt();
        if(num1>num2){
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
        }
        int count =0;
        for (int i = num1; i <num2; i++) {
            if(0==i%3 && 0==i%5)
                count++;
        }
        System.out.println(count);

    }
}
