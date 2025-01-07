package scu.wcc.ifandswitch;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //JDL7之后switch的表达式可以是String类型
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入星期数：");
        int week = sc.nextInt();
        //case 后面的值只能是字面量，不能是变量
        switch (week){
            //不要忘记在每个case结束后面加break，否则会导致case穿透。
            case 1 :
                System.out.println("跑步");
                break;
            case 2 :
                System.out.println("游泳");
                break;
            case 3 :
                System.out.println("慢走");
                break;
            case 4 :
                System.out.println("动感单车");
                break;
            case 5 :
                System.out.println("拳击");
                break;
            case 6 :
                System.out.println("爬山");
                break;
            case 7 :
                System.out.println("好好吃一顿");
                break;
            default:
                //default可以省略，并且位置任意
                System.out.println("没有这个星期数");
                break;
        }

        //JDK12后switch新特性: case value -> {}; 这种格式下不需要break；
        switch (week){
            //不要忘记在每个case结束后面加break，否则会导致case穿透。
            case 1 -> System.out.println("跑步");
            case 2 -> System.out.println("游泳");
            case 3 -> System.out.println("慢走");
            case 4 -> System.out.println("动感单车");
            case 5 -> System.out.println("拳击");
            case 6 -> System.out.println("爬山");
            case 7 -> System.out.println("好好吃一顿");
            default -> System.out.println("没有这个星期数");

        }

    }
}
