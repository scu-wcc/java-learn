package scu.wcc.test;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("IOTest\\aCopy.txt");
        FileOutputStream fos =new FileOutputStream("IOTest\\aCopyToDecode.txt");

        //接收每次读取到的字节
        int b ;
        while ((b=fis.read())!=-1){
            fos.write(b^2);
        }

        fos.close();
        fis.close();
    }
}
