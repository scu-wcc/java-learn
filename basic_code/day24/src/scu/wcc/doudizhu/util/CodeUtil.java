package scu.wcc.doudizhu.util;

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

        int getCodeMode = r.nextInt(3);
        String result ="";
        if(getCodeMode ==0){
            int randomIndex = r.nextInt(5);
            for (int i = 0; i < 5; i++) {
                if(i==randomIndex){
                    result+=r.nextInt(10);
                }else{
                    result+=chars[r.nextInt(chars.length)];
                }
            }
        }else if(getCodeMode == 1){
            int count =0;
            while(count<5){
                char getChar = chars[r.nextInt(chars.length)];
                if(getChar=='o' || getChar =='O'){
                    continue;
                }
                result+=getChar;
                count++;
            }
        }else{
            int arr[] ={4,5};
            int len = arr[r.nextInt(arr.length)];
            boolean numberFlag = false;
            while(len>0){
                char getChar = chars[r.nextInt(chars.length)];

                if(getChar>='0' && getChar<='9'){
                    if(numberFlag){
                        continue;
                    }else{
                        numberFlag=true;
                    }
                }
                result+=getChar;
                len--;
            }
        }

        return result;
    }
}
