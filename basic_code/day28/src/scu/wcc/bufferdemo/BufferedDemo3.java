package scu.wcc.bufferdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedDemo3 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("bufferIOTest\\poem.txt"));

        //特有方法
        String line ;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        //关闭连接
    }

}
