package scu.wcc.Internetdemo.UDPdemo.chatroot;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMessage {
    public static void main(String[] args) throws IOException {
        //接收数据
        DatagramSocket ds = new DatagramSocket(18888);

        byte[] receiveByteArr = new byte[1024];
        DatagramPacket dp = new DatagramPacket(receiveByteArr,receiveByteArr.length);

        while(true){
            ds.receive(dp);

            String ip = dp.getAddress().getHostAddress();
            String name = dp.getAddress().getHostName();
            int len = dp.getLength();
            byte[] data = dp.getData();
            System.out.println("IP地址为："+ip+"的名为："+name+"电脑发来数据："+new String(data,0,len));

        }


    }
}
