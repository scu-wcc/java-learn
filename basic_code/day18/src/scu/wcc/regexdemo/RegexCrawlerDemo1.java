package scu.wcc.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCrawlerDemo1 {
    public static void main(String[] args) {
        //爬虫：通过正则表达式获取文本中特定的字符串
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，\n" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //1.获取正则表达式对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2.获取文本匹配器对象
        Matcher m = p.matcher(str);

        //m.find:boolean：在str中寻找符合p的子串并记录索引的起始位置
        //m.group:String: 根据find()方法得到的索引位置对该子串进行返回
        //注：find()方法读取到子串后指针会停在该子串的结束索引+1的位置，不会从头开始读取。
        while(m.find()){
            //group():每次都只返回当前子串
            String result = m.group();
            System.out.println(result);
        }

    }
}
