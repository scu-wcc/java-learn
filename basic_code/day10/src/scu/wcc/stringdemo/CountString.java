package scu.wcc.stringdemo;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        int len = str.length();
        int numberCount=0;
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(c>47 && c<58){
                numberCount++;
            }else if(c>64 && c<91){
                uppercaseCount++;
            }else if(c>96 && c<122){
                lowercaseCount++;
            }
        }
        System.out.println("数字字符有："+numberCount+"个。");
        System.out.println("大写字母字符有："+uppercaseCount+"个。");
        System.out.println("小写字母字符有："+lowercaseCount+"个。");
    }
}
