package scu.wcc.charIostream.writedemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IOTest\\a.txt");
        FileWriter fw =new FileWriter("IOTest\\aCopy.txt");

        int len;
        char[] arr = new char[5];
        while((len = fr.read(arr))!=-1){
            fw.write(arr,0,len);
        }
        fw.close();
        fr.close();
        System.out.println();
    }
}
