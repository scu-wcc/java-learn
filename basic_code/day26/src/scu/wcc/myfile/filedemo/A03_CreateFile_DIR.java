package scu.wcc.myfile.filedemo;

import java.io.File;
import java.io.IOException;

public class A03_CreateFile_DIR {
    public static void main(String[] args) throws IOException {
        //createNewFile():只能创建文件夹,无法越过不存在的文件夹创建文件
        File file1 = new File("D:\\JAVASE\\a");
        boolean result1 = file1.createNewFile();
        System.out.println(result1);
        System.out.println("--------------------------------");

        //mkdir：创建单一文件夹,无法创建多级文件夹
        //mkdirs：创建多级文件夹：底层：创建单层文件夹时会调用mkdir
        File file2= new File("D:\\JAVASE\\aaa");
        boolean result2 = file2.mkdirs();
        System.out.println(result2);
        System.out.println("---------------------------------");

        File file3 = new File("D:\\JAVASE\\aaa\\bbb\\ccc\\eee\\ddd");
        boolean result3 = file3.mkdirs();
        System.out.println(result3);
        System.out.println("---------------------------------");

        //delete:删除
        //1.不走回收站，直接删除；
        //只能删除文件和空文件夹(文件夹中有空文件夹都不行)
        while(true){
            File file4 = new File("D:\\JAVASE\\aaa");
            boolean result4 = file4.delete();

            if(result4){
                break;
            }

            File file5 = new File("D:\\JAVASE\\aaa\\bbb");
            boolean result5 = file5.delete();
            System.out.println(result5);
            if(result5){
                continue;
            }


            File file6 = new File("D:\\JAVASE\\aaa\\bbb\\ccc");
            boolean result6 = file6.delete();
            System.out.println(result6);
            if(result6){
                continue;
            }


            File file7 = new File("D:\\JAVASE\\aaa\\bbb\\ccc\\eee");
            boolean result7 = file7.delete();
            System.out.println(result7);
            if(result7){
                continue;
            }

            File file8 = new File("D:\\JAVASE\\aaa\\bbb\\ccc\\eee\\ddd");
            boolean result8 = file8.delete();
            if(result8){
                continue;
            }

        }
        System.out.println("文件夹删除成功");

    }
}
