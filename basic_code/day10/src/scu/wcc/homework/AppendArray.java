package scu.wcc.homework;

import java.util.StringJoiner;

public class AppendArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        String result = appendArr(arr);
        System.out.println(result);


    }

    public static String appendArr( int[] arr){
        if(arr==null){
            return null;
        }else if(arr.length == 0){
            return "[]";
        }
        StringJoiner sj = new StringJoiner(", ","[","]");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            sj.add(arr[i]+"");
        }

        return sj.toString();
    }


}
