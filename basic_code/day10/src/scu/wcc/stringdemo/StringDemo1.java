package scu.wcc.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        String result = amountConversion(number);
        System.out.println(result);
    }

    public static String amountConversion(int money){
        char[] strArr ={'零','佰','零','拾','零','万','零','仟','零','佰','零','拾','零','元'} ;
        char[] arr = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};

        int strIndex = strArr.length-2;
        while(money!=0){
            int arrIndex = money%10;
            money = money/10;
            char c = arr[arrIndex];
            strArr[strIndex] = c;
            strIndex = strIndex-2;
        }
        return new String(strArr);
    }
}
