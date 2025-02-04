package scu.wcc.homework;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String userInputString = sc.next();

        int charCount = 0;
        int numberCount = 0;
        int otherCount=0;

        char[] arr = userInputString.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            char c = arr[i];
            if((c>='A'&&c<'Z') || (c>='a'&&c<'z')){
                charCount++;
            }else if(c>='0' && c<='9'){
                numberCount++;
            }else{
                otherCount++;
            }
        }

        System.out.println("英文字母有"+charCount+"个。");
        System.out.println("数字有"+numberCount+"个。");
        System.out.println("其他字符有"+otherCount+"个。");

    }
}
