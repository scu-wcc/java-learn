package scu.wcc.server;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class Server {
    public static ArrayList<Socket> list =new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(12345);

        //1.读取本地文件中的用户名和密码
        Properties prop = new Properties();
        FileReader fr = new FileReader(new File("NetworkChatingroom/userinfo.txt"));
        prop.load(fr);
        fr.close();
        //System.out.println(prop);

        //2.等待接收客户端，并为其开辟新线程
        while (true){
            Socket socket = ss.accept();
            System.out.println("客户端连接成功");

            new Thread(new ServerRunnable(socket,prop)).start();


        }

    }
}
