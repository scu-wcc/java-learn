package scu.wcc.homework;

import java.util.Scanner;

public class CheckIDNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份证号码：");

        String userID = sc.next();
        boolean flag = checkIdNumber(userID);
        if(flag){
            System.out.println("号码合规！");
        }else{
            System.out.println("号码不合规！");
        }



    }

    public static boolean checkIdNumber(String id){
        int len = id.length();
        if(len!=18){
            return false;
        }
        char first = id.charAt(0);
        if(first == '0'){
            return false;
        }
        for (int i = 0; i < len; i++) {
            char c = id.charAt(i);
            if(i==len-1){
                if(c == 'X'){
                    break;
                }else if(c<'0' || c>'9'){
                    return false;
                }
            }else if(c<'0' || c>'9'){
                return false;
            }
        }
        return true;
    }
}
