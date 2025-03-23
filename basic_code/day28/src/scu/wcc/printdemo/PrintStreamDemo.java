package scu.wcc.printdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //字节打印流
        PrintStream ps = new PrintStream(new FileOutputStream("printTest\\a.txt"),true, Charset.forName("UTF-8"));
        ps.write(97);//a
        ps.println(97);//97
        ps.print("你好啊");
        ps.printf("%s，你今天吃饭了吗？%s", "王哥","吃了");
        ps.print(123456789);

        ps.close();

    }
}
