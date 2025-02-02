package scu.wcc.stringdemo;

public class ReplaceString {
    public static void main(String[] args) {
        //获取内容
        String sentence="你长得太帅了，CNM,SB,NMSL,MLGB。";

        //定义敏感词库
        String[] stringArr = {"CNM","SB","NMSL","MLGB"};

        //内容替换
        for (int i = 0; i < stringArr.length; i++) {
            sentence = sentence.replace(stringArr[i],"***");
        }

        //输出结果
        System.out.println(sentence);
    }
}
