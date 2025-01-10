package scu.wcc.method;

public class MethodTest4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int[] arr2 = copyOfRange(arr,3,8);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int len = to - from;
        int[] newArr = new int[len];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
