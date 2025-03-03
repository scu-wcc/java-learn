package scu.wcc.datedemo.jdk7date;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) throws ParseException {
        //Calender:日历对象
        Calendar c = Calendar.getInstance();
        //System.out.println(c);

        //默认获取当前时间
        Date d = c.getTime();
        System.out.println(d);

        //设置时间
        c.setTime(new Date(0L));

        int year=c.get(Calendar.YEAR);
        System.out.println(year); //1970

        //设置年份
        c.set(Calendar.YEAR,2023);
        System.out.println(c.get(Calendar.YEAR)); //2023
    }
}


