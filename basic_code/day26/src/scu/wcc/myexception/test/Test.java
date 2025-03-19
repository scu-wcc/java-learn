package scu.wcc.myexception.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        GirlFriend gf = new GirlFriend();

        while(true){
            try{
                System.out.println("请输入女朋友的姓名：");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("请输入女朋友的年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);

                break;
            }catch (NameFormatException | NumberFormatException | AgeOutOfBoundsException e){
                e.printStackTrace();

            }


        }

        System.out.println(gf);

    }



}
