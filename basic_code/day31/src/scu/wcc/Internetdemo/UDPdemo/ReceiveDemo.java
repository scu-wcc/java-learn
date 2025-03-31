package scu.wcc.Internetdemo.UDPdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //接收数据
        //1.创建UDP接口
        //接收端需要指定接收的端口
        DatagramSocket ds = new DatagramSocket(18888);

        //2.指定接收的容器
        byte[] bytes= new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        //3.接收数据
        ds.receive(dp);

        //4.解析接收的数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("接收到的数据："+new String(data,0,len));
        System.out.println("该数据是从"+address+"电脑的端口号:"+port+"发出的。");

        //5.释放资源
        ds.close();

    }
}
