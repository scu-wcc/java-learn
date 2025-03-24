package scu.wcc.simplelogin;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("basic_code/day29/src/scu/wcc/simplelogin/userinfo.txt"));
        String line =br.readLine();
        String[] userinfo = line.split("&");
        String username = userinfo[0].split("=")[1];
        String password = userinfo[1].split("=")[1];
        int count = Integer.parseInt(userinfo[2].split("=")[1]);

        System.out.println(username+", "+password+", "+count);
        System.out.print("请输入用户名: ");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        System.out.print("请输入密码: ");
        String inputPassword = sc.nextLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter("basic_code/day29/src/scu/wcc/simplelogin/userinfo.txt"));

        if(username.equals(inputName) && password.equals(inputPassword) && count<3){
            System.out.println("登录成功。");
            bw.write("username="+username+"&password="+password+"&count=0");
            bw.close();
        }else{
            count++;
            if(count<3){
                System.out.println("登陆失败，还剩下"+(3-count)+"次登录机会。");
                bw.write("username="+username+"&password="+password+"&count="+count);
                bw.close();
            }else{
                System.out.println("账号已被锁定，请勿操作。");
                bw.write("username="+username+"&password="+password+"&count="+count);
                bw.close();
            }
        }


    }
}
