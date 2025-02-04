package scu.wcc.stringexercise;

import java.util.Scanner;

public class Test2Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String userInputString = sc.next();
        String str = "deabc";
        boolean flag = checkEquals(userInputString,str);
        if(flag){
            System.out.println("成功匹配！");
        }else{
            System.out.println("匹配失败！");
        }

    }
    public static boolean checkEquals(String str1, String str2){
        //使用字符数组对字符串进行修改
        char[] arr = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            char first = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if(j!=arr.length-1){
                    arr[j] = arr[j+1];
                }else{
                    arr[j] = first;
                }
            }
            if(new String(arr).equals(str2)){
                return true;
            }
        }
        return false;

    }
}
