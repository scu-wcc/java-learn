package scu.wcc.method;

public class MethodDemo2 {
    public static void main(String[] args){
        getSum(10,20);
        getSum(12,65);
        getSum((int) 1.0,20);

        int[] arr = {1,2,3,4,5,7,5,8};

        //能传地址
        printArr(arr);
        System.out.println();

        getArea(2.6);
    }

    public static void getSum(int num1, int num2){
        int sum = num1+num2;
        System.out.println(sum);
    }

    public static void printArr(int[] arr){
        for (int i :arr) {
            System.out.print(i+" ");
        }
    }

    public static void getArea(double radius){
        System.out.println(radius*radius*3.14);
    }
}
