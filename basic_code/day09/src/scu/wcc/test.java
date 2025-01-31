package scu.wcc;

import java.util.Scanner;
/*
    测试Scanner.next()的接收方式
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("第一次输入：");
        String str1 = sc.next();
        System.out.println(str1);

        System.out.println("第二次输入：");
        String str2 = sc.next();
        System.out.println(str2);

        System.out.println("第三次输入：");
        String str3 = sc.next();
        System.out.println(str3);
    }
}
