package scu.wcc.stringexercise;

import java.util.Scanner;

/*由于字符串的不可变，想要改变字符串中的字符，一般有两种方式：
    1.使用subString进行截取拼接。

    2.使用字符数组创建字符串，在字符数组中改变。
    (str.toCharArray可以将字符串直接转变成字符数组)

 */

public class Test2Case1 {
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

        for (int i = 0; i < str1.length(); i++) {
            if(str1.equals(str2)){
                return true;
            }else{
                StringBuilder sb = new StringBuilder();
                String subStr = str1.substring(1);
                sb.append(subStr);
                str1 = sb.append(str1.charAt(0)).toString();
            }
        }
        return false;
    }
}
