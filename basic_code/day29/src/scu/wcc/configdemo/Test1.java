package scu.wcc.configdemo;

import java.util.Properties;

public class Test1 {
    public static void main(String[] args) {
        //Properties: Map集合体系的一员
        Properties prop = new Properties();

        prop.put("aaa", "1");
        prop.put("bbb", "2");
        prop.put("ccc", "3");
        prop.put("ddd", "4");

        System.out.println(prop);
    }
}
