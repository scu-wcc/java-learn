package scu.wcc.exercise;

import java.util.Random;

public class Exercise3 {
    //开发验证码，数字位随机。
    public static void main(String[] args) {
        Random r = new Random();
        String code = "";
        int count=0;
        int index = r.nextInt(5);
        while(count<5){
            if(count!=index){
                int c = r.nextInt(58)+65;
                if(c<=90){
                    code = code + (char)c;
                    count ++;
                }else if(c>=97){
                    code = code + (char)c;
                    count++;
                }
            }else{
                int c = r.nextInt(10)+48;
                code = code+(char)c;
                count++;
            }
        }
        System.out.println(code);
    }
}
