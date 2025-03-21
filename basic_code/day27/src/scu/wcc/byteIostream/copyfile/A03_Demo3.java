package scu.wcc.byteIostream.copyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A03_Demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\JAVASE\\video1.mp4");
        FileOutputStream fos = new FileOutputStream("IOTest\\copy1.mp4");


        //一般使用1024倍数的数组
        byte[] arr = new byte[1024*1024*10];
        long start = System.currentTimeMillis();
        int len;
        while((len = fis.read(arr))!=-1){
            fos.write(arr,0,len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);//27ms读完了
    }
}
