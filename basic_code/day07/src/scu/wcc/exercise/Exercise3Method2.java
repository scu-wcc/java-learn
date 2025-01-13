package scu.wcc.exercise;

import java.util.Random;

public class Exercise3Method2 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<26){
                chs[i] = (char)(97+i);
            }else{
                chs[i]=(char)(65+i-26);
            }
        }
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]+" ");
//        }
        Random r =new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result+chs[randomIndex];
        }
        result += r.nextInt(10);
        System.out.println(result);
    }
}
