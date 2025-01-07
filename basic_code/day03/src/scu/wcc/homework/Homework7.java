package scu.wcc.homework;
import java.util.Scanner;


public class Homework7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个三位数：");
        int num = sc.nextInt();
        int ge= num%10;
        int shi =num/10%10;
        int bai = num/100%10;
        System.out.println("和为："+(ge+shi+bai));


    }
}
