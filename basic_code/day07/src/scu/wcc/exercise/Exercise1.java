package scu.wcc.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double ticket = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("0 经济舱，1 头等舱：");
        int grade = sc.nextInt();

        if(month>=5 && month<=10){
            ticket = getPrice(ticket,grade,0.85,0.9);
        }else if((month>=1&&month<=4)||(month>=11&&month<=12)){
            ticket = getPrice(ticket,grade,0.65,0.7);
        }else{
            System.out.println("没有该月份");
        }
        System.out.println("折后机票价钱："+ticket);
    }

    public static double getPrice(double ticket, int grade, double v0,double v1){
        if(grade == 0){
            return ticket*v0;
        }else if(grade == 1){
            return ticket*v1;
        }else{
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

}
