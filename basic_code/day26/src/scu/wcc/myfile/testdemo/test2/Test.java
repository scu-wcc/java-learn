package scu.wcc.myfile.testdemo.test2;

import java.io.File;


public class Test {
    public static void main(String[] args) {
        String path = "D:\\JAVASE";
        File file = new File(path);
        getAvi(file);
    }

    public static void getAvi(File src){
        if(!src.exists()){
            return;
        }
        if(src.isDirectory()){
            File[] files = src.listFiles();
            for (File file : files) {
                getAvi(file);
            }
        }
        String name = src.getName();
        if(name.endsWith(".avi")){
            System.out.println(src);
        }

    }
}
