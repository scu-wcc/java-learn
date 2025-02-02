package scu.wcc.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        //使用StringBuilder的场景：
        //1.字符串的拼接
        //2.字符串的反转
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String userInputString = sc.next();
        String reverseString = new StringBuilder(userInputString).reverse().toString();

        if (userInputString.equals(reverseString)) {
            System.out.println("是对称数");
        } else {
            System.out.println("不是对称数");
        }

    }
}
