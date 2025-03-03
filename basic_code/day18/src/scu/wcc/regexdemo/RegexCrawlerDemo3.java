package scu.wcc.regexdemo;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCrawlerDemo3 {
    public static void main(String[] args) {
        String str = "java5自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，\n" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";


        //1.有条件的爬取，但只获取部分子串
        //?i:忽略大小写
        //?：表示前面的子串：((?i)Java)
        //=：?后要跟随的数据，但获取的时候只获取?
        //只匹配java8、java11、java17，并且只读取它们的java部分：group():只返回(?i)java
        String regex1 = "((?i)Java)(?=8|11|17)";

        //2.爬取时获取整串
        String regex2 = "((?i)java)(?:8|11|17)";
        //等价于
        String regex3 = "((?i)java)(8|11|17)";

        //3.爬取的时候不要某些特定的符号
        //!:表示当(?i)java后面跟随的是8|11|17时，一整串视为不匹配
        //group()只返回:?
        String regex4 = "((?i)java)(?!8|11|17)";
        // System.out.println(m.group()); -> java

        Pattern p = Pattern.compile(regex4);
        Matcher m =p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }

    }
}
