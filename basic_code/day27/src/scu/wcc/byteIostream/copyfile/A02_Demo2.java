package scu.wcc.byteIostream.copyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A02_Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IOTest\\a.txt");
        FileOutputStream fos = new FileOutputStream("IOTest\\aCopy.txt");

        //使用fis.read()的空参读取一次一个字节，太慢了
        //使用带参，传递数组，数组多大，一次就读取多少个字节
        byte[] arr = new byte[2];
        int len1 = fis.read(arr);
        fos.write(arr);
        System.out.println(new String(arr,0,len1));

        int len2 = fis.read(arr);
        fos.write(arr);
        System.out.println(new String(arr,0,len2));

        int len3 = fis.read(arr);
        fos.write(arr);
        System.out.println(new String(arr,0,len3));




        fis.close();
        fos.close();
    }
}
