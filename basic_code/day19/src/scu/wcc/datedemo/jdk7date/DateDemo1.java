package scu.wcc.datedemo.jdk7date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1); //Mon Mar 03 17:40:31 CST 2025

        Date d2 = new Date(1000);
        System.out.println(d2); //Thu Jan 01 08:00:01 CST 1970 :计算机原子时间(北京时间)+1000ms
    }

}


