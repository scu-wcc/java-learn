package scu.wcc.binary_searchdemo;

public class A01_demo1 {
    public static void main(String[] args) {
        int[] arr = {1,23,56,89,123,234,256,333,450};
        System.out.println(binarySearch(arr,23));
    }

    public static int binarySearch(int[] arr, int number){
        if(!isOrder(arr)){
            return -1;
        }
        int minIndex = 0;
        int maxIndex = arr.length-1;
        int midIndex = (maxIndex+minIndex)/2;

        while(true){
            if(arr[midIndex] == number){
                return midIndex;
            }else if(arr[midIndex]>number){
                maxIndex = midIndex-1;
                midIndex = (maxIndex+minIndex)/2;
            }else{
                minIndex = midIndex+1;
                midIndex = (maxIndex+minIndex)/2;
            }
            if(minIndex>maxIndex){
                return -1;
            }
        }

    }
    public static boolean isOrder(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
}
