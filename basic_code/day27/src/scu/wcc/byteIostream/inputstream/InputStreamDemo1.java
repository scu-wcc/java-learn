package scu.wcc.byteIostream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //读取文件内容
        //创建读取文件对象
        FileInputStream fis = new FileInputStream("IOTest/a.txt");

        //读取内容
/*
        int b1 = fis.read();
        System.out.println((char)b1);
*/
        int read;
        while((read=fis.read())!=-1){
            System.out.print((char)read );

        }
        System.out.println(fis.read());


        //关闭连接
        fis.close();

    }

}
