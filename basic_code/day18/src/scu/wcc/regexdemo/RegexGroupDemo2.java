package scu.wcc.regexdemo;

public class RegexGroupDemo2 {
    public static void main(String[] args) {
        //复用分组：在正则表达式内部用 \\组号, 在正则表达式外部用 $组号
        String str1 = "我要学学编编编编程程程程程程程程程程程程程程程程程程程程";
        System.out.println(str1.replaceAll("(.)\\1+","$1"));

    }
}
