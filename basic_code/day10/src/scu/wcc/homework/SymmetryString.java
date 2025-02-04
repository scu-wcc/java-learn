package scu.wcc.homework;

import java.util.Scanner;

public class SymmetryString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String userInputString = sc.next();

        boolean flag = check(userInputString);
        if(flag){
            System.out.println(userInputString+"是对称字符串。");
        }else{
            System.out.println(userInputString+"不是对称字符串。");
        }

    }

    public static boolean check(String str){
        StringBuilder sb = new StringBuilder(str);
        String result = sb.reverse().toString();

        if(str.equals(result)){
            return true;
        }else{
            return false;
        }
    }
}
