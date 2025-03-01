package scu.wcc.biginteger;

import java.math.BigInteger;
import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        //可以获取大于long类型的数
        //1.获取[0, 2^num - 1]范围内的一个随机数
//        Random r= new Random();
//        for (int i = 0; i < 100; i++) {
//            BigInteger big1 = new BigInteger(4,r);//0~15
//            System.out.println(big1);
//        }

        //2.将一个只包含整数的字符串转换成BigInteger
//        BigInteger big2 = new BigInteger("12345678912345678902582025820582025820258");
//        System.out.println(big2); //12345678912345678902582025820582025820258
//        BigInteger big3 = new BigInteger("abc1.2");//类型错误
//        System.out.println(big3);

        //3.获取num在n进制下对应的十进制值
//        BigInteger big4 = new BigInteger("100",2);
//        System.out.println(big4);//100(2) -> 4(10)

        //4.使用静态方法：只能获取long类型范围内的值
        //内部优化：使用静态方法时：获取-16~16时的BigInteger对象相同
//        BigInteger big5  = BigInteger.valueOf(1234567890122l);
//        System.out.println(big5);//1234567890122
//
//        System.out.println(BigInteger.valueOf(16) == BigInteger.valueOf(16));//true
//        System.out.println(BigInteger.valueOf(17) == BigInteger.valueOf(17));//false

        //BigInteger内部记录的值不能改变，进行加减等操作时会创建新的BigInteger对象
//        BigInteger big6 = new BigInteger("1234");
//        BigInteger big7 = new BigInteger("1234");
//        BigInteger big8 = big6.add(big7);
//
//        System.out.println(big8);//2468
//        System.out.println(big6 == big8); //false


    }
}
