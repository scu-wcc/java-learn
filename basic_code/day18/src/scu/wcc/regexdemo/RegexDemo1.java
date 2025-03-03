package scu.wcc.regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
       String regex1 = "1[3-9]\\d{9}";
        System.out.println("13012012138".matches(regex1));
        System.out.println("11012012138".matches(regex1));
        System.out.println("13012345678".matches(regex1));


       String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";

       // \\表示 “\”, \.表示转义，将通配符‘.’ 转换成普通的'.'
       String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("1047532566@qq.com".matches(regex3));
    }
}
