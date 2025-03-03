package scu.wcc.datedemo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        //计算自己活了多少天
        //JDK7
        String birthday = "2000年1月1日";
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdate = sdf.parse(birthday);
        long birthTime = birthdate.getTime();
        long nowTime = System.currentTimeMillis();
        long result1 = nowTime -  birthTime;
        System.out.println(result1 / 1000 / 60 /60 /24);

        //JDK8
        LocalDate ld1 = LocalDate.of(2000,1,1);
        LocalDate ld2 = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1,ld2);
        System.out.println(days);
    }
}
