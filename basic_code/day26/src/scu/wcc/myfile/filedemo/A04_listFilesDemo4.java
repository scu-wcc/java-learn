package scu.wcc.myfile.filedemo;

import java.io.File;
import java.util.Arrays;

public class A04_listFilesDemo4 {
    public static void main(String[] args) {
        File file = new File("D:\\JAVASE");

        File[] fileArr = file.listFiles();

        for (File fileRoad : fileArr) {
            System.out.println(fileRoad);
        }
        System.out.println("=================================================");
        String[] strArr = file.list();
        for (String s : strArr) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(File.listRoots()));

    }
}
