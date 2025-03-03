package scu.wcc.datedemo.jdk7date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) throws ParseException {
        String date = "2000-11-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");

        System.out.println(sdf2.format(sdf1.parse(date)));
    }
}


