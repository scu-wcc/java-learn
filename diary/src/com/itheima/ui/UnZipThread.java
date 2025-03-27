package com.itheima.ui;

import java.io.*;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipThread extends Thread{
    @Override
    public void run() {

        Properties prop = new Properties();
        try {
            prop.load(new FileReader("diary\\zipPath.properties"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        //获取压缩包路径和要解药到的路径
        String unZipPath = (String)prop.get("unPath");
        String toZipPath = (String)prop.get("toPath");
        try{
            ZipInputStream zis =new ZipInputStream(new FileInputStream(toZipPath));
            ZipEntry entry ;
            while((entry=zis.getNextEntry())!=null){
                if(entry.isDirectory()){
                    File file =new File(unZipPath,entry.toString());
                    file.mkdirs();
                }else{
                    File file = new File(unZipPath,entry.toString());
                    File entryParent = new File(file.getParent());
                    entryParent.mkdirs();
                    FileOutputStream fos =new FileOutputStream(file);
                    int b;
                    while((b=zis.read())!=-1){
                        fos.write(b);
                    }
                    fos.close();
                    zis.closeEntry();
                }
            }
            zis.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}
