package scu.wcc.ui;

import java.util.Random;

public class CodeUtil {

    private CodeUtil(){}

    public static String getCode(){
        char[] chars = new char[52];
        for (int i = 0; i < 52; i++) {
            if(i<26){
                chars[i] = (char)(i+'A');
            }else{
                chars[i] = (char)(i+'a'-26);
            }
        }
        Random r = new Random();
        int randomIndex = r.nextInt(5);
        String result ="";
        for (int i = 0; i < 5; i++) {
            if(i==randomIndex){
                result+=r.nextInt(10);
            }else{
                result+=chars[r.nextInt(chars.length)];
            }
        }

        return result;
    }
}
