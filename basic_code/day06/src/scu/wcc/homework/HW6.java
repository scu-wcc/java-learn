package scu.wcc.homework;

public class HW6 {
    public static void main(String[] args){
        int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[] {1,2,3,4,5,8};
        int[] arr3 = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println(equals(arr1,arr2)); //false
        System.out.println(equals(arr1,arr3)); //true
        System.out.println(equals(arr2,arr3)); //false
    }
    public static boolean equals(int[] arr1,int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        if(len1!=len2){
            return false;
        }else{
            for (int i=0;i<len1;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
