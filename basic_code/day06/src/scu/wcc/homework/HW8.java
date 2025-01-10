package scu.wcc.homework;

public class HW8 {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr = fill(arr,2,6,0);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] =value;
        }
        return arr;
    }
}
