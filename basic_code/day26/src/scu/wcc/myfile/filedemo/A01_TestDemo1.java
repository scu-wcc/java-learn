package scu.wcc.myfile.filedemo;

import java.io.File;

public class A01_TestDemo1 {
    public static void main(String[] args) {
        //"C:\Users\10475\Desktop\a.txt"]
        System.out.println("----------------------------------------------------");
        String path1 = "C:\\Users\\10475\\Desktop\\a.txt";
        File file1 = new File(path1);
        System.out.println(file1);

        System.out.println("-----------------------------------------------------");
        String parent1 = "C:\\Users\\10475\\Desktop";
        String child1 = "a.txt";
        File file2 = new File(parent1, child1);
        System.out.println(file2);

        System.out.println("------------------------------------------------------");
        File parent3 = new File("C:\\Users\\10475\\Desktop");
        File file3 = new File(parent3,"a.txt");
        System.out.println(file3);
        System.out.println(file3.getName());

        System.out.println("------------------------------------------------------");
        File file4 = new File("C:\\Users\\10475\\Desktop"+"a.txt");
        System.out.println(file4);//C:\Users\10475\Desktopa.txt; 手动拼接需要加上"\\"，要根据不同的操作系统添加。


    }
}
