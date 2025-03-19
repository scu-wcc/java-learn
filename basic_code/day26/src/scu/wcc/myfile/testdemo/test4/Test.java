package scu.wcc.myfile.testdemo.test4;

import java.io.File;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //删除多级文件夹
/*        File addMkdir = new File("D:\\JAVASE\\aaa\\bbb\\ccc\\ddd\\eee");
        addMkdir.mkdirs();*/
        String filePath = "D:\\JAVASE\\aaa";
        File file = new File(filePath);
        deleteFile(file);

    }

    public static void deleteFile(File src){

        if(!src.exists()){
            return;
        }
        if(src.isDirectory()){
            File[] files = src.listFiles();
            for (File file : files) {
                deleteFile(file);
            }
        }

        src.delete();

    }
}
