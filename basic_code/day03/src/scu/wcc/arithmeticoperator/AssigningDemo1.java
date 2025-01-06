package scu.wcc.arithmeticoperator;

public class AssigningDemo1 {
    public static void main(String[] args) {

        //+=、-=等赋值运算符执行的时候有一个隐式强制类型转换
        short s = 1 ;
        s+=200;
        // s+=1 == s=(short)(s+1):根据左边的类型强转。
        System.out.println(s); //200

        s+=65554;
        System.out.println(s); //219


    }
}
