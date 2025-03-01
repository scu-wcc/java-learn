package scu.wcc.math;

public class MathTest {
    public static void main(String[] args) {
        //使用Math工具类
        System.out.println(isPrime(100003));
    }

    //使用平方根来判断质数，减少循环次数:成对出现的因子总是在平方根的两侧
    public static boolean isPrime(int number){
        int count=0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if(number % i ==0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
