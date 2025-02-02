package scu.wcc.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //链式编程:直接使用方法（函数）返回的结果再次调用方法（函数）
        StringBuilder sb = new StringBuilder();

        sb.append("aaa").append("bbb").append("ccc").append(123456789);
        System.out.println(sb); //aaabbbccc123456789

        String str = sb.toString();
        System.out.println(str);//aaabbbccc123456789
    }
}
