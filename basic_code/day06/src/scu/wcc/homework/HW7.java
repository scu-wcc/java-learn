package scu.wcc.homework;

public class HW7 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,78,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr = fill(arr,99);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] =value;
        }
        return arr;
    }
}
