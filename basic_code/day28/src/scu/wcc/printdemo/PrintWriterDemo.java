package scu.wcc.printdemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        //字符打印流
        PrintWriter pw = new PrintWriter(new FileWriter("printTest\\a.txt"));

        pw.println("大家好");
        pw.print('你');
        pw.print('是');
        pw.print('谁');
        pw.print('？');
        pw.printf("为什么%s没有自动刷新?","print()");

        pw.close();
    }
}
