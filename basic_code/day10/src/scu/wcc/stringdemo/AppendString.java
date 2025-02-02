package scu.wcc.stringdemo;

public class AppendString {
    public static void main(String[] args) {
        int[] arr = {};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr){
        //应该对arr进行安全性校验,防止传递null的情况。
        if(arr==null){
            return "";
        }

        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str= str+arr[i];
            if(i!=arr.length-1){
                str = str+",";
            }
        }
        str = str+"]";
        return str;
    }
}
