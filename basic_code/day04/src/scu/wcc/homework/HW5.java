package scu.wcc.homework;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入税前工资：");
        int allowance = sc.nextInt();
        double preMoney = allowance*0.9;
        double realMoney;
        double exceed=preMoney-5000;

        if(exceed>=0 && exceed<=3000){
            realMoney = preMoney - exceed*0.03;

        }else if(exceed>3000&&exceed<=12000){
            realMoney = preMoney - 3000*0.03 -(exceed-3000)*0.1;

        }else if(exceed>12000&&exceed<=25000){
            realMoney = preMoney - 3000*0.03 -9000*0.1-(exceed-12000)*0.2;

        }else if(exceed>25000&&exceed<=35000){
            realMoney = preMoney - 3000*0.03 -9000*0.1-13000*0.2-(exceed-25000)*0.25;

        }else if(exceed>35000&&exceed<=55000){
            realMoney = preMoney - 3000*0.03 -9000*0.1-13000*0.2-10000*0.25-(exceed-35000)*0.3;

        }else if(exceed>55000&&exceed<=80000){
            realMoney = preMoney - 3000*0.03 -9000*0.1-13000*0.2-10000*0.25-20000*0.3-(exceed-55000)*0.35;

        }else if(exceed>80000){
            realMoney = preMoney - 3000*0.03 -9000*0.1-13000*0.2-10000*0.25-20000*0.3-25000*0.35-(exceed-80000)*0.45;

        }else{
            realMoney = preMoney;
        }
        System.out.println("税后工资："+realMoney);
    }
}
