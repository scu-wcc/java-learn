package scu.wcc.test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    //猜数字小游戏
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;

        Random r=new Random();
        //random.nextInt(1,10);不是标准写法
        //标准写法：r.nextInt(number); //表示从0到number-1 这number个数
        int number = r.nextInt(100)+1; // (0-99)+1 == 1-100
        System.out.println(number);
        System.out.println("欢迎来到猜数字小游戏!");
        int count =0;
        while (true){
            count++;
            System.out.println("第"+count+"次猜数字：");
            userInput = sc.nextInt();
            if (userInput == number){
                System.out.println("恭喜你猜对了！！");
                break;
            }else if(userInput > number){
                System.out.println("数字过大！");
            }else{
                System.out.println("数字过小！");
                System.out.println("还剩下"+(3-count)+"机会！");
            }
            if(count == 3){
                System.out.println("游戏结束。正确数字："+number);
                break;
            }
        }

    }
}
