package scu.wcc.homework;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number =sc.nextInt();
        System.out.println(number+"是"+getBitOfNumber(number)+"位数字");
    }
    public static int getBitOfNumber(int number){
        int count=0;
        if (number!=0){
            while (number != 0) {
                count++;
                number /= 10;
            }
            return count;
        }else{
            return 1;
        }
    }
}
