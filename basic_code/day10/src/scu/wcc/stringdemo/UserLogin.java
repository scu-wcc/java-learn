package scu.wcc.stringdemo;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        //通过键盘录入的字符串实际上是new出来的，存储在堆上。
        //        Scanner sc = new Scanner(System.in);
        //        System.out.println("请输入一个字符串：");
        //        String str1 = sc.next();
        //        String str2 = "abc";
        //        System.out.println(str1 == str2); //false
        String rightUserName = "zhangsan";
        String rightUserPassword = "123456";

        Scanner sc =new Scanner(System.in);
        int i = 0;
        while(i<3){
            i++;

            System.out.println("请输入用户名：");
            String userInputName = sc.next();
            System.out.println("请输入密码：");
            String userInputPassword = sc.next();

            if(rightUserName.equals(userInputName) && rightUserPassword.equals(userInputPassword)){
                System.out.println("登录成功！");
                break;
            }else if(3 == i){
                System.out.println("登录失败，账号已被锁定，请联系官方客服。");
            }else{
                System.out.println("用户名或密码错误，请重新登录。");
                System.out.println("还剩下"+(3-i)+"次登录机会。");
            }
        }
    }
}
