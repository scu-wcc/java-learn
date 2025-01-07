package scu.wcc.ifandswitch;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入星期数：");
        int week = sc.nextInt();
        switch(week){
            case 1,2,3,4,5-> System.out.println("工作日");
            case 6,7->System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
