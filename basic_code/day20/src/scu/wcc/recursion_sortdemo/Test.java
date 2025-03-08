package scu.wcc.recursion_sortdemo;

public class Test {
    public static void main(String[] args) {

        System.out.println(add(100));
        System.out.println(factorial(5));
    }
    public static int add(int number){
        if(number==1){
            return 1;
        }
        return number+add(number-1);
    }
    public static int factorial(int number){
        if(number==1){
            return 1;
        }

        return number*factorial(number-1);
    }
}
