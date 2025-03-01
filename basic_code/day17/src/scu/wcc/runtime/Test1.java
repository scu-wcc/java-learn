package scu.wcc.runtime;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.Runtime无法直接创建对象，需要调用getRuntime()获取
//        Runtime r1 = Runtime.getRuntime();
//        Runtime r2 = Runtime.getRuntime();
//        System.out.println(r1 == r2); //true

        //2.停止虚拟机
//        Runtime.getRuntime().exit(0);
//        System.out.println("look me");

        //3.获取CPU线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//16

        //4.JVM能从系统中获取的总内存大小 单位：byte
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024); //4028M ≈ 4G

        //5.JVM已经获取的内存大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);//252M

        //6.JVM获取的内存中未被使用的内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);//249M

        //7.执行cmd命令
        Runtime.getRuntime().exec("notepad");
        //shutdown:关机命令
        //-s:默认一分钟后关机
        //-s -t:指定关机的时间
        //-a:取消关机操作
        //-r:关机并重启
        Runtime.getRuntime().exec("shutdown -a");



    }
}
