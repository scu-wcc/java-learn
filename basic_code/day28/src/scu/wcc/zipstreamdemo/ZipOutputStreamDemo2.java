package scu.wcc.zipstreamdemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //压缩一整个文件
        //源文件
        File src = new File("D:\\JAVASE\\aaa");
        //目的地文件与源文件关联
        File dest = new File(src.getParent(),src.getName()+".zip");
        //System.out.println(dest);

        ZipOutputStream zos =new ZipOutputStream(new FileOutputStream(dest));

        System.out.println(src.getName());
        toZip(src,zos,src.getName());


        zos.close();

    }
    public static void toZip(File src, ZipOutputStream zos, String address) throws IOException {

        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                //System.out.println(file.getName());
                ZipEntry entry =new ZipEntry(address+"\\"+file.getName());
                zos.putNextEntry(entry);
                int b;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                zos.closeEntry();
                fis.close();

            }else{
                toZip(file,zos,address+"\\"+file.getName());

            }
        }

    }

}
