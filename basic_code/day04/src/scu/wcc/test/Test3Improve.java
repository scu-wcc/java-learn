package scu.wcc.test;

import java.util.Scanner;

public class Test3Improve {
    //对于某些质数，从1-number需要循环很多次。
    //可以使用平方根来优化算法
    public static void main(String[] args) {
        //只需要判断在平方根内有无整数可以被整除即可。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = sc.nextInt();
        double sqrt = Math.sqrt(number);
        boolean flag = true;
        for (int i = 2; i <=sqrt ; i++) {
            if(number%i==0){
                flag =false;
                break;
            }
        }
        if(flag){
            System.out.println("是质数");
        }else{
            System.out.println("不是质数");
        }
    }
}
