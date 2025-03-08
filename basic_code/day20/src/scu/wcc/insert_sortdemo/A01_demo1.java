package scu.wcc.insert_sortdemo;

public class A01_demo1 {
    public static void main(String[] args) {
        int[] arr ={6,24,56,21,36,521,56,24,236,84,23,12,214,35,25,96,23};
        int startIndex = arr.length-1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                startIndex = i+1;
                break;
            }
        }
        insertSort(arr,startIndex);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }

    }
    public static void insertSort(int[] arr, int startIndex){
        for (int i=startIndex;i<arr.length;i++){
            int currySelectedIndex = i-1;
            for (;currySelectedIndex>=0;currySelectedIndex--){
                if(arr[currySelectedIndex]<=arr[currySelectedIndex+1]){
                    break;
                }
                int temp = arr[currySelectedIndex];
                arr[currySelectedIndex] = arr[currySelectedIndex+1];
                arr[currySelectedIndex+1] = temp;
            }
        }

    }
}
