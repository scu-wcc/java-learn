package scu.wcc.charIostream.readdemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A01_Demo1 {
    public static void main(String[] args) throws IOException {
        //使用字符流读取数据
        FileReader fr = new FileReader("IOTest\\a.txt");

        System.out.println(1);
        int ch;
        while((ch= fr.read())!=-1){
            System.out.print((char)ch);
        }

        fr.close();

    }
}
