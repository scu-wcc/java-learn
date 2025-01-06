package scu.wcc.arithmeticoperator;

public class TernaryTest {
    public static void main(String[] args){
        int a = 150;
        int b = 210;
        int c = 165;
        int max = a>b?a:b;
        max = max>c?max:c;
        System.out.println("三个和尚最高的身高是："+max+"cm");
    }
}
