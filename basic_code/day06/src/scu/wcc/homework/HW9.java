package scu.wcc.homework;

public class HW9 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        int[] newArr = copyOf(arr,6);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
    public static int[] copyOf(int[] arr, int newLength){
        int[] newArr =new int[newLength];
        for(int i =0; i<newLength; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
