package scu.wcc.homework;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("输入第二数：");
        int num2 = sc.nextInt();
        System.out.println("输入第三个数：");
        int num3 = sc.nextInt();

        int min = num1<num2?num1:num2;
        min = min<num3?min:num3;
        System.out.println("最小值为："+min);
    }
}
