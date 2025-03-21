package scu.wcc.test;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //对文件夹进行拷贝
        File src = new File("D:\\JAVASE\\IOTest");
        File dest = new File("D:\\JAVASE\\dest");

        copyDir3(src,dest);

        //copyDir(src,dest);

        src = new File("D:\\JAVASE\\IOTest2");
        dest = new File("D:\\JAVASE\\dest2");
        //copyDir2(src,dest);


    }

    public static void copyDir(File src, File dest) throws IOException {
        if(!src.exists()){
            return;
        }
        if(src.isDirectory()){
            dest.mkdirs();
            File[] srcFiles = src.listFiles();
            for (File srcFile : srcFiles) {
                if(srcFile.isFile()){
                    FileInputStream fip = new FileInputStream(srcFile);
                    FileOutputStream fop = new FileOutputStream(new File(dest,srcFile.getName()));
                    byte[] arr= new byte[1024];
                    int len ;
                    while((len = fip.read(arr))!=-1){
                        fop.write(arr,0,len);
                    }
                }else{
                    copyDir(srcFile,new File(dest,srcFile.getName()));
                }
            }
        }else{
                FileInputStream fip = new FileInputStream(src);
                FileOutputStream fop = new FileOutputStream(dest);
                byte[] arr= new byte[1024];
                int len ;
                while((len = fip.read(arr))!=-1){
                    fop.write(arr,0,len);
                }
        }



    }

    public static void copyDir2(File src, File dest) throws IOException{
        dest.mkdirs();
        File[] srcFiles = src.listFiles();
        for(File srcFile:srcFiles){
            if(srcFile.isFile()){
                FileInputStream fis = new FileInputStream(srcFile);
                FileOutputStream fos = new FileOutputStream(new File(dest,srcFile.getName()));
                byte[] arr = new byte[1024];
                int len;
                while((len = fis.read(arr))!=-1){
                    fos.write(arr,0,len);
                }
                fos.close();
                fis.close();
            }else{
                copyDir2(srcFile,new File(dest,srcFile.getName()));
            }
        }
    }

    public static void copyDir3(File src, File dest) throws IOException{
        if(!src.exists()){
            return;
        }
        if(src.isDirectory()){
            dest.mkdirs();
            File[] srcFiles = src.listFiles();
            for (File srcFile : srcFiles) {
                if(srcFile.isFile()){
                    FileInputStream fis = new FileInputStream(srcFile);
                    FileOutputStream fos = new FileOutputStream(new File(dest,srcFile.getName()));
                    byte[] arr = new byte[1024*1024*5];
                    int len;
                    while((len=fis.read(arr))!=-1){
                        fos.write(arr,0,len);
                    }
                    fos.close();
                    fis.close();
                }else{
                    copyDir3(srcFile,new File(dest,srcFile.getName()));
                }
            }
        }



    }
}
