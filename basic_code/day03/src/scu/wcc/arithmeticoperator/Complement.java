package scu.wcc.arithmeticoperator;

public class Complement {
    public static void main(String[] args) {
        //计算机中对于数据的存储和计算都是以补码来进行的
        //原码计算会导致负数计算错误
        //反码会导致计算跨过0时结果偏差-1
        //由于使用补码（负数原码取反＋1：符号位不变）
        //单字节下-128没有原码和反码；正数的原、反、补都一样
        byte a = 23; // 0001 0111
        byte b = -16; //1111 0000
        System.out.println(a & b); //0001,0000 16
        System.out.println(a|b); //1111,0111 -9
        System.out.println(a+b); //1,0000,0111 7:直接相加，超位去除

        //位移操作是针对int和long类型的操作
        short c = 165; // 0000 0000 1010 0101
        short d = -165; //1111 1111 0101 1011
        System.out.println(c >> 3); //0000 0000 0001,0100 20
        System.out.println(d >> 2); //1111 1111 1101 0111 -42
        //无符号右移 >>>：不考虑符号位，直接补0
        //java中执行位移操作会将byte、short、char类型自动转换成int类型再转换
        System.out.println(d >>> 2);//00111111 11111111 11111111 11010110 1073741782

        System.out.println(c+d); // 1(丢去) 0000 0000 0000 0000    0

    }
}
