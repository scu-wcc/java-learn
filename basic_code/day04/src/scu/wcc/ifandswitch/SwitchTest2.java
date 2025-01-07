package scu.wcc.ifandswitch;

import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要选择的服务：");
        int choose = sc.nextInt();
        switch(choose){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预定");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }

    }
}
