package scu.wcc.test;

import cn.hutool.core.io.FileUtil;

import java.util.List;

public class PacketTest1 {
    public static void main(String[] args) {
        List<String> strings = FileUtil.readLines("D:\\JAVASE\\a.txt", "UTF-8");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
