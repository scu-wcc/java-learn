package scu.wcc.myfile.testdemo.test5;

import java.io.File;

public class Test2 {

    public static void main(String[] args) {
        String filePath = "D:\\JAVASE";
        File file =new File(filePath);



        long big =getMemory(file);
        System.out.println(file+"文件大小："+big);
    }

    public static long getMemory(File src){
        if(!src.exists()){
            return 0;
        }
        long len = 0;
        if(src.isDirectory()){
            File[] files = src.listFiles();
            for (File file : files) {
               len = len+getMemory(file);
            }
        }else {
            len = len+src.length();
        }
        return len;

    }
}
