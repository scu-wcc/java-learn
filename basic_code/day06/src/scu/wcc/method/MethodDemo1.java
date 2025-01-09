package scu.wcc.method;

public class MethodDemo1 {
    //method是程序中最小的执行单元
    public static void main(String[] args) {
        printInf();
    }


    //可以定义在main下面，不需要提前声明
    public static void printInf(){
        System.out.println("身高：180cm");
        System.out.println("体重：85kg");
        System.out.println("年龄24岁");
    }
}
