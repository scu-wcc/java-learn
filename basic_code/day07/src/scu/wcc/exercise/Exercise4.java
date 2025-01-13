package scu.wcc.exercise;

public class Exercise4 {
    public static void main(String[] args) {
        int[] arr = new int[]{69,5,23,6,7,9,20,12,4,2};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
