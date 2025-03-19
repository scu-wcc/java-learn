package scu.wcc.myfile.testdemo.test5;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> fileCount = new HashMap<>();

        String filePath = "D:\\JAVASE";
        File file = new File(filePath);
        getCount(file,fileCount);

        Set<Map.Entry<String, Integer>> entries = fileCount.entrySet();


        for (Map.Entry<String, Integer> entry : entries) {
            String type = entry.getKey();
            int count = entry.getValue();
            System.out.println(type+"="+count);
        }

    }

    public static void getCount(File src, HashMap<String, Integer> fileCount){
        if(!src.exists()){
            return;
        }
        if(src.isDirectory()){
            File[] files = src.listFiles();
            if(files!=null){
                for (File file : files) {
                    getCount(file,fileCount);
                }

            }
        }

        String[] strArr = src.getName().split("\\.");
            if(strArr.length>1){
                String key = strArr[strArr.length-1];
               if(fileCount.containsKey(key)){
                    int count = fileCount.get(key);
                    count++;
                    fileCount.put(key,count);
                }else{
                    fileCount.put(key,1);
                }
            }






    }
}
