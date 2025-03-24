package scu.wcc.configdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.put("aaa", "1");
        prop.put("bbb", "2");
        prop.put("ccc", "3");
        prop.put("ddd", "4");

        //将prop写入文件中
        FileOutputStream file = new FileOutputStream("io_Test\\IOTest\\a.properties");


        prop.store(file,"test");

        file.close();
    }
}
