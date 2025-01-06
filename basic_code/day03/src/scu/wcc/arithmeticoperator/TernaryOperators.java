package scu.wcc.arithmeticoperator;
import java.util.Scanner;

//三元运算符
// 关系表达式？表达式1(true):表达式2(false)
public class TernaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = sc.nextInt();

        int max = number1>number2?number1:number2;
        System.out.println("最大值："+max);

    }
}
