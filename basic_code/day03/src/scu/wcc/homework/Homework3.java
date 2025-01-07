package scu.wcc.homework;

public class Homework3 {
    public static void main(String[] args) {
        double account = (24+8+3)*0.8;
        double prePrice = 16+8+3;
        String result = account>prePrice?"使用优惠价买更划算":"使用折扣买更划算";
        System.out.println(result);
    }
}
