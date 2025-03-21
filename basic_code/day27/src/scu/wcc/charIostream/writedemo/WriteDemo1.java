package scu.wcc.charIostream.writedemo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("IOTest\\a.txt");

        fw.write("你好啊，朋友。你今天吃饭了吗？",0,3);

        char[] arr = {'你','们','好'};

        fw.write(arr);
        fw.close();

    }
}
