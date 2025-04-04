package scu.wcc.loggingdemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        InputStream is = classLoader.getResourceAsStream("a.properties");

        Properties prop = new Properties();
        prop.load(is);
        System.out.println(prop);

    }

}
