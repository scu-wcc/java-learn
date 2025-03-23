package scu.wcc.convertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("convertTest/convertsteam.txt"),"GBK"));

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }


    }
}
