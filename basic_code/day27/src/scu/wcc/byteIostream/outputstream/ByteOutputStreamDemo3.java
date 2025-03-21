package scu.wcc.byteIostream.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //write的三种写入方式
        File file = new File("C:\\Users\\10475\\Desktop\\IOTest\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);

        //write(int i);
/*        fos.write(97);
        fos.write(98);*/

        //使用byte[] arr作为参数
        byte[] arr = {97,98,99,100,101,102};
//        fos.write(arr);

        //write(byte[] arr, int startIndex, int len)
        fos.write(arr,1,3);







        fos.close();
    }
}
