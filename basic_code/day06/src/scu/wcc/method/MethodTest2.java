package scu.wcc.method;

public class MethodTest2 {
    public static void main(String[] args) {
        int[] arr = {12,68,953,69,51,695,24,552,855,44,355};
        int max = getMax(arr);
        System.out.println("数组的最大值是："+max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
