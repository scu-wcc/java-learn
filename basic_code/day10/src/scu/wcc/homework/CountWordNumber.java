package scu.wcc.homework;

public class CountWordNumber {
    public static void main(String[] args){
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        System.out.println("Java出现的次数："+countWord(str));
    }

    public static int countWord(String str){
        int count = 0;
        while(true){
            int index = str.indexOf("Java");
            if(index == -1){
                return count;
            }
            //System.out.println(index);
            count++;
            str = str.substring(index+4);
        }


    }
}
