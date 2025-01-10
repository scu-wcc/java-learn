package scu.wcc.homework;

public class HW10 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        int[] newArr = copyOfcopyOfRange(arr,2,9);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
    public static int[] copyOfcopyOfRange(int[] arr,int from, int to){
        int[] newArr =new int[to-from];
        int newArrIndex = 0;
        for(int i =from; i<to; i++){
            newArr[newArrIndex] = arr[i];
            newArrIndex++;
        }
        return newArr;
    }
}
