package scu.wcc.Internetdemo.UDPdemo.groupdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class MultiCastSend {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket();
        String str = "你好呀！！";
        byte[] bytes = str.getBytes();
        int len = bytes.length;
        InetAddress address = InetAddress.getByName("224.0.0.1");
        int port = 18888;


        DatagramPacket dp = new DatagramPacket(bytes,len,address,port);

        ms.send(dp);

        ms.close();

    }
}
