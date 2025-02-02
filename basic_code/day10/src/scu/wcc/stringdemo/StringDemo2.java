package scu.wcc.stringdemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        System.out.println("请输入一个金额：");
        Scanner sc = new Scanner(System.in);

        int money;
        while(true){
            money = sc.nextInt();
            if(money>=0 && money<=9999999){
                break;
            }else{
                System.out.println("金额无效！请重新输入：");
            }
        }
        String str = "";
        while(true){
            int ge = money%10;
            str = getChineseNumber(ge)+str;
            money = money/10;
            if(money == 0){
                break;
            }
        }

        int count = 7-str.length();
        for (int i = 0; i < count; i++) {
            str = "零" +str;
        }


        char[] strArr ={'佰','拾','万','仟','佰','拾','元'} ;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = result+ c +strArr[i];
        }
        System.out.println(result);

    }

    public static char getChineseNumber(int number){
        char[] arr = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        return arr[number];
    }
}
