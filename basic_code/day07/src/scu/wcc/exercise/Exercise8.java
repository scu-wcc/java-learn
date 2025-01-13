package scu.wcc.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    //双色球系统
    public static void main(String[] args) {
        //系统随机生成号码：
        int[] creatArr=creatNumber();
        System.out.println("====================系统号码====================");
        for (int i = 0; i < creatArr.length; i++) {
            System.out.print(creatArr[i]+" ");
        }

        System.out.println("\n===============================================");
        Scanner sc = new Scanner(System.in);
        int[] userInput = new int[creatArr.length];
        for (int i = 0; i < userInput.length-1;) {
            if(i<userInput.length-1){
                int reaNumber;
                System.out.println("请输入第"+(i+1)+"个红球号码：");
                reaNumber = sc.nextInt();
                if(reaNumber<1 || reaNumber >33){
                    System.out.println("号码不在1-33中，请重新输入！");
                }else{
                    if(contain(userInput,reaNumber)){
                        System.out.println("号码已存在，请重新输入！");
                    }else{
                        userInput[i] = reaNumber;
                        i++;
                    }
                }
            }
        }
        while(true){
            System.out.println("请输入蓝球号码：");
            int blueNumber = sc.nextInt();
            if(blueNumber<1 || blueNumber>16){
                System.out.println("输入的号码不在1-16中，请重新输入！！");
            }else{
                userInput[userInput.length-1] = blueNumber;
                break;
            }
        }

        int reaNumber = 0;
        int blueNumber = 0;
        //取用户输入的每一位数字
        for (int i = 0; i < userInput.length-1; i++) {
            //将用户输入的数字与系统生成的数字进行比较
            for(int j = 0; j<creatArr.length-1; j++){
                if(userInput[i] == creatArr[j]){
                    reaNumber++;
                    break;
                }
            }
        }
        if(userInput[userInput.length-1] == creatArr[creatArr.length-1]){
            blueNumber++;
        }
        getResult(reaNumber,blueNumber);

    }

    public static int[] creatNumber(){
        Random r = new Random();

        int[] creatArr = new int[7];
        for (int i = 0; i < creatArr.length-1;) {
            int redNumber = r.nextInt(33)+1;
            if(!contain(creatArr,redNumber)){
                creatArr[i] = redNumber;
                i++;
            }
        }
        creatArr[creatArr.length-1] = r.nextInt(16)+1;
        return creatArr;
    }

    public static boolean contain(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            if(value == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void getResult(int redNumber, int blueNumber){
        if(redNumber == 6 && blueNumber ==1){
            System.out.println("中奖：1000万元！");
        }else if(redNumber ==6 &&blueNumber==0){
            System.out.println("中奖：500万元！");
        }else if(redNumber ==5 && blueNumber==1){
            System.out.println("中奖：3000元！");
        }else if((redNumber ==5&&blueNumber==0)||(redNumber==4&&blueNumber==1)){
            System.out.println("中奖：200元！");
        }else if((redNumber==4&&blueNumber==0)||(redNumber==3&&blueNumber==1)){
            System.out.println("中奖：10元！");
        }else if((redNumber ==0||redNumber==1||redNumber==2)&&blueNumber==1){
            System.out.println("中奖：5元！");
        }else{
            System.out.println("抱歉，您没有中奖！");
        }
    }
}
