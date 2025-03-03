package scu.wcc.datedemo.packagingclass;


public class IntegerDemo2 {
    public static void main(String[] args) {
        //将十进制转换成其他进制并返回字符串
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1); //1100100

        String str2 = Integer.toOctalString(100);
        System.out.println(str2); //144

        String str3 = Integer.toHexString(100);
        System.out.println(str3); //64

        //将字符串转换成对应的基本数据类型(Character)
        int iResult = Integer.parseInt("101");
        System.out.println(iResult);
    }
}
