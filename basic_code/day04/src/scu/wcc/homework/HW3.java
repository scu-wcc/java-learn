package scu.wcc.homework;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存储的年限：");
        int year = sc.nextInt();
        System.out.println("输入存储的金额：");
        int money = sc.nextInt();

        double result;
        switch(year){
            case 1:
                result = money+money*0.0225*1;
                System.out.println(year+"年后本息总额为："+ result);
                break;

            case 2:
                result = money+money*0.027*2;
                System.out.println(year+"年后本息总额为："+ result);
                break;

            case 3:
                result = money+money*0.0325*3;
                System.out.println(year+"年后本息总额为："+ result);
                break;

            case 5:
                result = money+money*0.036*5;
                System.out.println(year+"年后本息总额为："+ result);
                break;

            default:
                System.out.println("没有该年限选择。");
        }

    }
}
