package scu.wcc.myexception.methodedemo;

public class Test {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        } catch (Exception e) {

            //getMessage:Index 10 out of bounds for length 5
            /*String result  = e.getMessage();
            System.out.println(result);*/

            //toString:java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
            /*String result = e.toString();
            System.out.println(result);*/

            /*printStackTrace:java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
            	at scu.wcc.myexception.methodedemo.Test.main(Test.java:10)*/
            //并且不会停止程序，可以继续执行try-catch之外的代码
            e.printStackTrace();

        }

        System.out.println("看看我执行了吗？");
        System.err.println("err");
        System.out.println("out");
    }
}


