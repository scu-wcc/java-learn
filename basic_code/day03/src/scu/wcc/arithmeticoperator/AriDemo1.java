package scu.wcc.arithmeticoperator;
import java.util.Scanner;


public class AriDemo1 {
    public static void main(String[] args) {
        //小数进行算术运算可能会发生精度丢失
        System.out.println(1.01+1.1); //2.1100000000000003
        System.out.println(1.1*1.11); //1.2210000000000003
        System.out.println(1.1-1.01); //0.09000000000000008
        System.out.println(1.1+1.1); //2.2


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        int ge = number%10;
        number = number/10;

        int shi = number%10;
        number = number/10;

        int bai = number%10;
        number = number/10;

        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
