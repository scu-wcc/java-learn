package scu.wcc.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static Socket socket;
    public static BufferedWriter bw;

    private static ListerOtherThread listener; // 保存监听线程的引用
    private static Thread listenerThread;

    public static void main(String[] args) throws IOException {
        socket = new Socket("127.0.0.1", 12345);

        System.out.println("服务器连接成功");
        Scanner sc = new Scanner(System.in);
        //该客户端写出管道
        bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        loop:while (true) {
            System.out.println("==============欢迎来到黑马聊天室================\n" +
                    "1登录\n" +
                    "2注册\n" +
                    "3退出\n" +
                    "请输入您的选择：");
            String choose = sc.nextLine();
            switch (choose) {
                case "1" -> login();

                case "2" -> register();

                case "3" -> {
                    System.out.println("正在退出......");
                    write2Server("3");
                    // 先关闭监听线程（如果存在）
                    if (listener != null) {
                        listener.stop();
                        listenerThread.interrupt();
                    }
                    break loop;
                }

                default -> System.out.println("没有这个操作");


            }


        }
        try {
            if (bw != null) bw.close();
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void register() throws IOException {
        write2Server("2");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        String userLoginMessage = "username=" + name + "&password=" + password;
        write2Server(userLoginMessage);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String serverReturnMessage = br.readLine();
        switch (serverReturnMessage){
            case "0" -> System.out.println("当前用户名已存在");
            case "1" -> System.out.println("用户名或密码格式错误");
            case "2" -> {
                System.out.println("注册成功！");
                inChatRoom(sc);
            }
        }

    }

    private static void login() throws IOException {
        //状态码"1" -> 登录操作
        write2Server("1");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        String userLoginMessage = "username=" + name + "&password=" + password;
        write2Server(userLoginMessage);

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String serverReturnMessage = br.readLine();
        switch (serverReturnMessage) {
            case "0" -> System.out.println("当前用户不存在");
            case "1" -> System.out.println("当前用户名或密码错误");
            case "2" -> {
                System.out.println("登陆成功！");
                inChatRoom(sc);
            }
            case "3"-> System.out.println("当前用户已经登录");


        }

    }


    //向服务端写出操作
    public static void write2Server(String message) throws IOException {
        bw.write(message);
        bw.newLine();
        bw.flush();

    }

/*    private static void inChatRoom(Scanner sc) throws IOException {
        new Thread(new ListerOtherThread(socket)).start();
        while (true) {
            System.out.println("请输入您要说的话：");
            String message = sc.nextLine();
            write2Server(message);
            if("exit".equals(message)){
                break;
            }

        }
    }*/
private static void inChatRoom(Scanner sc) throws IOException {
    listener = new ListerOtherThread(socket);
    listenerThread = new Thread(listener);
    listenerThread.start(); // 启动监听线程

    while (true) {
        System.out.println("请输入您要说的话：");
        String message = sc.nextLine();
        write2Server(message);
        if ("exit".equals(message)) {
            break;
        }
    }

    // 停止监听线程并等待其结束
    listener.stop();
    listenerThread.interrupt(); // 中断可能阻塞的read
    try {
        listenerThread.join(1000); // 等待最多1秒
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
