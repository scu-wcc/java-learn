package scu.wcc.homework;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.println("输入第二个整数：");
        int number2 = sc.nextInt();
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int flag = sc.nextInt();
        switch(flag){
            case 1-> System.out.println(number1+"+"+number2+"="+(number2+number1));
            case 2-> System.out.println(number1+"-"+number2+"="+(number1+number2));
            case 3-> System.out.println(number1+"*"+number2+"="+(number1*number2));
            case 4-> System.out.println(number1+"/"+number2+"="+(number1/number2));
        }
    }
}
