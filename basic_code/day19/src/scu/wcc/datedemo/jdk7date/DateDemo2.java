package scu.wcc.datedemo.jdk7date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
        //将Date转换成特定格式字符串
        SimpleDateFormat sdf1 = new SimpleDateFormat();//空参，使用默认格式
        Date d1 = new Date();
        System.out.println(sdf1.format(d1)); //2025/3/3 下午5:52

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss  EE"); //带参，指定格式
        System.out.println(sdf2.format(d1)); // 2025年03月03日  17:54:28  周一


        //将特定字符串转成Date模式，可以用来获取该时间到原子时间的毫秒差
        String date = "2020-09-01 12点25分16秒";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH点mm分ss秒");//指定转换的字符串形式
        Date d2 = sdf3.parse(date);
        System.out.println(d2);//Tue Sep 01 12:25:16 CST 2020
        System.out.println(d2.getTime()); //1598934316000

    }
}


