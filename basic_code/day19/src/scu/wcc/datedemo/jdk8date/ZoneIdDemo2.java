package scu.wcc.datedemo.jdk8date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneIdDemo2 {
    public static void main(String[] args) {
        //获取特定格式的时间字符串
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("America/Cuiaba"));

        //解析/格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");

        System.out.println(dtf.format(zdt));
    }
}
