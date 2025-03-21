package scu.wcc.byteIostream.outputstream;


import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStreamDemo4 {
    public static void main(String[] args) throws IOException {

        //续写: 在构造方法中传入true，将append默认的false替换掉。
        FileOutputStream fos = new FileOutputStream("C:\\Users\\10475\\Desktop\\IOTest\\a.txt",true);

        String str1 = "Hello World!";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        /*换行:
            Windows: \r\n
            Linux: \n
            MacOS: \r
         */

        String wrap = "\r\n";
        byte[] wrapBytes = wrap.getBytes();
        fos.write(wrapBytes);

        String str2 = "I like studying";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);

        fos.write(wrapBytes);

        String str3 = "666, salt not salt";
        byte[] bytes3 = str3.getBytes();
        fos.write(bytes3);

        fos.write(wrapBytes);

        fos.close();




    }
}
