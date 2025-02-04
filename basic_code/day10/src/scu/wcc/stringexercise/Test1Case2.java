package scu.wcc.stringexercise;

import java.util.Scanner;

public class Test1Case2 {
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
            String s = getRoma(c);
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

    //JDK12之后的新特性：赋值给同一个变量时可以直接令变量=switch()，完成赋值
    public static String getRoma(char c){

        String str = switch(c){
            case '1' ->"Ⅰ";
            case '2' ->"Ⅱ";
            case '3' ->"Ⅲ";
            case '4' ->"Ⅳ";
            case '5' ->"Ⅴ";
            case '6' ->"Ⅵ";
            case '7' ->"Ⅶ";
            case '8' ->"Ⅷ";
            case '9' ->"Ⅸ";
            default -> "";

        };
        return str;
    }
}
