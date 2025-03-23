package scu.wcc.bufferdemo;

import java.io.*;

public class BufferedDemo2 {
    public static void main(String[] args) throws IOException {

        //创建字节缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufferIOTest\\poem.txt"));
        BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("bufferIOTest\\poem_copy2.txt"));

        int len;
        byte[] bytes = new  byte[1024];
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
