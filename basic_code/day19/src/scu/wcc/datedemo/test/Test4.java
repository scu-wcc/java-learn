package scu.wcc.datedemo.test;

import java.time.LocalDate;
import java.util.Calendar;

public class Test4 {
    public static void main(String[] args) {
        int year = 2000;
        //JDK7
        //设置时间为后一年的1月1号
        Calendar c = Calendar.getInstance();
        c.set(year+1,Calendar.JANUARY,1);
        c.add(Calendar.DAY_OF_YEAR,-1);
        int result = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(result);//366

        //JDK8
        LocalDate ld1 = LocalDate.of(2000,3,1);
        LocalDate ld2 =  ld1.minusDays(1);
        System.out.println(ld2);
        int result2 = ld2.getDayOfMonth();
        System.out.println(result2);//29

        //直接使用方法判断
        System.out.println(ld1.isLeapYear()); //true
    }
}
