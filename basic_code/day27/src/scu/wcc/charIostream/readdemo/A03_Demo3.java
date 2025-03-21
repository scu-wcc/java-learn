package scu.wcc.charIostream.readdemo;

import java.io.FileReader;
import java.io.IOException;

public class A03_Demo3 {
    public static void main(String[] args) throws IOException {
        //使用字符流读取数据
        FileReader fr = new FileReader("IOTest\\a.txt");
        FileReader fr2 = new FileReader("IOTest\\aCopy.txt");

        System.out.println(1);
        int ch;
        while((ch= fr.read())!=-1){
            System.out.print((char)ch);
        }

        fr.close();

    }
}
