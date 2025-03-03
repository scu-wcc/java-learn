package scu.wcc.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCrawlerDemo2 {
    public static void main(String[] args) {
        String text = "来黑马程序员学习Java，\n" +
                "手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，\n" +
                "座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，\n" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";
        //手机号   [1-9][3-9]\\d{9}
        //邮箱：   \\w*@[a-zA-Z0-9]*(\\.\\w{2,3}){1,2}
        //座机电话  010-?\\d+
        //热线电话  400-?618-?\\d{3,10}

        //1.获取正则表达式对象
        Pattern p = Pattern.compile("([1-9][3-9]\\d{9})|\\w*@[a-zA-Z0-9]*(\\.\\w{2,3}){1,2}|(010-?\\d+)|(400-?618-?\\d{3,10})");

        //2.获取文本匹配器对象
        Matcher m =p.matcher(text);
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
