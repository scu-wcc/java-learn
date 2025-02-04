package scu.wcc.stringexercise;

import java.util.Scanner;

public class Test1Case1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个长度不超过九的纯数字字符串：");
        String str;
        while(true){
            str = sc.next();
            if(checkString(str)){
                break;
            }else{
                System.out.println("输入字符串非法，请重新输入：");
            }
        }
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            int charNumber = c - '0';
            String s = getRoma(charNumber);
            sb.append(s);
        }
        String result = sb.toString();
        System.out.println(result);
    }

    public static boolean checkString(String str){
        int len = str.length();
        if(len>9){
            return false;
        }


        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(c<'0' || c>'9'){
                return false;
            }
        }
        return true;
    }

    public static String getRoma(int number){
        String[] strArr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return strArr[number];
    }
}
