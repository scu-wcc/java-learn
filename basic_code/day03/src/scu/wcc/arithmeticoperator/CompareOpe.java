package scu.wcc.arithmeticoperator;

import java.util.Scanner;

public class CompareOpe {
    public static void main(String[] args) {
        //比较运算符的结果为boolean：true / false
        System.out.println(2.2 == 20); //false
        System.out.println(2.2 != 20); //true
        System.out.println(20>=23.1); //false
        System.out.println(20<=23.1); //true

        Scanner sc = new Scanner(System.in);

        System.out.println("输入你的时髦度：");
        int num1=sc.nextInt();
        System.out.println("输入相亲对象的时髦度：");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("true,相亲成功！");
        }else{
            System.out.println("false,相亲失败！");
        }
    }
}
