package scu.wcc.homework;
import java.util.Scanner;


public class Homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int num1=sc.nextInt();
        System.out.println("输入第二个数字：");
        int num2=sc.nextInt();
        boolean result = num1==6 || num2==6 || (num1+num2)%6 ==0;
        System.out.println(result);
    }
}
