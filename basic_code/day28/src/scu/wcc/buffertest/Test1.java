package scu.wcc.buffertest;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //四种方式拷贝文件，并统计各种用时
        /*
        1.字节基本流-一次一个字节。
        2.字节基本流-一次一个字节数组。
        3.字节缓冲流：一次一个字节。
        4.字节缓冲流：一次一个字节数组。
         */
        //1
        FileInputStream fis = new FileInputStream("bufferIOTest\\poem.txt");
        FileOutputStream fos = new FileOutputStream("bufferIOTest\\copy1.txt");

        int first;
        long start1 = System.currentTimeMillis();
        while((first = fis.read())!=-1){
            fos.write(first);
        }
        long end1 = System.currentTimeMillis();
        long result1 = (end1 -start1);
        System.out.println("第一种方式用时:"+result1+"ms");

        //2
        fos = new FileOutputStream("bufferIOTest\\copy2.txt");
        byte[] arr= new byte[1024];
        int len2 ;
        long start2 = System.currentTimeMillis();
        while((len2=fis.read(arr))!=-1){
            fos.write(arr,0,len2);
        }
        long end2 = System.currentTimeMillis();
        long result2 = (end2 -start2);
        System.out.println("第二种方式用时:"+result2+"ms");

        //3
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufferIOTest\\poem.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bufferIOTest\\copy3.txt"));

        int b2;
        long start3 = System.currentTimeMillis();
        while((b2=bis.read())!=-1){
            bos.write(b2);
        }
        long end3 = System.currentTimeMillis();
        long result3 = (end3 -start3);
        System.out.println("第三种方式用时:"+result3+"ms");

        //4
        bos = new BufferedOutputStream(new FileOutputStream("bufferIOTest\\copy4.txt"));

        int len4;
        byte[] arr2 = new byte[1024];
        long start4 = System.currentTimeMillis();
        while((len4=bis.read(arr2))!=-1){
            bos.write(arr2,0,len4);
        }
        long end4 = System.currentTimeMillis();
        long result4 = (end4 -start4);
        System.out.println("第四种方式用时:"+result4+"ms");
    }
}
