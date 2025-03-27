package scu.wcc.mythread.threaddemo.demo3;

import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });

        t.start();
    }
}
