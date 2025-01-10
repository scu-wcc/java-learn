package scu.wcc.method;

public class MethodTest1 {
    //遍历数组
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55,66};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.print(arr[i]);
                continue;
            }
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
    }
}
