package scu.wcc.method;

public class MethodTest3 {
    public static void main(String[] args){
        int[] arr = {12,36,59,5,684,26,25,33,65,52,41,2,5};
        System.out.println(getNumber(arr,2));

    }

    public static boolean getNumber(int[] arr, int number){

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
