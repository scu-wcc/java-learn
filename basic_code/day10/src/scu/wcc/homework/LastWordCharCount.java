package scu.wcc.homework;

public class LastWordCharCount {
    public static void main(String[] args){
        String sentence = "Hello world! The world is so beautiful!";

        int len = sentence.length();
        int count = 0;
        String lastWord = "";
        for (int i = len-1; i >=0; i--) {
            if(sentence.charAt(i) == ' '){
                break;
            }
            lastWord = sentence.charAt(i) + lastWord;
            count++;
        }
        System.out.println("最后一个单词是："+lastWord+"\n共计有："+count+"个字符。");
    }
}
