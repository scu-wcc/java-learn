package scu.wcc.byteIostream.copyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A01_Demo1 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\JAVASE\\video1.mp4");
        FileOutputStream fos = new FileOutputStream("IOTest\\copy1.mp4");


        int b;
        long start = System.currentTimeMillis();
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        long end = System.currentTimeMillis();

        fos.close();
        fis.close();
        System.out.println("总共用时："+(end-start)+"毫秒");//大约用时五分钟
    }
}
