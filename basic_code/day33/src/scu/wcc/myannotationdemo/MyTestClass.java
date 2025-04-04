package scu.wcc.myannotationdemo;

public class MyTestClass {

    @MyTest
    private void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }


    public  void method3(){
        System.out.println("method3");
    }
    @MyTest
    void method4(){
        System.out.println("method4");
    }
}
