package scu.wcc.byteIostream.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建对象
        File file = new File("C:\\Users\\10475\\Desktop\\IOTest\\1.txt");
        FileOutputStream fos = new FileOutputStream(file);
        //写入数据
        fos.write(99999);

        //释放资源
        fos.close();
    }
}