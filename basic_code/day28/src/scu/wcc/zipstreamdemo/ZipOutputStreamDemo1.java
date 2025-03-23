package scu.wcc.zipstreamdemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\JAVASE\\a.txt");
        File dest = new File("D:\\JAVASE\\a.zip");


        toZip(src,dest);

    }

    private static void toZip(File src, File dest) throws IOException {

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        //创建ZipEntry对象，表示压缩包中的每一个条目
        ZipEntry entry  =new ZipEntry("a.txt");
        zos.putNextEntry(entry);

        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b=fis.read())!=-1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();



    }


}
