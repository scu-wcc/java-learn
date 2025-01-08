package scu.wcc.test;
import java.util.Scanner;

public class Test3 {
    //判断质数
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = sc.nextInt();

        int count =0;
        if(number>2 && number%2==0){
            System.out.println(number+"不是质数。");
        }else{
            for (int i = 1; i <= number; i++) {
                if(number%i == 0){
                    count++;
                }
                if(count>2){
                    System.out.println(number+"不是质数。");
                    break;
                }
            }
            if(count <= 2){
                System.out.println(number+"是质数。");
            }
        }
    }
}
