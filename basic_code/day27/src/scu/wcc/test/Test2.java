package scu.wcc.test;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //加密操作：数据对同一个数进行异或操作两次得到的还是数据本身
        FileInputStream fis = new FileInputStream("IOTest\\aCopy.txt");
        FileOutputStream fos = new FileOutputStream("IOTest\\a.txt");

        int b;
        while((b = fis.read() )!=-1){
            fos.write(b^2);
        }

        fos.close();
        fis.close();
    }
}
