package scu.wcc.unittestdemo;

import org.junit.Test;

public class Test1 {


    @Test
    public void method1(){
        int a=10;
        int b=20;
        int result =a+b;
        //System.out.println(2/0);
        System.out.println(result);
    }



    public void method2(){
        int a=10;
        int b=20;
        int result =a+b;
        System.out.println(result);
    }

    @Test
    public void method3(){
        int a=10;
        int b=20;
        int result =a+b;
        System.out.println(result);
    }

    public int add(int a, int b){
        return a/b;
    }

}
