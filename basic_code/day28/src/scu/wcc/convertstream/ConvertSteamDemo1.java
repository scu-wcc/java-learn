package scu.wcc.convertstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConvertSteamDemo1 {
    public static void main(String[] args) throws IOException {
        //JDK11淘汰的方式
/*        InputStreamReader isr = new InputStreamReader(new FileInputStream("convertTest/convertsteam.txt"),"GBK");
        int ch;
        while((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();*/
        //替代方案: FileReader(File, Charset.forName)
        FileReader fr = new FileReader("convertTest/convertsteam.txt", Charset.forName("GBK"));
        int ch;
        while((ch=fr.read())!=-1){
            System.out.println(ch);
            System.out.println((char)ch);
        }
        fr.close();



    }
}
