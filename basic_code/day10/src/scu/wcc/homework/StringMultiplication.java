package scu.wcc.homework;

import java.util.Scanner;

public class StringMultiplication {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        String num1 = sc.next();

        System.out.println("请输入第二个数字：");
        String num2 = sc.next();

        int realNum1=stringToInt(num1);
        int realNum2=stringToInt(num2);

        int result = realNum1*realNum2;

        String strResult = result+"";

        System.out.println(strResult);


    }
    public static int stringToInt(String str){
        int realNum = 0;
        int len =str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            int charNumber = c - '0';
            realNum= realNum*10+charNumber;
        }
        return realNum;
    }
}
