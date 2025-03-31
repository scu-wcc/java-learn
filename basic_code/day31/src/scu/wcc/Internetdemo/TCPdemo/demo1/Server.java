package scu.wcc.Internetdemo.TCPdemo.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //服务端代码
        //1.创建服务器对象,指定等待的端口
        ServerSocket ss = new ServerSocket(10000);

        //2.等待客户端申请连接
        Socket socket = ss.accept();

        //3.接收客户端数据
        //字节流会导致中文乱码，使用高级流将字节流转换成字符流
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);


        int b;
        while((b= isr.read())!=-1){
            System.out.println((char)b);
        }

        is.close();

        //断开连接
        socket.close();
        //关闭服务器
        ss.close();
    }



}
