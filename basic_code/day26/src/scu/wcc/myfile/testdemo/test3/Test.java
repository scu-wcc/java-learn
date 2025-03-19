package scu.wcc.myfile.testdemo.test3;

import java.io.File;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String filePath ="D:\\JAVASE";
        File file = new File(filePath);
        ArrayList<File> list = new ArrayList<>();
        getAvi(file,list);
        for (File file1 : list) {
            System.out.println(file1);
        }
    }

    public static void getAvi(File src, ArrayList<File> fileList){
       
        if(src.exists()){
            if(src.isFile()){
                if(src.getName().endsWith(".avi")){
                    fileList.add(src);
                }

            }else{
                File[] files = src.listFiles();
                if(files != null){
                    for (File file : files) {
                        if(file.isFile()){
                            if(file.getName().endsWith(".avi")){
                                fileList.add(file);
                            }
                        }else{
                            getAvi(file,fileList);
                        }
                    }
                }

            }
                    
        }

    }
}
