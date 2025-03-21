package scu.wcc.charIostream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class charSetDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //使用系统默认的编码/解码方式
        String str1 = "ai吃饭";
        byte[] bytes1 = str1.getBytes();
        System.out.println(Arrays.toString(bytes1));//8位

        String decodeStr1 = new String(bytes1);
        System.out.println(decodeStr1); //ai吃饭

        //使用指定的编码/解码方式
        String str2 = "ai吃饭";
        byte[] bytes2 = str2.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2)); //6位

        String decodeStr2 = new String(bytes2,"GBK");
        System.out.println(decodeStr2);//ai吃饭

        //编码/解码不统一
        byte[] bytes3 = str1.getBytes("UTF-8");
        String differentCodeStr = new String(bytes3,"GBK");
        System.out.println(differentCodeStr); //ai鍚冮キ
    }
}
