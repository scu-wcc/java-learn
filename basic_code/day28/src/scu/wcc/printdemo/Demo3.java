package scu.wcc.printdemo;

import java.io.PrintStream;

public class Demo3 {
    public static void main(String[] args) {
        PrintStream out = System.out;

        out.print("你好");
        out.println("我是小猫");
//        out.close();

        System.out.println("哎呀，不小心关闭连接了");
        System.out.println(out);
    }
}
