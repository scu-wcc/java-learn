package scu.wcc.datedemo.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        String str = "123456789";

        String regex = "[0-9]|[1-9]\\d{0,9}";

        int result = 0;
        if(!str.matches(regex)){
            System.out.println("数据格式有误。");
        }else{
            System.out.println("数据格式正确。");
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                result*=10;
                result+= c-'0';
            }
            System.out.println(result);
        }
    }
}

