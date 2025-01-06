package scu.wcc.arithmeticoperator;

public class LogicDemo2
{
    public static void main(String[] args) {
        //短路逻辑运算符：当左边的表达式能判断真假，就不会执行右边的表达式
        // &&, || ：短路运算符可以提高程序的运行效率
        int a=10;
        int b=10;
        int c=10;
        int d=10;
        boolean result1 = ++a<5 && ++b<5;
        System.out.println(result1); //false
        System.out.println(a); //11
        System.out.println(b); //被短路了，没有执行++b：10

        boolean result2 = ++c>5 && ++d<5;
        System.out.println(result2);//false
        System.out.println(c); //11
        System.out.println(d); //没有被短路，执行了++d：11

        int a2=10;
        int b2=10;
        int c2=10;
        int d2=10;
        boolean result3 = ++a2<5 || ++b2<5;
        System.out.println(result3); //false
        System.out.println(a2); //11
        System.out.println(b2); //11：没有被短路，执行了。

        boolean result4 = ++c2<5 || ++d2>5;
        System.out.println(result4);//true
        System.out.println(c2); //11
        System.out.println(d2); //10:被短路了，没有执行。
    }
}
