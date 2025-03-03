package scu.wcc.datedemo.jdk8date;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        //获取所有时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        System.out.println(zoneIds.size());

        //获取当前或指定的时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Shanghai

        ZoneId zoneId1 =  ZoneId.of("America/Cuiaba");
        System.out.println(zoneId1);//America/Cuiaba
    }
}
