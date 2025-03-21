package scu.wcc.byteIostream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\10475\\Desktop\\IOTest\\1.txt");
        //写入数据
        fos.write(97);
        //释放资源
        fos.close();
    }
}