package com.itheima.ui;

import java.io.*;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ToZipThread extends Thread{

    @Override
    public void run() {
        Properties prop = new Properties();
        try {
            prop.load(new FileReader("diary\\zipPath.properties"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        String toPath = (String)prop.get("toPath");

        //将文件进行压缩
        File src =new File("D:\\JAVASE\\java-learn\\diary");
        File dest = new File(toPath);

        try {
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
            toZip(src,zos,"diary");
            zos.close();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    public void toZip(File src, ZipOutputStream zos, String address){
        if(!src.exists()){
            return;
        }
        if(src.isDirectory()){
            File[] srcFiles = src.listFiles();
            for (File srcFile : srcFiles) {
                if(srcFile.isFile()){
                    try{
                        FileInputStream fis = new FileInputStream(srcFile);
                        ZipEntry entry = new ZipEntry(address + "\\" + srcFile.getName());
                        zos.putNextEntry(entry);
                        int b ;
                        while((b=fis.read())!=-1){
                            zos.write(b);
                        }
                        zos.closeEntry();
                        fis.close();
                    }catch (IOException ioe){
                        ioe.printStackTrace();
                    }
                }else{
                    toZip(srcFile,zos,address+"\\"+srcFile.getName());
                }
            }
        }else{
            try{
                FileInputStream fis = new FileInputStream(src);
                ZipEntry entry = new ZipEntry(address + "\\" + src.getName());
                zos.putNextEntry(entry);
                int b ;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                zos.closeEntry();
                fis.close();
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
        }

    }


}
