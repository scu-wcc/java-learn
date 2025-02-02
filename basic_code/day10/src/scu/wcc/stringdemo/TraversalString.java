package scu.wcc.stringdemo;

import java.util.Scanner;

public class TraversalString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //获取字符串的长度
        int len = str.length();
        for (int i = 0; i < len; i++) {
            //获取对应索引处的字符
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
