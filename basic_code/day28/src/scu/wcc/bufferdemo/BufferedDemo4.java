package scu.wcc.bufferdemo;

import java.io.*;

public class BufferedDemo4 {
    public static void main(String[] args) throws IOException {
        //字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferIOTest\\copy.txt"));

        //调用特有方法与BufferReader配合
        BufferedReader br =new BufferedReader(new FileReader("bufferIOTest\\poem.txt"));
        String line;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();

    }
}
