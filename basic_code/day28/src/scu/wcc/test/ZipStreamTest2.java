package scu.wcc.test;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamTest2 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\JAVASE\\bbb");
        File destParent = src.getParentFile();
        File dest = new File(destParent, src.getName() + ".zip");
        System.out.println(dest);
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        toZip(src, zos, "");

        zos.close();

    }

    private static void toZip(File src, ZipOutputStream zos, String address) throws IOException {

        File[] srcFiles = src.listFiles();
        for (File srcFile : srcFiles) {
            if (srcFile.isFile()) {
                ZipEntry entry = new ZipEntry(address + "\\" + srcFile.getName());
                zos.putNextEntry(entry);

                FileInputStream fis = new FileInputStream(srcFile);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else{
                toZip(srcFile, zos, address + "\\" + srcFile.getName());
            }


        }


    }
}
