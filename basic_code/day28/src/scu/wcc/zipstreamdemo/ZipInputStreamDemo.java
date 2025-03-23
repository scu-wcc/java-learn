package scu.wcc.zipstreamdemo;

import java.io.*;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStreamDemo {
    public static void main(String[] args) throws IOException {

        File src = new File("D:\\JAVASE\\aaa.zip");
        File dest = new File("D:\\JAVASE\\aaa");

        unZip(src, dest);

    }

    public static void unZip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while((entry=zip.getNextEntry())!=null){
            System.out.println(entry);

            //判断entry的类型
            if(entry.isDirectory()){
                File file = new File(dest,entry.toString());
                file.mkdirs();
            }else{

                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int ch;
                while((ch=zip.read())!=-1){
                    fos.write(ch);
                }

                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
