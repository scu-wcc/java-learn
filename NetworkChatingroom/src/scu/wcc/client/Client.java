package scu.wcc.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket =new Socket("127.0.0.1",12345);
        System.out.println("服务器已经连接成功");
        Scanner sc =new Scanner(System.in);



        while (true){
            System.out.println("===================欢迎来到聊天室======================");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");
            System.out.println("请输入你的选择：");

            String userChoose=sc.nextLine();
            switch (userChoose){
                case "1": {
                    System.out.println("用户选择了登录");
                    login(socket);
                    break;
                }
                case "2": {
                    System.out.println("用户选择了注册");
                    register(socket);
                    break;
                }
                case "3": {
                    System.out.println("用户选择了退出");
                    break ;
                }
                default:
                    System.out.println("没有这个选项");
                    break;

            }
        }

    }

    private static void register(Socket socket) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        write2Server(bw,"register");


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append("username=").append(username).append("&password=").append(password);
        write2Server(bw,sb.toString());

        BufferedReader br = new BufferedReader( new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
        switch (message){
            case "0"-> System.out.println("当前用户名已经存在");
            case "1"-> System.out.println("用户名格式错误");
            case "2"-> System.out.println("密码格式错误");
            case "3"-> {System.out.println("注册成功");
                        new Thread(new ClientRunnable(socket)).start();
                        //开始聊天
                         talk2All(bw);}

        }


    }

    public static void login(Socket socket) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //向客户端写入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();

        //向客户端传递标识符，表示此时为登录
        write2Server(bw,"login");

        StringBuilder sb  =new StringBuilder();
        sb.append("username=").append(username).append("&password=").append(password);
        write2Server(bw,sb.toString());

        //接收服务器返回的消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
        if("1".equals(message)){
            System.out.println("登录成功");

            new Thread(new ClientRunnable(socket)).start();

            //开始聊天
            talk2All(bw);

        }else if("2".equals(message)){
            System.out.println("用户名或密码错误");
        }else{
            System.out.println("用户名不存在");
        }

    }

    private static void talk2All(BufferedWriter bw) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你要说的话：");
            String message = sc.nextLine();
            write2Server(bw,message);
            if("886".equals(message)){
                return;
            }
        }

    }

    public static void write2Server(BufferedWriter bw, String context) throws IOException {
        bw.write(context);
        bw.newLine();
        bw.flush();
    }


}
