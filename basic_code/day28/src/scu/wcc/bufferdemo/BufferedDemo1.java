package scu.wcc.bufferdemo;

import java.io.*;

public class BufferedDemo1 {
    public static void main(String[] args) throws IOException {

        //创建字节缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufferIOTest\\poem.txt"));
        BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("bufferIOTest\\poem_copy.txt"));

        //底层做事的还是FilexxxputSteam;
        int b;//接收读取到的数据
        while((b=bis.read())!=-1){
            bos.write(b);
        }

        bos.close();
        bis.close();

    }
}
