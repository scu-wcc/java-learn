package scu.wcc.arithmeticoperator;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args){

        //字符串拼接：从左往右，字符串参与运算时执行的是拼接操作。
        System.out.println("123"+123);
        System.out.println(1+99+"你好");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        int ge = number%10;
        number = number/10;

        int shi = number%10;
        number = number/10;

        int bai = number%10;
        number = number/10;

        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);
    }
}
