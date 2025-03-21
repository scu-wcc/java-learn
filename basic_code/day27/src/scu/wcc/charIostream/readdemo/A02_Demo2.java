package scu.wcc.charIostream.readdemo;

import java.io.FileReader;
import java.io.IOException;

public class A02_Demo2 {
    public static void main(String[] args) throws IOException {
        //使用字符流读取数据
        FileReader fr = new FileReader("IOTest\\a.txt");

        char[] chars = new char[3];
        int len;
        while((len= fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }

        fr.close();

    }
}
