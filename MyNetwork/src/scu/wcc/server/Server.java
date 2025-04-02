package scu.wcc.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class Server {
    private static Properties prop = new Properties();
    public static ArrayList<Socket> socketList =new ArrayList<>();

    public static ArrayList<String> currentUsersList =new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(12345);


        while(true){
            Socket socket = ss.accept();
            System.out.println("客户端已连接");

            //读取当前用户信息
            BufferedReader br = new BufferedReader(new FileReader(new File("MyNetwork/userInfo.txt")));
            prop.load(br);
            br.close();

            new Thread(new SingleClientThread(socket, prop)).start();


        }


    }
}
