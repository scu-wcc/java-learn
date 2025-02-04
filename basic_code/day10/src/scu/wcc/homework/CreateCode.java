package scu.wcc.homework;

import java.util.Random;

public class CreateCode {
    public static void main(String[] args){
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i<26){
                arr[i] = (char)(i+65);
            }else{
                arr[i] = (char)(i+97-26);
            }
        }
        String str = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            str += arr[index];
        }
        str+=r.nextInt(10);
        char[] strArr = str.toCharArray();

        int randomIndex = r.nextInt(5);
        char temp = strArr[4];
        strArr[4] = strArr[randomIndex];
        strArr[randomIndex] = temp;
        String result = new String(strArr);
        System.out.println(result);
    }
}
