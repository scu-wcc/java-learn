package scu.wcc.configdemo;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //将配置文件中的内容读取到properties中
        Properties prop = new Properties();

        prop.put("1","aaaa");

        FileReader fr = new FileReader("io_Test\\IOTest\\a.properties");
        prop.load(fr);
        fr.close();

        System.out.println(prop);

    }
}
