package scu.wcc.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //StringJoiner是JDK8添加的新特性，用于拼接字符串。
        //StringJoiner的构造方法必须带参数：
        //StringJoiner("间隔符号")：拼接时自动添加间隔。
        StringJoiner sj1 = new StringJoiner("---");

        //add():目前只能添加字符串。数字，字符都不行
        sj1.add("123").add("abc").add("d");

        int len = sj1.length();
        System.out.println(len); // 13
        System.out.println(sj1); // 123---abc---d
        //转换成字符串
        String str1 = sj1.toString();

        //StringJoiner("间隔符号","开头符号","结尾符号")：拼接时自动添加间隔。
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("1").add("2").add("3").add("4").add("5");

        int len2 = sj2.length();
        System.out.println(len2); // 15
        System.out.println(sj2); // [1, 2, 3, 4, 5]
        String str2 = sj2.toString();
        System.out.println(str2); //[1, 2, 3, 4, 5]
    }
}
