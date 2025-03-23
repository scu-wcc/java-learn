package scu.wcc.convertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertTest1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("convertTest/convertsteam.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("convertTest/a.txt",Charset.forName("UTF-8"));

        int ch ;
        while((ch=fr.read())!=-1){
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
