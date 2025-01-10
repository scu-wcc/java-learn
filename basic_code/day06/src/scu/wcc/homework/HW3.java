package scu.wcc.homework;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个数：");
        int num2 = sc.nextInt();
        System.out.print("请输入第三个数：");
        int num3 = sc.nextInt();
        printOrder(num1,num2,num3);
    }
    public static void printOrder(int a,int b,int c){
        int min =a>b?b:a;
        min = min>c?c:min;

        int max=a>b?a:b;
        max = max>c?max:c;
        int mid = a+b+c - min -max;
        System.out.println("从大到小的顺序是： "+max+" "+mid+" "+min+" ");
    }
}
