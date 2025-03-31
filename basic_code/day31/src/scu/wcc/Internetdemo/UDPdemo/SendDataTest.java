package scu.wcc.Internetdemo.UDPdemo;

import java.io.IOException;
import java.net.*;

public class SendDataTest {
    public static void main(String[] args) throws IOException {
        //使用UDP发送数据
        //1.创建UDP接口
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        String str = "你好啊！！";
        byte[] bytes = str.getBytes();
        int len = bytes.length;
        //指定接收的端口
        int port = 18888;
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket dp =   new DatagramPacket(bytes,len,address,port);

        //3.发送数据
        ds.send(dp);

        //4.关闭连接
        ds.close();
    }
}
