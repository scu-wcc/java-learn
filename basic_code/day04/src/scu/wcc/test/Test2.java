package scu.wcc.test;

import java.util.Scanner;

public class Test2 {
    //求平方根
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于1的整数：");
        int number = sc.nextInt();
        while(number<2){
            System.out.println("数字不满足，请重新输入：");
            number = sc.nextInt();
        }
        for (int i = 1; i <= number; i++) {
            if(i*i > number){
                System.out.println(number+"的平方根是："+(i-1));
                break;
            }
        }
    }
}
