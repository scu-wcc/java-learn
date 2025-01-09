package scu.wcc.array;

public class ArrayTest1 {
    //求最大值
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println("数组的最大值是："+max);
    }
}
