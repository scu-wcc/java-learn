package scu.wcc.recursion_sortdemo;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={6,2,6,8,2,3,4,9,12,2,5,9,3};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }

    }

    public static void quickSort(int[] arr, int startIndex, int endIndex){
        if(startIndex>=endIndex){
            return;
        }

        int base = arr[startIndex];
        int start = startIndex;
        int end = endIndex;
        //移动左右索引
        while(start!=end){
            while(true){
                if(end<=start || arr[end]<base){
                    break;
                }
                end--;
            }
            while (true){
                if(start>=end || arr[start]>base){
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
        }
        int temp = arr[startIndex];
        arr[startIndex] = arr[start];
        arr[start] = temp;

        quickSort(arr,startIndex,start-1);
        quickSort(arr,start+1,endIndex);

    }
}
