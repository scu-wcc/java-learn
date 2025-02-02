package scu.wcc.stringdemo;

public class StringDemo3 {
    public static void main(String[] args){
        String phoneNumber = "11012012138";
        //substring(int x, int y):截取索引从x开始，到y结束（不包含y）的子串。
        String start = phoneNumber.substring(0,3);
        //substring(int index):从index开始的整个子串
        String end = phoneNumber.substring(7);
        String result = start + "****" +end;
        System.out.println(result);


    }
}
