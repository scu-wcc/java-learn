package scu.wcc.stringdemo;

public class CreateString {
    public static void main(String[] args) {
        //字符串一旦创建就无法修改
        //字符串的两种构造方式
        //直接赋值：生成的字符串存储在StringTable(串池)中，StringTable中的字符串可以复用。
        String str1 = "abc";
        String str2 = "abc";
        //获得相同的哈希值，说明str1和str2存储的字符串地址值相同
        System.out.println(System.identityHashCode(str1)); // 2003749087
        System.out.println(System.identityHashCode(str2)); // 2003749087

        //使用new关键字构造：构造出来的字符串都在堆中，不可复用。每次new都是创建新的字符串对象。
        //空参构造
        String str3 = new String();
        System.out.println("str3:start["+str3+"]end");

        //带参构造:将要生成的字符串作为参数传给构造函数(类似直接赋值)
        String str4 = new String("abcd");
        System.out.println(str4);  // abcd

        //使用字符数组构造:可以用来改变字符串："abc" -> 'a','b','c' -> 'Q','b','c' -> "Qbc"
        char[] chars = new char[]{'a','b','c','d','e'};
        String str5 = new String(chars);
        System.out.println(str5); //abcde

        //使用字节数组构造：在网络传输数据时使用
        byte[] bytes = new byte[]{95,96,97,98,99,100};
        String str6 = new String(bytes);
        System.out.println(str6); // _`abcd :通过ascll表将对应字节转换成字符
    }
}
