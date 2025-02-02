package scu.wcc.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //直接使用String进行拼接会产生许多的中间字符串，占据内存
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        String s4 = s1+s2+s3;
        //s4=s1+s2+s3 -> s1+s2 = "aaabbb"
        //"aaabbb"+s3 = "aaabbbccc";其中"aaabbb"是中间字符串，被额外创建的。

        //而StringBuilder是一个容器，可以直接拼接字符串而不产生中间量
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1); //StringBuilder与String一样，打印时不会显示引用地址值，而是直接显示引用地址的内容

        StringBuilder sb2 = new StringBuilder("aaa");
        System.out.println(sb2); // aaa
        //由于StringBuilder只是一个容器，所以其内容可以更改。
        //拼接操作
        sb2.append("你好！");
        sb2.append(123456);
        System.out.println(sb2); //aaa你好！123456

        //反转操作
        sb2.reverse();
        System.out.println(sb2);//654321！好你aaa

        //获取长度
        int len = sb2.length();
        System.out.println("sb2的内容长度是："+len); //12

        //转换成String:以便使用String的方法。例如：replace，substring等
        String str = sb2.toString();
        System.out.println(str); //654321！好你aaa
    }
}
