package scu.wcc.basic_searchdemo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class A01_demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,68,52,44,56,95,2,22,25,441,225,2};
        System.out.println(getSingleIndex(arr,68));
        System.out.println(getIndexAll(arr,2));
    }
    public static int getSingleIndex(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> getIndexAll(int[] arr,int number) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == number){
                list.add(i);
            }
        }
        return list;
    }
}
