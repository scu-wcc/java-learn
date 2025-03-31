package scu.wcc.Internetdemo.exercise.exercise3;

import java.util.UUID;

public class UUidTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString().replace("-","");
        System.out.println(uuid);
        System.out.println(str);
    }
}
