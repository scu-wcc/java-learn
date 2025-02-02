package scu.wcc.stringdemo;

import java.util.Scanner;

public class ReversalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str =sc.next();
        str = reversal(str);
        System.out.println("反转后："+str);
    }

    public static String reversal(String str){
        if(str == null){
            return "";
        }
        String reversalStr = "";
        int len = str.length();
        for (int i = len-1; i >=0 ; i--) {
            char c = str.charAt(i);
            reversalStr = reversalStr + c;
        }
        return reversalStr;
    }
}
