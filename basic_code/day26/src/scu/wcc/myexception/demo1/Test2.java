package scu.wcc.myexception.demo1;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test2 {
    public static void main(String[] args) throws ParseException {
        String format = "2022年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //还未运行就抛出的编译异常
        Date date = sdf.parse(format);
        System.out.println(date);


    }

}
