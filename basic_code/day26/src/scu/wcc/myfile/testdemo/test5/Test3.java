package scu.wcc.myfile.testdemo.test5;

import java.io.File;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("D:\\JAVASE\\.txt");

        String name = file.getName();
        System.out.println(name); //.txt

        String[] arr = name.split("\\.");
        System.out.println("arr的长度："+arr.length); //2
        System.out.println(Arrays.toString(arr)); //[, txt]

        String str = "a.";
        String[] arr1 = str.split("\\.");
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);

    }
}
