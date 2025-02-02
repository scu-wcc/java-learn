package scu.wcc.stringdemo;

public class CompareString {
    public static void main(String[] args){
        //字符串比较：
        // equals:完全相同返回true，否则返回false。
        // equalsIgnoreCase：忽略大小写比较

        // "=="
        //基本数据类型:比较具体值
        //引用数据类型:比较存储的地址值
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2); //false

        String str3 = "Abc";
        boolean result1 = str1.equals(str3);
        System.out.println(result1); //false

        boolean result2 = str1.equalsIgnoreCase(str3);
        System.out.println(result2); //true
    }
}
