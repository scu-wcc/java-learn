package scu.wcc.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGreedy {
    public static void main(String[] args) {
        String str = "abbbbbbbbbbbbbbbbbbbb";

        //贪婪匹配
        Pattern p = Pattern.compile("ab+");
        Matcher m  = p.matcher(str);
        m.find();
        System.out.println(m.group());//abbbbbbbbbbbbbbbbbbbb

        //懒惰匹配
        Pattern p2 = Pattern.compile("ab+?");
        Matcher m2  = p2.matcher(str);
        m2.find();
        System.out.println(m2.group());//ab
    }
}
