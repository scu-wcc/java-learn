package scu.wcc.homework;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入会员等级：");
        int grade = sc.nextInt();

        System.out.println("输入购买金额：");
        double money = sc.nextInt();

        if(grade == 0){
            System.out.println("普通顾客");
            if(money < 100){
                System.out.println("请支付："+money);
            }else{
                System.out.println("请支付："+money*0.9);
            }
        }else if(grade == 1){
            System.out.println("会员");
            if(money<200){
                System.out.println("请支付："+money*0.8);
            }else{
                System.out.println("请支付："+money*0.75);
            }
        }
    }
}
