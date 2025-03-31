package scu.wcc.Internetdemo.UDPdemo.groupdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;


public class MultiCastDemo1 {
    public static void main(String[] args) throws IOException {
        //通过组播获取数据
        MulticastSocket ms = new MulticastSocket(18888);

        //获取组播地址
        InetAddress groupAddress = InetAddress.getByName("224.0.0.1");

        //将自己加入组播中
        ms.joinGroup(groupAddress);

        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        ms.receive(dp);

        System.out.println("接收到主机名为"+dp.getAddress().getHostName()+"，地址为："+dp.getAddress().getHostAddress()+"发来的数据："+new String(dp.getData(),0,dp.getLength()));

        ms.close();
    }
}
