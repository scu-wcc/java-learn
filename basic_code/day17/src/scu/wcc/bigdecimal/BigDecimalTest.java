package scu.wcc.bigdecimal;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class BigDecimalTest {
    public static void main(String[] args) {
        //与BigInteger类似，获取一个很大的小数
        //1.传递double类型来构造，可能导致构造出来的BigDecimal也是不准确的
//        System.out.println(0.09+0.01);//0.09999999999999999
//        BigDecimal bd1 = new BigDecimal(0.09);
//        BigDecimal bd2 = new BigDecimal(0.01);
//        System.out.println(bd1);//0.0899999999999999966693309261245303787291049957275390625
//        System.out.println(bd2);//0.01000000000000000020816681711721685132943093776702880859375
//        System.out.println(bd1.add(bd2));//0.09999999999999999687749774324174723005853593349456787109375

        //2.直接传递字符串构造，可以获取精确值
//        BigDecimal bd3 = new BigDecimal("0.01");
//        BigDecimal bd4 = new BigDecimal("0.09");
//        System.out.println(bd3); //0.01
//        System.out.println(bd4); //0.09
//        System.out.println(bd3.add(bd4)); //0.10

        //使用静态方法获取
        //传递小数与整数的区别：
        //小数：无论传递的值是多少，直接构造新对象返回
        //整数：传递的值在[0,10]之间，返回一个常量对象
//        BigDecimal bd5 = BigDecimal.valueOf(10.0);
//        BigDecimal bd6 = BigDecimal.valueOf(10.0);
//        System.out.println(bd5 == bd6); //false:对象不同
//
//        System.out.println(BigDecimal.valueOf(10) == BigDecimal.valueOf(10)); //true：对象相同

        //精确
        BigDecimal bd7 = BigDecimal.valueOf(0.01);
        BigDecimal bd8 = BigDecimal.valueOf(0.09);
        System.out.println(bd7); //0.01
        System.out.println(bd8); //0.09
    }
}
