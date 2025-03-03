package scu.wcc.regexdemo;

public class RegexGroupDemo1 {
    public static void main(String[] args) {
        //1.判断开头字符与结束字符是否一致
        //abcda, 1ab58a1, abdnmd8
        String regex1 = "(.).+\\1";
        System.out.println("abcda".matches(regex1)); //true
        System.out.println("1ab58a1".matches(regex1)); //true
        System.out.println("abdnmd8".matches(regex1)); //false

        System.out.println("----------------------------------------------------------");
        //2.判断开始部分与结束部分是否一致
        //"abc12365abc" , "123aed854123" , "78954sxw788"
        String regex2 = "(.+).+\\1";
        System.out.println("abc12365abc".matches(regex2)); //true
        System.out.println("123aed854123".matches(regex2)); //true
        System.out.println("78954sxw788".matches(regex2)); //false

        System.out.println("----------------------------------------------------------");
        //3.判断开始与结束部分是否一致，并且开始部分的每个字符要相同
        //aaa123aaa, 111ab551111, mw5sws555
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3)); //true
        System.out.println("111ab551111".matches(regex3)); //true
        System.out.println("mw5sws555".matches(regex3)); //false


    }
}
