package scu.wcc.myfile.filedemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A02_Dem2 {
    public static void main(String[] args) {
        File file1 = new File("D:\\JAVASE\\java-learn\\README.md");
        if (file1.exists()) {
            System.out.println("路径存在");
            if (file1.isFile()) {

                System.out.println("文件大小：" + file1.length());

            }
            System.out.println("存入路径：" + file1.getPath());
            System.out.println("绝对路径：" + file1.getAbsolutePath());
            System.out.println("文件名称：" + file1.getName());
            System.out.println("根据存入路径获取父路径：" + file1.getParent());

            long time = file1.lastModified();
            System.out.println(time);
            Date date = new Date(time);
            System.out.println(date);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String formatTime = sdf.format(date);
            System.out.println(formatTime);
        } else {
            System.out.println("路径不存在");
        }

    }
}
